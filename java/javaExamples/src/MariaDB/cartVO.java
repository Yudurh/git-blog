package MariaDB;

public class cartVO {
    public int cart_item_no;
    public String item_name;
    public int cart_item_price;
    public int cart_item_amount;


    public int getCart_item_no() {
        return cart_item_no;
    }

    public void setCart_item_no(int cart_item_no) {
        this.cart_item_no = cart_item_no;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getCart_item_price() {
        return cart_item_price;
    }

    public void setCart_item_price(int cart_item_price) {
        this.cart_item_price = cart_item_price;
    }

    public int getCart_item_amount() {
        return cart_item_amount;
    }

    public void setCart_item_amount(int cart_item_amount) {
        this.cart_item_amount = cart_item_amount;
    }
}
