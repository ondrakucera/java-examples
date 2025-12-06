# Automatic formatting of Java files

The idea is to work with Java files in a way as similar as when using Prettier + ESLint + their IDE plugins on
JavaScript files:

* To check that everything is properly formatted, run `./mvnw spotless:check`.
    - Note that formatting is also checked when `./mvnw verify` is run.
* To apply proper formatting to all files, run `./mvnw spotless:apply`.
* Spotless uses configuration in `.spotless/eclipse-java-formatter.xml`.
* In order for IDEA to use the same formatting, you need to
  install [Adapter for Eclipse Code Formatter](https://plugins.jetbrains.com/plugin/6546-adapter-for-eclipse-code-formatter).
    - After installation, you need to enable it and tell it to use `.spotless/eclipse-java-formatter.xml` as its
      configuration file.
* Unfortunately, there's no way to make IDEA show formatting violations during writing of code (in the way the ESLint
  plugin does it). The best way to make sure files are always properly formatted without having to run
  `./mvnw spotless:check` is to go to _Tools → Actions on Save_ and check _Reformat code_.
