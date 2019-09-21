#!/usr/bin/env bash

root=`pwd`

echo "路径是："$root


jars="$root/lib/*"

conf="$root/conf/"

all_dependencys=$conf":"$jars

echo "所有的依赖："$all_dependencys


java -cp $all_dependencys com.dong.Slf4jCase

