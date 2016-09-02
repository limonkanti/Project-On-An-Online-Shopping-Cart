package entity;
// Generated Mar 14, 2016 9:25:18 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ProOrder generated by hbm2java
 */
public class ProOrder  implements java.io.Serializable {


     private Integer orderId;
     private DelivaryCost delivaryCost;
     private ShopUser shopUser;
     private int proId;
     private Date orderDate;
     private int orderQty;
     private double totalPrice;
     private String orderStatus;
     private Set proOrderDetailses = new HashSet(0);

    public ProOrder() {
    }

	
    public ProOrder(DelivaryCost delivaryCost, ShopUser shopUser, int proId, Date orderDate, int orderQty, double totalPrice, String orderStatus) {
        this.delivaryCost = delivaryCost;
        this.shopUser = shopUser;
        this.proId = proId;
        this.orderDate = orderDate;
        this.orderQty = orderQty;
        this.totalPrice = totalPrice;
        this.orderStatus = orderStatus;
    }
    public ProOrder(DelivaryCost delivaryCost, ShopUser shopUser, int proId, Date orderDate, int orderQty, double totalPrice, String orderStatus, Set proOrderDetailses) {
       this.delivaryCost = delivaryCost;
       this.shopUser = shopUser;
       this.proId = proId;
       this.orderDate = orderDate;
       this.orderQty = orderQty;
       this.totalPrice = totalPrice;
       this.orderStatus = orderStatus;
       this.proOrderDetailses = proOrderDetailses;
    }
   
    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public DelivaryCost getDelivaryCost() {
        return this.delivaryCost;
    }
    
    public void setDelivaryCost(DelivaryCost delivaryCost) {
        this.delivaryCost = delivaryCost;
    }
    public ShopUser getShopUser() {
        return this.shopUser;
    }
    
    public void setShopUser(ShopUser shopUser) {
        this.shopUser = shopUser;
    }
    public int getProId() {
        return this.proId;
    }
    
    public void setProId(int proId) {
        this.proId = proId;
    }
    public Date getOrderDate() {
        return this.orderDate;
    }
    
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public int getOrderQty() {
        return this.orderQty;
    }
    
    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }
    public double getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }
    
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public Set getProOrderDetailses() {
        return this.proOrderDetailses;
    }
    
    public void setProOrderDetailses(Set proOrderDetailses) {
        this.proOrderDetailses = proOrderDetailses;
    }




}


