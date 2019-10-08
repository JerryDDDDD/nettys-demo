# nettys-demo
netty集群解决方案-redis版本


### 技术架构
SpringBoot-2.1.5 + netty 4.1.34.Final + redis

## 集群实现思路
1. netty集群实现存在的问题:
  (1) netty各个节点之间的信道消息无法互通, 即一个netty节点无法将消息发送到另一个节点的信道中去.
  解决方案: 在netty集群的redis版本中,我们使用了redis的sub/pub,订阅发布机制, 通过在redis中规定主题的方式将netty中需要发送的信息转发到订阅看主题的netty节点中
 
