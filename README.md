Author: 	Andrew Cartwright
Date:		7/12/2015

The purpose of these scripts are to batch process DeepDream images using VirtualBox and the Vagrant environments.

Place these files in the same directory as your images and the dreamify.py script (C:\HashiCorp\Vagrant\bin\image-dreamer).
Name your images with numerical names only, such as "0287.jpg".

The file to be run is "ImageList.bat". This batch file sorts through the folder, targeting only the jpgs. It parses out the ".jpg" from the filename, and then
writes the remainder of the filename out to a text file, "ImageList.txt".

It then calls "MakeScript.java", which then inputs the text file, and reads through it. It creates and writes to a python script, "imgscript.py", which can either
be run in powershell when you have ssh'd into Vagrant OR you can copy and paste them in if that does not work.

For any further inquiries or comments please email andrewlloydcartwright@gmail.com with the subject "GitHub DDbatch".
