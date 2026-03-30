# Étape 1 : Choisir une image de base Java stable et légère
# On utilise Eclipse Temurin qui est la recommandation officielle actuelle
FROM eclipse-temurin:17-jdk-jammy

# Étape 2 : Définir le répertoire de travail à l'intérieur du conteneur
WORKDIR /app

# Étape 3 : Copier le fichier JAR qui est généré avec Maven

COPY target/springdocker-0.0.1-SNAPSHOT.jar app.jar

# Étape 4 : Informer Docker que l'application écoute sur le port 8080
EXPOSE 8080

# Étape 5 : Lancer l'application au démarrage du conteneur
ENTRYPOINT ["java", "-jar", "app.jar"]