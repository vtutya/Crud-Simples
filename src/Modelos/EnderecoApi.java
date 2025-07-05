package Modelos;

public record EnderecoApi(String cep, String logadouro, String bairro, String complemento) {



    @Override
    public String toString() {
        return "EnderecoApi{" +
                "cep='" + cep + '\'' +
                ", logadouro='" + logadouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
