def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}

def newDeployment(job,ip,context)
{
  
}
