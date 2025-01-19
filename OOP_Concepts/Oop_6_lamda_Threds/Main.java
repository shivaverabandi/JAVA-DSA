package OOP_Concepts.Oop_6_lamda_Threds;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        ComparingObj shiva = new ComparingObj(80,9.3f);
        ComparingObj kunal = new ComparingObj(90,9.5f);
        ComparingObj mani = new ComparingObj(97,9.4f);
        ComparingObj[] list = {shiva,kunal,mani};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
