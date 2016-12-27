package com.github.carter659.spring06;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 博客出处：http://www.cnblogs.com/GoodHelper/
 * 
 * @author 刘冬
 *
 */
public interface OrderRepository extends JpaRepository<Order, String> {

}
