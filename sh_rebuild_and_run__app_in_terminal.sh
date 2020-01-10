wmic Path win32_process Where "CommandLine Like '%.jar%'" Call Terminate
mvn clean
mvn package
cd target && fName=$(find -type f -name '*.jar')
echo 'FIND APP JAR FILE' $fName
java -jar $fName $SHELL
