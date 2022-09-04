def gitStatus(branch){
  git branch: "${branch}", credentialsId: 'gitCred', url: 'https://github.com/Siddeshg672/hello_world_public_war.git'
  sh "mvn clean install"
  sh "cp -R webapp/target/webapp.war ."
}
