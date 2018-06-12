package huy.it.onlineshop.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product implements Serializable{
	private static final long version = 1L;
	
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	
	@ManyToOne
	@JoinColumn(name="product_category_id")
	private ProductCategory productCategory;
	
	@Column(name = "name", nullable = false, insertable = true)
	private String name;
	
	@Column(name="price")
	private int price;
	
	@Column(name = "qty")
	private int qty;
	
	@OneToMany
	@JoinColumn(name="product_id")
	private List<Product> products;
	
	public Product(Long productId, ProductCategory productCategory, String name, int price, int qty) {
		super();
		this.productId = productId;
		this.productCategory = productCategory;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
}
