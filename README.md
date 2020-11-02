# **TCS**

The plugin for the TCS Minecraft 1.16.X server.

## Dev setup
1. Clone the repo
2. Install Java 8 JDK
3. On Windows, create a batch file and paste the following:
```shell script
@echo off
IF NOT EXIST BuildTools (
    mkdir BuildTools
)
cd BuildTools
curl -z BuildTools.jar -o BuildTools.jar https://hub.spigotmc.org/jenkins/job/BuildTools/lastSuccessfulBuild/artifact/target/BuildTools.jar
java -jar BuildTools.jar --rev latest
pause
```
3.5. If you're on Linux I'm sure you can figure out how to do it
3. Run it and wait till it's done
4. In your IDE project, add BuildTools\Spigot\Spigot-API\target\spigot-api-1.16.X-RX.X-SNAPSHOT.jar as a library