#!/bin/bash

cd $HOME/Desktop

name="repoEs3"

# rm rimuove, rm fallisce sulle cartelle. rm -rf rimuove dir
rm -rf $name

#1) git init inietta il .git (il repo) dentro una cartella
git init $name
cd $name

for i in {1..3}
do
	touch f$i.txt
	git add f$i.txt
done

git status

git commit -m "Committati 3 file"
echo 
echo
git status
git log --oneline

#2) 
git checkout -b featureBranch

git log --oneline 

touch f4.txt
touch f5.txt

git add f4.txt f5.txt
git commit -m "[BRANCH] featureBranch committati 2 file"

git status
#l'ordine delle opzioni non è rilevante
git log --all --oneline

git rm f2.txt

git status
# -m=message
git commit -m "Rimosso file2"

git log --oneline --graph --all

#D)
git mv f3.txt f3-Renamed.txt

git status
git commit -m "renamed file"

git checkout main
git log --oneline --all --graph


