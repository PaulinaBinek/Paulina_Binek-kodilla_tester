del build/libs/*.jar
call gradlew build
if exist build/libs/*.jar copy project
else echo Compile error. File doesn't exist.
