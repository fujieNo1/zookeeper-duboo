package service.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-demo-provider.xml");
        System.out.println("注册服务成功");
        context.start();
        try {
            System.in.read(); // press any key to exit
        } catch (IOException e) {
            e.printStackTrace();
        }
        context.close();
    }
}
