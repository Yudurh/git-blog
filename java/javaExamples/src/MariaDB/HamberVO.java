package MariaDB;

import java.util.UUID;

public class HamberVO {
    public static void main(String[] args) {

    }

    public int getItem_number() {
        return item_number;
    }

    public void setItem_number(int item_number) {
        this.item_number = item_number;
    }

    private  int item_number;
    private  int item_price;
    private String item_image_url;
    private String item_name;

    private String uuid;

    private String item_option;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getItem_option() {
        return item_option;
    }

    public void setItem_option(String item_option) {
        this.item_option = item_option;
    }

    private int item_update_datetime;
    public int getItem_update_datetime() {
        return item_update_datetime;
    }

    public void setItem_update_datetime(int item_update_datetime) {
        this.item_update_datetime = item_update_datetime;
    }

    //getter/setter 자동생성
    public int getitem_price() {
        return item_price;
    }

    public void setitem_price(int item_price) {
        this.item_price = item_price;
    }

    public String getitem_name() {
        return item_name;
    }
    public void setitem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getitem_image_url() {
        return item_image_url;
    }

    public void setitem_image_url(String item_image_url) {
        this.item_image_url = item_image_url;
    }
}
