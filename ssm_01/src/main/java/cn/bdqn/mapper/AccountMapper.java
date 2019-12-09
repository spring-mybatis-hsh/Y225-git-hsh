package cn.bdqn.mapper;

import cn.bdqn.domain.account;

import java.util.List;

public interface AccountMapper {


    //查询所有信息
    public List<account> queryAll();


    //新增信息
    public void AddAccount();

}
