package service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{
    public String sayHello(String name) {
        return "dubbo+zookeeper测试，名字是"+name;
    }
}
