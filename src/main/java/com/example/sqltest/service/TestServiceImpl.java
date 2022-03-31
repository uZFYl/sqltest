package com.example.sqltest.service;

import com.example.sqltest.mapper.TestMapper;
import com.example.sqltest.vo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestServivce{

    @Autowired
    TestMapper testMapper;
    @Override
    public String findname() {
       return testMapper.findName();
    }

    @Override
    public String findNameAll() {
        return testMapper.findNameAll();
    }

    @Override
    public Test findBasicInformation() {
        return testMapper.findBasicInformation();
    }

    @Override
    public void updatename(Test test) {
        testMapper.updatename(test);
    }

    @Override
    public void deletename(List<Test> nametest) {
        testMapper.deletename(nametest);
    }

    @Override
    public void insertname(Test test) {
        testMapper.insertname(test);
    }

    @Override
    public void foreachinsert(List<Test> list) {
        testMapper.foreachinsert(list);
    }
}
