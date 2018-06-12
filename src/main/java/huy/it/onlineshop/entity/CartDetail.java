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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart_detail")
public class CartDetail implements Serializable{
	private static final long version = 1L;
	
	@Id
	@Column(name="cart_detail_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cartDetailId;
	
	@Column(name="qty")
	private int qty;
	
	@Column(name="status")
	private boolean status;
	
	@OneToOne
	private Cart cart;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private List<Product> products;

	public CartDetail(Long cartDetailId, int qty, boolean status, Cart cart, List<Product> products) {
		super();
		this.cartDetailId = cartDetailId;
		this.qty = qty;
		this.status = status;
		this.cart = cart;
		this.products = products;
	}

	public Long getCartDetailId() {
		return cartDetailId;
	}

	public void setCartDetailId(Long cartDetailId) {
		this.cartDetailId = cartDetailId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
