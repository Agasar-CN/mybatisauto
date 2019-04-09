package top.agasar.mybatisauto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.agasar.mybatisauto.dao.StuMapper;
import top.agasar.mybatisauto.model.Stu;

@RestController
public class Hello {

    @Autowired
    private StuMapper stuMapper;
    @RequestMapping(value="hello",method = RequestMethod.POST)
    public String hello(int id,String name,int age){
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        Stu stu=new Stu();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stuMapper.insert(stu);
        return "OK";
    }
}
