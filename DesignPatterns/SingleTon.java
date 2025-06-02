package DesignPatterns;

public class SingleTon {

    private static SingleTon singleTon;
    private SingleTon(){
        super();
    }

    public static SingleTon getSingleTonInstance(){
        if(singleTon == null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}

class SingleTonMain{
    public static void main(String[] args) {
        SingleTon obj1 = SingleTon.getSingleTonInstance();
        SingleTon obj2 = SingleTon.getSingleTonInstance();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1 == obj2);
    }
}
