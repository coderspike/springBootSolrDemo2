package sample.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sample.data.entity.mysql.Product;
import sample.data.repository.mysql.ProductRepository;

import java.util.List;

/**
 * 商品 Service
 *
 * @author liangchuanchuan
 */
@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(rollbackFor = Exception.class)
    public List<Product> save(List<Product> products) {
        return productRepository.save(products);
    }
}
