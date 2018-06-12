package huy.it.onlineshop.entity;

import java.io.Serializable;

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
@Table(name="cart")
public class Cart implements Serializable{
	private static final long version = 1L;
	
	@Id
	@Column(name="cart_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cartId;
	
	@Column(name="emty")
	private boolean emty;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@OneToOne
	private CartDetail cartDetail;
	
	public Cart(Long cartId, boolean emty, Customer customer) {
		super();
		this.cartId = cartId;
		this.emty = emty;
		this.customer = customer;
	}

	
	public Cart(Long cartId, boolean emty) {
		super();
		this.cartId = cartId;
		this.emty = emty;
	}


	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public boolean isEmty() {
		return emty;
	}

	public void setEmty(boolean emty) {
		this.emty = emty;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public CartDetail getCartDetail() {
		return cartDetail;
	}


	public void setCartDetail(CartDetail cartDetail) {
		this.cartDetail = cartDetail;
	}
	
	
}
