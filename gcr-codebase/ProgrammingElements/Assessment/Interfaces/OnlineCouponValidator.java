package ProgrammingElements.Assessment.Interfaces;

interface CouponValidator {

    // Abstract method
    boolean validateCoupon(String code);

    // Static method
    static boolean isLengthValid(String code) {
        return code.length() == 8;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {
        if (CouponValidator.isLengthValid(code) && code.startsWith("SAVE")) {
            return true;
        } else {
            return false;
        }
    }

    void checkCoupons(String[] coupons) {
        for (String coupon : coupons) {
            if (validateCoupon(coupon)) {
                System.out.println(coupon + " is a valid coupon.");
            } else {
                System.out.println(coupon + " is an invalid coupon.");
            }
        }
    }
}

public class OnlineCouponValidator {
    public static void main(String[] args) {

        String[] couponCodes = {
                "SAVE2025",
                "DISCOUNT",
                "SAVE1000",
                "OFFER50",
                "SAVE9999"
        };

        ShoppingCart cart = new ShoppingCart();

        cart.checkCoupons(couponCodes);
    }
}