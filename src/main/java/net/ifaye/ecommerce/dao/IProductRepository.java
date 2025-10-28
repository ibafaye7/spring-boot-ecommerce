package net.ifaye.ecommerce.dao;

import net.ifaye.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product", path = "products")
public interface IProductRepository extends JpaRepository<Product,Long> {
}
