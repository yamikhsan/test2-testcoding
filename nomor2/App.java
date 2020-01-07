public class App{
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            String res;
            if(i % 2 == 0 && i % 3 == 0){
                res = "INDONESIA";
            } else if(i % 2 == 1){
                res = "ganjil";
            } else {
                res = String.valueOf(i);
            }
            System.out.println(res);
        }
    }
}