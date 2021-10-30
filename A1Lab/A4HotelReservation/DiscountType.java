package A1WorkingWithAbstraction.A1Lab.A4HotelReservation;

public enum DiscountType {

    //•	20% for VIP clients - VIP
    //•	10% for clients, visiting for a second time - SecondVisit
    //•	0% if there is no discount - None

    VIP(0.2),SECOND_VISIT(0.1),NONE(0);

    private double discount;

    DiscountType(double discount){

        this.discount = discount;
    }

    public double getDiscount() {

        return 1 - discount;
    }

    public static DiscountType parseDiscount(String discount){
        switch (discount){
            case "VIP":
                return VIP;
            case "SecondVisit":
                return SECOND_VISIT;
            case "None":
                return NONE;
            default:
                throw new IllegalArgumentException("Unknown discount type " + discount);
        }
    }
}

