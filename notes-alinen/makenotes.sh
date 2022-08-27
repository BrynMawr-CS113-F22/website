#! /bin/bash

for d in sep05 sep12 sep19 sep26 oct03 oct17 oct24 oct31 nov07 nov14 nov21 nov28 dec05
  do echo $d 
  cp notes-aug29.adoc notes-$d.adoc
  sed -i "s/Aug 29/$d/" notes-$d.adoc
done
