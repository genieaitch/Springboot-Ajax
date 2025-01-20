package com.kht.ecommerce.ecommerce_application.controller;

import com.kht.ecommerce.ecommerce_application.dto.Cart;
import com.kht.ecommerce.ecommerce_application.dto.Product;
import com.kht.ecommerce.ecommerce_application.dto.User;
import com.kht.ecommerce.ecommerce_application.service.*;
import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class ApiController {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private ProductServiceImpl productService;
    @Autowired
    private CartServiceImpl cartService;


    // 사용자 목록 API
    @GetMapping("/api/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    // 상품 목록 API
    @GetMapping("/api/products")
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    // 특정 사용자의 장바구니 API
    // http://localhost:8080/api/carts?userId=1
    @GetMapping("/api/carts")
    public List<Cart> getCart(@RequestParam("userId") int userId) {
        return cartService.getCartByUserId(userId);
    }

    /*
    There was an unexpected error (type=Internal Server Error, status=500).
    Expected one result (or null) to be returned by selectOne(), but found: 3
    */


    /*
    Param = 파라미터 = 매개변수
    @RequestParam 부분적으로 저장할 때 사용
    @RequestBody 전체적으로 저장할 때 사용
    */
    @PostMapping("/api/join")
    public void join(@RequestBody User user) {
        log.info("join user: {}", user);
        userService.insertUser(user);
    }

    @GetMapping("/api/existEmail")
    public boolean existEmail(@RequestParam("email") String email) {
        /*
        앞으로 아래와 같은 기능은 서비스 Impl에서 작성할 것
        boolean exist = userService.existByEmail(email);
        Map<String, Object> map = new HashMap<>();
        map.put("exist", exist);

        if (exist) {
            map.put("msg", "이미 사용 중인 이메일 입니다.");
        } else {
            map.put("msg", "사용 가능한 이메일입니다.");
        }
        return map; */
        return userService.existByEmail(email); //결과를 html true false로 전달
    }

    @PostMapping("/api/products")
    public void addProduct(@RequestBody Product product) {
        log.info("add product: {}", product);
        productService.addProduct(product);
    }


    @GetMapping("/api/user/{id}")
    public void apiProductById(@RequestBody User user) {
        log.info("api user: {}", user);
        userService.insertUser(user);
    }
    @GetMapping("/api/product/{id}")
    public void apiProductById(@RequestParam int id) {
        log.info("api product: {}", id);
    }


}