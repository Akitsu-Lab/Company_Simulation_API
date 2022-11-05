package com.akitsulab.company_simulation_api.repository;

import com.akitsulab.company_simulation_api.domain.Employee;
import com.akitsulab.company_simulation_api.repository.mybatis.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    private static final Logger logger = LoggerFactory.getLogger(EmployeeRepositoryImpl.class);
    private final SqlSession sqlSession;

    public EmployeeRepositoryImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Employee> findList() {
        logger.info("リスト表示成功");
        return this.sqlSession.getMapper(EmployeeMapper.class).find();
    }

    @Override
    public Employee findOne(long id) {
        return null;
    }

    @Override
    public Employee lock(long id) {
        return null;
    }
}
