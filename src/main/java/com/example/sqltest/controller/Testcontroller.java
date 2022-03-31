package com.example.sqltest.controller;

import com.example.sqltest.service.TestServivce;
import com.example.sqltest.vo.ListTest;
import com.example.sqltest.vo.Test;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class Testcontroller {


    @Autowired
    TestServivce testServivce;


    @RequestMapping("/Testfindname")
    public String findName(){
        log.info("查询成功");
        log.debug("debugTest");
        return testServivce.findname();

    }

    @RequestMapping("/Testfindnameall")
    public String findNameAll(){
        return testServivce.findNameAll();

    }

    @RequestMapping("/findBasicInformation")
    public Test findBasicInformation(){
        return testServivce.findBasicInformation();

    }

    @RequestMapping("/updatename")
    public boolean updatename(){
        Test test = new Test();
        test.setPhone("15981170942");
        test.setSex("男");
        test.setUsername("周伏雨");
        testServivce.updatename(test);
        return true;

    }

    @RequestMapping("/insertname")
    public boolean insertname(Test test){
        testServivce.insertname(test);
        return true;

    }

//    @RequestMapping("/foreachinsert")
//    public boolean foreachinsert(@RequestBody List<Test> list){
//        testServivce.foreachinsert(list);
//        return true;
//
//    }
    @PostMapping("/foreachinsert")
    public boolean foreachinsert(@RequestBody List<Test> list){
        testServivce.foreachinsert(list);
        return true;

    }

    @PostMapping("/posttest")
    public List<Test> posttest(@RequestBody List<Test> list){
        return list;

    }

    @RequestMapping("/jsontest")
    public ListTest jsontest(){
        List<Test> list = new ArrayList<>();
        Test test = new Test();
        test.setPhone("15981170942");
        test.setSex("男");
        test.setUsername("周伏雨");
        Test test2 = new Test();
        test.setPhone("15981170942");
        test.setSex("男");
        test.setUsername("王克晶");
        list.add(test);
        list.add(test2);
        ListTest listTest = new ListTest();
        listTest.setList(list);
        listTest.setName("周伏雨");
        return listTest;

    }
    @RequestMapping("/deletename")
    public boolean deletename(){
        List<Test> list = new ArrayList<>();
        Test test = new Test();
        test.setPhone("15981170942");
        test.setSex("男");
        test.setUsername("周伏雨");
        Test test2 = new Test();
        test.setPhone("15981170942");
        test.setSex("男");
        test.setUsername("王克晶");
        list.add(test);
        list.add(test2);
        testServivce.deletename(list);
        return true;

    }


}
