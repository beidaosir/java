package com.hnu.service.impl;

import com.hnu.po.Emp;
import com.hnu.mapper.EmpMapper;
import com.hnu.service.IEmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnu.vo.DeptEmpNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lee
 * @since 2023-12-17
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {

    @Autowired
    EmpMapper empMapper;

    @Override
    public Emp getById(Integer empno) {
        return empMapper.getById(empno);
    }

    @Override
    public List<DeptEmpNumber> getCountByDept() {
        return empMapper.getCountByDept();
    }
}
