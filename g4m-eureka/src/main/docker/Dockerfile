FROM java:latest
ADD g4m-eureka-1.0.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT["java","-jar","/app.jar"]