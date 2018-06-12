package huy.it.onlineshop.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product_category")
public class ProductCategory implements Serializable{
	private static final long version = 1L;
	 
	@Id
	@Column(name="product_category_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productCategoryId;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany
	@JoinColumn(name="product_category_id")
	private List<Product> products;

	public ProductCategory(Long productCategoryId, String categoryName) {
		super();
		this.productCategoryId = productCategoryId;
		this.categoryName = categoryName;
	}

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
