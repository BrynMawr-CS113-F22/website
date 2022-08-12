#! /bin/bash

asciidoctor *.adoc logs/*.adoc
git add .
git status
git commit -m "update website"
git push
