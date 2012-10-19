A workaround for using cucumber with sonar. 

1. Instead of using @Cucumber using @CucumberWithSonar

2. Disable xml report generation for maven-surefire-plugin (disableXmlReport). See pom.xml

3. The surefire reports directory should be target/surefire-reports(which is the default)
