This is a simple Minecraft mod to help you get started modding. It adds a piece of bread and a slice of cheese and lets you craft a cheese sandwich.

Building the mod:
-----------------
From the mod directory run:
windows: gradlew build
linux: ./gradlew build

After gradle downloads many dependencies, the mod jar file will be created in the build/libs directory


Steps to get started modding from scratch
----------------------------------------
1) Install jdk 8
2) Download forge mdk
3) Unzip forge mdk into a directory with the mod name
4) cd to the directory with the mod name and run:

windows: gradlew setupDecompWorkspace eclipse
linux: ./gradlew setupDecompWorkspace eclipse

5) Download Eclipse 
6) Open workspace at mod dir
7) You should be able to run the mod in normal or debug mode (the green play icon in the top bar in Eclipse)

Programming:
------------

Change the main mod class (in this case SandwichMod, or ExampleMod if you are using the raw forge MCP zip file)
Add common and client 'sided' proxies (client side proxy is need to to initialise our mod items in the ModItems class)
Add life-cycle events (to forward life-cycle events to our proxies)
Create item classes and add them to the ModItems class
Create the items resources (image files, JSON data and localised names) in the resources package 

See: This tutorial for explicit steps to set up your environment and add an items
https://www.youtube.com/watch?v=ZxuMrRPbS6g
https://www.youtube.com/watch?v=bfyw036pyq0
https://www.youtube.com/watch?v=SxZOw7UWJLM