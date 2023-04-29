#!/bin/bash

URL="http://localhost:80"

CODE=$(curl --silent --output /dev/null --write-out '%{http_code}' $URL)

while (true)
do
	if [[ $CODE -lt 200 || $CODE -ge 400 ]]; then
  	echo "$(date '+%Y-%m-%d %H:%M:%S') - Response code is $CODE" >> /var/log/check.log
	fi
	sleep 30
done
