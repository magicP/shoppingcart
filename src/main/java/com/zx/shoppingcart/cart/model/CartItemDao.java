package com.zx.shoppingcart.cart.model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemDao extends CrudRepository<CartItem,Long> {
    CartItem getById(long id);
    List<CartItem> findAll();
    CartItem save(CartItem item);
    void delete(CartItem item);
}

