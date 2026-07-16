def call(String imageName, String tag = "latest") {

    echo "Building Docker Image..."

    sh """
        docker build -t ${imageName}:${tag} .
    """

    echo "Docker Image Built Successfully"

}
