package com.ecommerce.service;

import com.ecommerce.dto.CartRequest;
import com.ecommerce.model.*;
import com.ecommerce.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepo;

    @Autowired
    private CartItemRepository itemRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ProductRepository productRepo;

    public Cart add(CartRequest req){

        User user = userRepo.findById(req.getUserId()).orElseThrow();
        Product product = productRepo.findById(req.getProductId()).orElseThrow();

        Cart cart = new Cart();
        cart.setUser(user);
        cartRepo.save(cart);

        CartItem item = new CartItem();
        item.setCart(cart);
        item.setProduct(product);
        item.setQuantity(req.getQuantity());

        itemRepo.save(item);
        return cart;
    }
}
