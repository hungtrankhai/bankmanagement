package trankhaihung.pakage1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Receiver {
    int money;
    String note;
    Date createdAt;

    public Receiver(){

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("___THÔNG TIN NẠP TIỀN___ ");
        System.out.println("Nhap so tien: ");
        money = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap ghi chu: ");
        note = sc.nextLine();

        createdAt = new Date();
    }

    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "money=" + money +
                ", note='" + note + '\'' +
                ", createdAt=" + getCreatedAtString() +
                '}';
    }

    public String getCreatedAtString(){
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
         String str = format.format(createdAt);
         return str;
    }


}
