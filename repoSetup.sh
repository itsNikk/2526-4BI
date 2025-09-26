#!/bin/bash

#1) creare repo su Desktop
cd $HOME/Desktop

#2) creare repo
rm -rf repoEs1
git init repoEs1
cd repoEs1

#3) Creare 3 file .md e 10 file .txt
for i in {1..10} #$(seq 1 10)
do
	touch f$i.txt
done

for i in $(seq 1 3)
do
	touch mgn$i.md
done
