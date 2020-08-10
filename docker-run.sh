experiment=$1
LIMIT=$2
# IFS=$'\n'
# Stop the container from previous experiments
docker stop exrunner-container
# Remove old containers
docker rm exrunner-container
# Remove previous docker image
docker rmi tudelft/exrunner
# Build a new docker image
docker image build -t tudelft/exrunner $(pwd)
# Execution
# After building the the image, we run the container
docker run -dit --name exrunner-container  \
--mount type=bind,source="$(pwd)/$experiment",target=/reproduction/$experiment \
--mount type=bind,source="$(pwd)/crashes",target=/reproduction/crashes \
--mount type=bind,source="$(pwd)/bins",target=/reproduction/bins \
tudelft/exrunner
# Execute main.sh in the running container
 docker exec -it exrunner-container bash -c "cd $experiment; bash main.sh $LIMIT > consoleLog/consoleOut.txt 2> consoleLog/consoleErr.txt"
echo "Done!"