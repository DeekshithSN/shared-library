
def call(String mvnaction) {
    
       if ("${mvnaction}" == "Clean")
                    {
                    sh "mvn clean"
                    }
              else if ("${mvnaction}" == "Compile")
                    {
                    sh "mvn clean compile"
                    }
               else if ("${mvnaction}" == "Test")
                    {
                    sh "mvn clean test"
                    }
                 else if ("${mvnaction}" == "Install")
                    {
                    sh "mvn clean install"
                    }

}
