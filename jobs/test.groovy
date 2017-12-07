project_name = "test-david"
repo = "https://github.com/suaveyosi/test-jenkins-1.git"
repo_name = "test-jenkins-1"

pipelineJob(project_name) {
    definition {
	triggers{
	   scm('* * * * *')
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
