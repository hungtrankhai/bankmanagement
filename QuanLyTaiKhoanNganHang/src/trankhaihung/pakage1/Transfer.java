package trankhaihung.pakage1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Transfer {
    String transferAccNumber, note;
    int money;
    Date createdAt;

    public Transfer(){

    }

    public String getTransferAccNumber() {
        return transferAccNumber;
    }

    public void setTransferAccNumber(String transferAccNumber) {
        this.transferAccNumber = transferAccNumber;
    }

    public String getNote() {
        return note;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
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

    public void input(int maxMoney){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin nap tien: ");
        System.out.println("Nhap so tai khoan nhan tien: ");
        transferAccNumber = sc.nextLine();

        for (;;){
            System.out.println("Nhap so tien: ");
            money = Integer.parseInt(sc.nextLine());
            if(money <= maxMoney) {
                break;
            }
                System.out.println("So tien chuyen vuot qua so tien trong TK :(");
        }


        System.out.println("Nhap ghi chu: ");
        note = sc.nextLine();

        createdAt = new Date();
    }

    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "transferAccNumber='" + transferAccNumber + '\'' +
                ", note='" + note + '\'' +
                ", money=" + money +
                ", createdAt=" + getCreatedAtString() +
                '}';
    }

    public String getCreatedAtString(){
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        String str = format.format(createdAt);
        return str;
    }
}
