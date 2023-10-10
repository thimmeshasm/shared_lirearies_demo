def docker_push(user,pass,image,repo){
  sh "docker login -u ${user} -p ${pass}"
  sh "docker pull ${image}"
  sh "docker tag ${image} ${repo}/${image}"
  sh "docker login -u ${user} -p ${pass}"
  sh "docker push ${repo}/${image}"
}
