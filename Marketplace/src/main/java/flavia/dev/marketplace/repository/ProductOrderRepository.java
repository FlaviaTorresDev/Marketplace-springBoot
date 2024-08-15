package flavia.dev.marketplace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import flavia.dev.marketplace.model.ProductOrder;


public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer> {

	List<ProductOrder> findByUserId(Integer userId);

	ProductOrder findByOrderId(String orderId);

}