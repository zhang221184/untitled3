package practice;

public class Vehicle {
    double speed;
    int power;
    void speedUp(int s){
        speed=speed+s;
    }
    void speedDown(int d){
       speed=speed-d;
    }
    void setPower(int p){
        power=p;
    }
    void brake(){
        speed=0;
    }
    int getPower(){
        return power;
    }
    double getSpeed(){
        return speed;
    }
}
class User{
    public static void main(String args[]){
        Vehicle car1,car2;
        car1=new Vehicle();
        car2=new Vehicle();
        car1.setPower(128);
        car2.setPower(76);
        System.out.println("car1的功率是："+car1.getPower());
        System.out.println("car2的功率是："+car2.getPower());
        car1.speedUp(80);
        car2.speedUp(100);
        System.out.println("car1目前的速度："+car1.getSpeed());
        System.out.println("car2目前的速度："+car2.getSpeed());
        car1.speedDown(10);
        car2.speedDown(20);
        System.out.println("car1目前的速度："+car1.getSpeed());
        System.out.println("car2目前的速度："+car2.getSpeed());
        System.out.println("car1刹车");
        car1.brake();
        System.out.println("car1目前的速度："+car1.getSpeed());
    }
}
