FROM ubuntu:latest

RUN apt-get update && apt-get install -y curl

COPY check.sh /usr/local/bin/

RUN chmod +x /usr/local/bin/check.sh

CMD ["check.sh"]
