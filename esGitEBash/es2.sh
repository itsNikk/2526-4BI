#!/bin/bash

cd $HOME/Desktop

#1) git init
rm -rf multiRepo
git init multiRepo

cd multiRepo

#3) Estrai N random? da riga di comando? da utene? YOUR CHOICE
N=10

for index in $(seq 1 $N)
do
	touch f$index.txt
	
	git add f$index.txt
	git commit -m "file $index committato su main"
done

git log --oneline


for branch in {1..3}
do
	git checkout -b feature$branch
	touch littleFile$branch.md
	git add littleFile$branch.md
	git commit -m "Committato littleFile$branch.md in branch feature$branch"
	git checkout master
done

#metto echo a vuoto solo per creare spazio
echo
echo
git status
echo
git log --oneline --all --graph
