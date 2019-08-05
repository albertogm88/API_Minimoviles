package com.minimoviles.service;

import com.minimoviles.entidades.BerryAppMenuItem;
import com.minimoviles.repositorio.MenuRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {


    @Autowired
    private MenuRepositorio menuRepositorio;

    public Iterable<BerryAppMenuItem> findAll() {
        return this.menuRepositorio.findAll();
    }
    
    public Iterable<BerryAppMenuItem> getMenuByIdWeb(Integer id) {
        return this.menuRepositorio.getMenuByIdWeb(id);
    }

    public Iterable<BerryAppMenuItem> getMenuByIdMenu(Integer id) {
        return this.menuRepositorio.getMenuByIdMenu(id);
    }
}