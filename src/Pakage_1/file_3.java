package Pakage_1;

class me{
    private heart hrt;
    public me(heart hrt){
        this.hrt = hrt;
    }
    public void heartBeats(){
        hrt.Heart();
    }
}

class heart{
    public void Heart(){
        System.out.println("My Heart ❤ Beats faster 🏃 then U :");
        System.out.println("And I Love U");
    }
}
public class file_3 {
    public static void main(String[] args) {
        heart hrt = new heart();
        me m = new me(hrt);
        hrt.Heart();
    }
}
