#!/bin/sh -xeu

JMX_OPTS="-Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=0 -Dcom.sun.management.jmxremote.local.only=false -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=172.16.10.67"
JAVA_OPTS="-Djava.util.logging.config.file=logging.config"

java $JAVA_OPTS $JMX_OPTS -jar target/dynjmxport-0.0.1-SNAPSHOT.jar server
