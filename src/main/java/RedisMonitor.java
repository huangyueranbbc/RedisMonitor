import com.hyr.redis.RedisClusterProxy;
import com.hyr.redis.RedisClusterUtils;

/*******************************************************************************
 * @date 2018-03-20 上午 11:14
 * @author: <a href=mailto:huangyr@bonree.com>黄跃然</a>
 * @Description: redis集群环境监控
 ******************************************************************************/
public class RedisMonitor {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("java -jar CLASS <address[host:port,host:port......]>");
            return;
        }
        String address = args[0];
        RedisClusterProxy jedisCluster = RedisClusterUtils.getRedisClusterInstance(address);
        RedisClusterUtils.monitor(jedisCluster, 10000000);
    }

}
