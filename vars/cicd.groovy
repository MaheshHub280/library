def newDownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}"
}
def newBuild()
{
  sh'mvn package'
}
def newDeploy(jobname)
{
  "/var/lib/jenkins/workspace/${jobname}"
}
def newselinum(jobname)
{
   sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}

   
