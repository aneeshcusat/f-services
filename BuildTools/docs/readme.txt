Initial Setup
-------------
Create the schema and change log table -- > Files are located in BuildTools/scipts

Build
-----
goto the project root folder and run below the command, which will automatically configure gradle.
>gradlew.bat\gradlew clean build war tomcatRun

OR

if gradle is installed and configured run below the command.
>gradle clean build war tomcatRun 

Eclipse configure
---------------
>gradle eclipse or gradlew eclipse

Test
----
open browser and hit http://localhost:8080 for the home pages
http://localhost:8080/rest/* for rest services