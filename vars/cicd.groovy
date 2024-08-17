def newDownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}"
}
def newBuild()
{
  sh'mvn package'
}
def newDeployment(jobname,ip,contextpath)
{
   deploy "adapters: [tomcat9(credentialsId: '1289cb85-308b-4fb8-b93b-440eab01cfc4',/var/lib/jenkins/workspace/${jobname},${ip})], contextPath:${contextpath}, war: '**/*.war"
}
def newselinum(repo,jobname)
{
   git "https://github.com/intelliqittrainings/${repo}"
   sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
def newDelivery(jobname,ip,contextpath)
{
  deploy "adapters: [tomcat9(credentialsId: '1289cb85-308b-4fb8-b93b-440eab01cfc4', /var/lib/jenkins/workspace/${jobname},${ip})], contextPath:${contextpath}, war: '**/*.war"
}
