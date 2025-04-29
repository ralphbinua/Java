package VendoCoupon;

public class Coupon{
    private String CouponName;
    private boolean isUse;
    private int couponDiscount;

    public Coupon(String CouponName, int couponDiscount, boolean isUse){
        this.CouponName = CouponName;
        this.couponDiscount = couponDiscount;
        this.isUse = isUse;
    }

    public void setCouponName(String CouponName){
        this.CouponName = CouponName;
    }

    public void setcouponDiscount(int couponDiscount){
        this.couponDiscount = couponDiscount;
    }

    public void setIsUse(boolean isUse){
        this.isUse = true;
    }

    public String getCouponName(){
        return CouponName;
    }

    public int getcouponDiscount(){
        return couponDiscount;
    }

    public boolean getIsUse(){
        return isUse;
    }
}