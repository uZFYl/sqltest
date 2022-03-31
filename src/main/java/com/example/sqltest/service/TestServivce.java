package com.example.sqltest.service;

import com.example.sqltest.mapper.TestMapper;
import com.example.sqltest.vo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TestServivce {

    public String findname();

    public String findNameAll();

    public Test findBasicInformation();

    void updatename(Test test);

    void deletename(List<Test> nametest);

    void insertname(Test test);

    void foreachinsert(List<Test> list);




}
