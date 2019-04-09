package top.agasar.mybatisauto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("top.agasar.mybatisauto.dao")
@SpringBootApplication
public class MybatisautoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisautoApplication.class, args);
    }

}
