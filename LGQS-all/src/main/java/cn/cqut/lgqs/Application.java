package cn.cqut.lgqs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author CuriT
 */
@SpringBootApplication(scanBasePackages = {"cn.cqut.lgqs"})
@MapperScan("cn.cqut.lgqs.db.dao")
@EnableTransactionManagement
@EnableScheduling
public class Application {

    public static void main(String[] args) {
        System.out.println("5.30 登录服务");
        System.out.println("5.30 登录服务");
        System.out.println("6.5  管理后台统计功能 ");
        System.out.println("6.5  微信前台搜索功能 ");
        System.out.println("6.10  管理后台用户管理功能");
        System.out.println("6.10  微信前台查看菜品功能");
        System.out.println("6.15  微信前台下单支付功能");
        System.out.println("6.15  管理后台类目管理功能");
        System.out.println("6.20  管理后台菜品管理功能");
        System.out.println("6.20  微信前台订单操作功能");
        SpringApplication.run(Application.class, args);
    }

}