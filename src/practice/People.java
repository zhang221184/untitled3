package practice;

public class People {
    protected double weight,height;
    public void speakHello() {
        System.out.println("yayayaya");
    }
    public void averageHeight() {
        height = 173;
        System.out.println("average height:" + height);
    }
    public void averageWeight() {
        weight = 70;
        System.out.println("average weight:" + weight);
    }
}
class ChinaPeople extends People{
    public void speakHello(){
        System.out.println("您好");
    }
    public void averageHeight(){
        height=168.78;
        System.out.println("中国人的平均身高："+height+"厘米");
    }
    public void averageWeight(){
        weight=65;
        System.out.println("中国人的平均体重："+weight+"千克");
    }
    public void chinaGongfu(){
        System.out.println("坐如钟，站如松，睡如弓");
    }
}
class AmericanPeople extends People{
    public void speakHello(){
        System.out.println("How do you do");
    }
    public void averHeight(){
        height=176;
        System.out.println("American'average height:"+height+"cm");
    }
    public void averWeight(){
        weight=75;
        System.out.println("American'average weight"+weight+"kg");
    }
    public void americanBoxing(){
        System.out.println("直拳，勾拳，组合拳");
    }
}
class BeijingPeople extends ChinaPeople{
    public void averageHeight(){
        height=172.5;
        System.out.println("北京人的平均身高："+height+"厘米");
    }
    public void averageWeight(){
        weight=70;
        System.out.println("北京人的平均体重："+weight+"千克");
    }
    public void beijingOpera(){
        System.out.println("花脸，青衣，花旦和老生");
    }
}
class Example{
    public static void main(String args[]){
        ChinaPeople chinaPeople=new ChinaPeople();
        AmericanPeople americanPeople=new AmericanPeople();
        BeijingPeople beijingPeople=new BeijingPeople();
        chinaPeople.speakHello();
        americanPeople.speakHello();
        beijingPeople.speakHello();
        chinaPeople.averageHeight();
        americanPeople.averHeight();
        beijingPeople.averageHeight();
        chinaPeople.averageWeight();
        americanPeople.averageWeight();
        beijingPeople.averageWeight();
        chinaPeople.chinaGongfu();
        americanPeople.americanBoxing();
        beijingPeople.beijingOpera();
        beijingPeople.chinaGongfu();
    }
}
