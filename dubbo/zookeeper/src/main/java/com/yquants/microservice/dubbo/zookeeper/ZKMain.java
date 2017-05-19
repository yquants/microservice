package com.yquants.microservice.dubbo.zookeeper;

import org.apache.zookeeper.server.ServerConfig;
import org.apache.zookeeper.server.ZooKeeperServerMain;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Wei on 2017/5/19.
 */
public class ZKMain {
    public static void main(String... args) throws IOException, QuorumPeerConfig.ConfigException{
        ZooKeeperServerMain server = new ZooKeeperServerMain();

        QuorumPeerConfig quorumConfiguration = new QuorumPeerConfig();
        quorumConfiguration.parse("D:/programming/github/microservice/dubbo/zookeeper/src/main/resources/zkconfig.cfg");
        final ServerConfig config = new ServerConfig();
        config.readFrom(quorumConfiguration);
        server.runFromConfig(config);
    }
}
