# Estágio 1: Compilação do projeto com Maven e Java 21
FROM maven:3.9-eclipse-temurin-21-alpine AS build
WORKDIR /app

# Copia dependências e código fonte
COPY pom.xml .
COPY src ./src

# Compila o arquivo .jar pulando testes
RUN mvn clean package -DskipTests

# Estágio 2: Imagem leve de execução com JRE 21
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Copia apenas o .jar gerado do estágio anterior
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENV PORT=8080

ENTRYPOINT ["java", "-jar", "app.jar"]
