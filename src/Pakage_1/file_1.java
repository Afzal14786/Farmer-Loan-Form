package Pakage_1;

class car{
    private engine en;
    public car(engine en){
        this.en=en;
    }
    public void start(){
        en.engineStarts();
    }
}
class engine{
    public void engineStarts(){
        System.out.println("Engine Gets Start");
    }
}

public class file_1 {
    public static void main(String[] args) {
        engine eng = new engine();
        car cr = new car(eng);
        cr.start();
    }
}
