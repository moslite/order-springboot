package com.myspring.order.repositories;

import com.myspring.order.entities.OrderItem;
import com.myspring.order.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {


}
