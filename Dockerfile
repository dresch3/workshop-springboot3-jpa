# Usa a imagem do OpenJDK 17
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo JAR gerado para o container
COPY ./target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta 8080 (caso sua aplicação use outra porta, altere aqui)
EXPOSE 8080

# Comando para rodar o JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
