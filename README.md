===============================
🚀 WINERYSYS - WEB SERVICE SOAP
===============================

📌 **Descrição**  
Este projeto consiste no desenvolvimento de um **Web Service SOAP** utilizando **Java** com **JAX-WS**, automatizado com **Maven**, como parte do checkpoint da disciplina de **Arquitetura SOA e Web Services**. O sistema simula o gerenciamento de um estoque de vinhos, com funcionalidades de listagem de menu e realização de pedidos. O projeto inclui tanto o lado **Server (Publisher)** quanto o lado **Client (Consumer)** para consumo do serviço SOAP.

---

🛠️ **Tecnologias Utilizadas**

- Java 17  
- Maven  
- JAX-WS (Jakarta XML Web Services)  
- IntelliJ IDEA Ultimate  
- Plugin Maven `jaxws-maven-plugin`  
- Estrutura de diretórios padrão Maven  
- Web Service SOAP com WSDL gerado automaticamente  

---

📱 **Funcionalidades do Sistema**

🖥️ **Web Service Publisher**  
- Publicação do serviço SOAP na URL `http://localhost:8085/WineStockService?wsdl`  
- Operações disponíveis:  
  → `getMenu()` — retorna uma lista de vinhos disponíveis  
  → `placeOrder(String name, int quantity)` — permite realizar pedidos

🖥️ **Web Service Consumer**  
- Consumo do serviço SOAP utilizando `Service` e `getPort`  
- Geração automática de artefatos a partir do WSDL com o **plugin jaxws**  
- Teste das operações de forma programática via terminal

---

📁 **Estrutura do Projeto**

Winery/
├── Publisher/ → Projeto Maven para publicação do serviço
│ ├── src/main/java/
│ │ └── br/com/fiap/winery/
│ │ ├── WineStockService.java
│ │ ├── WineStockServiceImpl.java
│ │ └── WineStockServicePublisher.java
│ └── pom.xml
│
├── Consumer/ → Projeto Maven para consumo do serviço
│ ├── src/main/java/
│ │ └── br/com/fiap/winery/
│ │ └── ApplicationClient1.java
│ └── pom.xml
│
└── README.md → Documentação do projeto

---

▶️ **Como Executar o Projeto**

### **1. Publisher (Servidor SOAP)**

1. Acesse a pasta do Publisher:
   ```bash
   cd Winery/Publisher
   
2. Compile o projeto:
  ```bash
    mvn clean compile
  ```
3. Execute a publicação do serviço:
  ```bash
    mvn exec:java -Dexec.mainClass="br.com.fiap.winery.WineStockServicePublisher"
  ```
4. Verifique no navegador:

➡️ http://localhost:8085/WineStockService?wsdl
→ Deve exibir o WSDL gerado automaticamente.


2. Consumer (Cliente SOAP)

1. Acesse a pasta do Consumer:
```bash
  cd Winery/Consumer
```
2. Gere os artefatos a partir do WSDL:
(se configurado no pom.xml, apenas execute)
```bash
  mvn generate-sources
```
3. Compile o projeto:
```bash
  mvn clean compile
```
4. Execute a aplicação cliente:
```bash
  mvn exec:java -Dexec.mainClass="br.com.fiap.winery.ApplicationClient1"
```
📦 Dependências Importantes
<dependency>
    <groupId>com.sun.xml.ws</groupId>
    <artifactId>jaxws-rt</artifactId>
    <version>3.0.3</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.ws</groupId>
    <artifactId>jaxws-maven-plugin</artifactId>
    <version>4.0.3</version>
</dependency>

👨‍💻 Autores

Eduardo de Oliveira Nistal — RM94524
Enzo Vazquez Sartorelli — RM94618
Kaue Pastori — RM98501
Nicolas Nogueira Boni — RM551965
Rodrigo Viana — RM551057

📚 Observações Finais

Projeto acadêmico com fins exclusivamente educativos.
O Web Service é executado localmente, simulando um sistema de gerenciamento de estoque de vinhos.
Ideal para reforçar o aprendizado sobre Arquitetura SOA, Web Services SOAP e uso de WSDL.
Estrutura profissional com automação via Maven e geração automática de artefatos cliente.

🗓️ Última atualização: 27/05/2025
