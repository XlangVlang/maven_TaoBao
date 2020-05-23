package com.it.service;

import com.it.domain.Items;

public interface ItemsService {
    public Items findById(Integer id);

    public boolean addItems(Items item); //使用A_branch分支提交的版本
}
