# Reids Monitor
可以对集群环境的redis中正在执行的命令进行监控。  

1.支持log4j日志输出  
2.支持自定义输出类型  
3.支持对指定机器的监控，包括master或者salver  

The commands that are being executed in the redis of the cluster environment can be monitored.  

1. support log4j log output  
2. support custom output types  
3. support the monitoring of a specified machine, including master or salver  

java -jar CLASS <address[host:port,host:port......]  
java -jar RedisMonitor.jar master:7001,slaver:7001 

output:  
2018-03-20 15:35:55 [Thread-9] - node1:7000--1521531334.966951 [0 10.240.47.187:36306] "GET" "5_upload_redis_process_offset"   
2018-03-20 15:35:55 [Thread-4] - 10.240.47.188:7000--1521531334.966951 [0 10.240.47.187:36306] "GET" "5_upload_redis_process_offset"   
2018-03-20 15:35:55 [Thread-1] - node2:7000--1521531355.360183 [0 10.240.47.188:27798] "RPOP" "5_upload_mission_key"   
2018-03-20 15:35:55 [Thread-11] - 10.240.47.189:7000--1521531355.360183 [0 10.240.47.188:27798] "RPOP" "5_upload_mission_key"   
2018-03-20 15:35:57 [Thread-1] - node2:7000--1521531357.650564 [0 10.240.47.187:31106] "RPOP" "5_upload_mission_key"   
2018-03-20 15:35:57 [Thread-11] - 10.240.47.189:7000--1521531357.650564 [0 10.240.47.187:31106] "RPOP" "5_upload_mission_key"   
2018-03-20 15:36:00 [Thread-11] - 10.240.47.189:7000--1521531360.360646 [0 10.240.47.188:27798] "RPOP" "5_upload_mission_key"   
2018-03-20 15:36:00 [Thread-1] - node2:7000--1521531360.360646 [0 10.240.47.188:27798] "RPOP" "5_upload_mission_key"   
2018-03-20 15:36:02 [Thread-1] - node2:7000--1521531362.651219 [0 10.240.47.187:31106] "RPOP" "5_upload_mission_key"   
2018-03-20 15:36:02 [Thread-11] - 10.240.47.189:7000--1521531362.651219 [0 10.240.47.187:31106] "RPOP" "5_upload_mission_key"   
2018-03-20 15:36:05 [Thread-1] - node2:7000--1521531365.361205 [0 10.240.47.188:27798] "RPOP" "5_upload_mission_key"    
2018-03-20 15:36:05 [Thread-11] - 10.240.47.189:7000--1521531365.361205 [0 10.240.47.188:27798] "RPOP" "5_upload_mission_key"    
