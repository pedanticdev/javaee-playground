FROM airhacks/glassfish
COPY ./target/javaee-playground.war ${DEPLOYMENT_DIR}
