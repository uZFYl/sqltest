package com.example.sqltest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sqltest.vo.ListTest;
import com.example.sqltest.vo.Test;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper<T> extends BaseMapper<Test> {

    String findName();

    @Select("select username from user where id=1")
    String findNameAll();

    Test findBasicInformation();

    void updatename(Test test);

    void deletename(List<Test> nametest);

    void insertname(Test test);

    void foreachinsert(List<Test> list);

}
