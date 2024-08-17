def newDownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}"
}
def newBuild()
{
  sh'mvn package'
}
def newDeploy(jobname,ip,appname)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/tar get/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname} .war" 
}
def newselinum(repo,jobname)
{
   git "https://github.com/intelliqittrainings/${repo}"
   sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
def newDelivery(jobname,ip,appname)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/tar get/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname} .war"
}
   
