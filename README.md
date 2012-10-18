sonar-test
==========

A test project that shows the problem with Cucumber and Sonar test coverage reports.  Try 
starting Sonar and then running:

    mvn clean verify sonar:sonar

and you should see the error.

Also see:
 https://github.com/cucumber/cucumber-jvm/issues/322

Possible fix I haven't tried yet:
 https://github.com/pettermahlen/cucumber-jvm/tree/cucumber-jvm-322
