package com.springbootdatajpa.datajpa.models.dao;

import com.springbootdatajpa.datajpa.models.entity.Cliente;

import java.util.List;

public interface IClienteDao {

    public List<Cliente> findAll();

    public void save(Cliente cliente);
}
