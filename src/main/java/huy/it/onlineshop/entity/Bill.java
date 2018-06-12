package huy.it.onlineshop.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bill")
public class Bill implements Serializable{
	private static final long servision = 1L;
	
	@Id
	@Column(name = "bill_id")
	private Long billId;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "total")
	private int total;
	
	@Column(name="status")
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@OneToOne
	private CartDetail cartDetail;

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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
