package demo.model;

import java.util.Date;

public class CinemaTic {
    private String code ;
    private int price ;
    private String day  ;
    private String ticket ;

    public CinemaTic() {

    }

    public CinemaTic(String code, int price, String day, String ticket) {
        this.code = code;
        this.price = price;
        this.day = day;
        this.ticket = ticket;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "CinemaTic{" +
                "code='" + code + '\'' +
                ", price=" + price +
                ", day='" + day + '\'' +
                ", ticket='" + ticket + '\'' +
                '}';
    }
}
