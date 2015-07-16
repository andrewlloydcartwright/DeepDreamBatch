@echo off
if exist ImageList.txt erase ImageList.txt
if exist imgscript.py erase imgscript.py
for %%i in (*.jpg) do @echo %%~ni >> ImageList.txt
javac MakeScript.java
java MakeScript
