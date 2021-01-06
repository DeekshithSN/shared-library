def call() {


  def getDockerTag(){
        def tag = sh script: 'git rev-parse HEAD', returnStdout: true
        return tag
        }
        
  sh 'docker build . -t deekshithsn/devops-training:$Docker_tag'
		   withCredentials([string(credentialsId: 'docker_password', variable: 'docker_password')]) {
				    
				  sh 'docker login -u deekshithsn -p $docker_password'
				  sh 'docker push deekshithsn/devops-training:$Docker_tag'
			}
}
