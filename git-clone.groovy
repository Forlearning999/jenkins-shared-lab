def call(String repoUrl, String branch = "main") {

    echo "Cloning repository: ${repoUrl}"
    echo "Branch: ${branch}"

    git(
        branch: branch,
        url: repoUrl
    )

}
