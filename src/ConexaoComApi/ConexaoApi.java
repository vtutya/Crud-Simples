package ConexaoComApi;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import Modelos.EnderecoApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexaoApi {

    public void buscarEndereco(String cep){

        String enderecoApi = "https://viacep.com.br/ws/" + cep + "/json";

        try {


            HttpClient client = HttpClient.newHttpClient();



            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(enderecoApi)).
                    GET().
                    build();



            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();



            Gson gson = new GsonBuilder().
                    setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();



            EnderecoApi enderecoApi1 = gson.fromJson(json, EnderecoApi.class);
            System.out.println("Endereço convertido: " + enderecoApi1.toString());


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
