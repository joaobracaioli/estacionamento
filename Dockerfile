FROM ghcr.io/graalvm/graalvm-ce:java11-21.0.0.2

COPY build/libs/estacionamento-kotlin-*.jar estacionamento-kotlin.jar
ADD run.sh /

EXPOSE 8080

ENTRYPOINT ["/run.sh"]