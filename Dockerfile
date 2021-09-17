# Pull the code from git repo
FROM alpine/git as clone
WORKDIR /app
RUN git clone https://github.com/RakshitPSJ/edd.git

# Add maven to the project
FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY --from=clone /app/edd /app

# Creating jar file of project by doing install build stage of maven
RUN mvn install -DskipTests


# ADDING JDK TO PROJECT AND COPYING JAR FILE WHICH CREATED WHILE BUILDING PROJECT AND
FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/target/edd-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","edd-0.0.1-SNAPSHOT.jar"]
