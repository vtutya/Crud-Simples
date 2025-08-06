📌 Crud-Simples
Aplicação desenvolvida em Java 17, com foco em demonstrar conceitos fundamentais de programação orientada a objetos e persistência de dados.
O projeto implementa um CRUD de clientes com integração a uma API externa para consulta de endereços via CEP.

🚀 Conceitos Aplicados
Programação Orientada a Objetos (POO)

° Modelagem de entidades (Cliente, EnderecoApi)

° Encapsulamento e organização em pacotes (Modelos, Servicos)

° Persistência de Dados

° Salvamento e leitura em arquivo CSV (clientes.csv)

° Integração com API Externa

° Consumo da API ViaCEP utilizando HttpURLConnection

° Arquitetura em Camadas

° Modelos: entidades e representações de dados

° Serviços: regras de negócio e operações CRUD

° Conexão: integração com API externa

📂 Estrutura
src/
├── ConexaoComApi/      # Consumo de API ViaCEP
├── Modelos/            # Classes de domínio
└── Servicos/           # Lógica de negócio (CRUD e CSV)

📖 Funcionalidades
° Cadastro de clientes com endereço via CEP

° Edição e listagem de registros

° Persistência local em arquivo CSV

Projeto prático que demonstra domínio em Java POO, persistência de dados em arquivos, organização modular e consumo de API REST.

