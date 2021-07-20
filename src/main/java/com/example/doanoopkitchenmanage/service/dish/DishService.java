package com.example.doanoopkitchenmanage.service.dish;

import com.example.doanoopkitchenmanage.model.Dish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DishService {
    Page<Dish> findAll(Pageable pageable);
}
