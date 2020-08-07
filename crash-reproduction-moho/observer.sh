pid=$1
filename=$2
Timeout=300 # 5 minutes
sleep "$Timeout"

stopLoop=0
while [ "$stopLoop" -eq 0 ]; do
  modifiedTime=$(date -r "logs/$filename" "+%s")
  currentTime=$(date "+%s")
  inActiveTime=$((currentTime-modifiedTime))
  echo $inActiveTime
  if [[ "$inActiveTime" -gt "60" ]]; then
    kill "$pid"
    echo "killing process $pid"
    stopLoop=1
  fi
  sleep 100
done
