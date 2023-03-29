package com.app.raghu.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.raghu.entity.Cart;

@FeignClient("CART-SERVICE")
public interface CartConsumerFeign 
{
	@GetMapping("/cart/info")
	public ResponseEntity<String> showMessage();
	
	@GetMapping("/cart/find/{id}")
	public ResponseEntity<Cart> getCartById(@PathVariable("id")Integer id);
}
