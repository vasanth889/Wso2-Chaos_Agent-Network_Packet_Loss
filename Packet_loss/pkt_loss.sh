echo "show default rules "
tc qdisc show  dev wlp4s0

sleep 5
echo "applying a 10% packet loss"
sudo tc qdisc add dev wlp4s0 root netem loss 10%

sleep 5
echo "show active rules"
tc qdisc show  dev wlp4s0

sleep 5

echo "delete all rules"
sudo tc qdisc del dev wlp4s0 root

sleep 5

echo "show rules"
tc qdisc show  dev wlp4s0
