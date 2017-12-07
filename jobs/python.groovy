project_name = "jenkins-pipeline-python"
repo = "https://github.com/suaveyosi/test-jenkins-1.git"
repo_name = "test-jenkins-1"

pipelineJob(project_name) {
    definition {
	triggers{
	   scm('H/15 * * * *')
        }

	cpsScm{
	    scm {
		git {
		    remote {
		       name(repo_name)
                       url(repo)
                    }

		}
		scriptPath("Jenkinsfile")
	    }
	}

    }
}
