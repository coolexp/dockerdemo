# dockerdemo

Ubutun开启docker:

```
sudo nano /lib/systemd/system/docker.service
```

添加内容如下：

```
 ExecStart=/usr/bin/dockerd -H fd:// --containerd=/run/containerd/containerd.sock -H tcp://0.0.0.0:2375
```

重启: 

``` 
 systemctl daemon-reload sudo service docker restart
```

打包: 项目目录下执行: 

```
mvn clean package docker:build
```

登陆docker宿主机: Run: 

```
sudo docker run -d -p 8081:8080 dockerdemo
```

