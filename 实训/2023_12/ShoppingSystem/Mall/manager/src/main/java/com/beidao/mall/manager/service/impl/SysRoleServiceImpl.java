package com.beidao.mall.manager.service.impl;

import com.beidao.mall.manager.mapper.SysRoleMapper;
import com.beidao.mall.manager.service.SysRoleService;
import com.beidao.mall.model.dto.system.SysRoleDto;
import com.beidao.mall.model.entity.system.SysRole;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    //角色列表方法，分页查询
    @Override
    public PageInfo<SysRole> findByPage(SysRoleDto sysRoleDto, Integer current, Integer limit) {

        //设置分页相关参数  加入当前页和 每页展示记录数
        PageHelper.startPage(current,limit);

        //根据条件查询数据库 调用mapper层查询数据
        List<SysRole> list = sysRoleMapper.findByPage(sysRoleDto);

        //封装pageInfo 返回每页数据
        PageInfo<SysRole> pageInfo = new PageInfo<>(list);

        return pageInfo;
    }

    //2.角色添加方法
    @Override
    public void saveSysRole(SysRole sysRole) {
        sysRoleMapper.save(sysRole);
    }
}
