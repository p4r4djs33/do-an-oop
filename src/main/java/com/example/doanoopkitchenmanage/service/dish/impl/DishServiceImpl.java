package com.example.doanoopkitchenmanage.service.dish.impl;

import com.example.doanoopkitchenmanage.model.Dish;
import com.example.doanoopkitchenmanage.repository.DishRepository;
import com.example.doanoopkitchenmanage.service.dish.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class DishServiceImpl implements DishService {
    @Autowired
    DishRepository dishRepository;

    @Override
    public Page<Dish> findAll(Pageable pageable) {
        return dishRepository.findAll(pageable);
    }
}
