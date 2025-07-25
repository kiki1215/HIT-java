package btvn2_buoi3;

public class NgauNhien {
    static int a,b,c;
    public static void random(int a, int b){
        a = (int) (Math.random() * 100);
        b = (int) (Math.random() * 100);
    }
    public static void random(int a){
        a = (int) (Math.random() * 100);
    }
    public static void inLower(String k){
        System.out.println(k.toLowerCase());
    }
    public static void inUpper(String k){
        System.out.println(k.toUpperCase());
    }
    public static void main(String[] args) {
        try(java.util.Scanner s = new java.util.Scanner(System.in);) {
            do
            {
                random(a,b);
                int r = (int) (Math.random() *2);
                if(r == 0){
                    while(true){
                        random(c);
                        if( a + b != c) break;
                    }
                }else{
                    while(true){
                        random(c);
                        if(a + b == c) break;
                    }
                }
                System.out.printf("%5d\t+%5d\t=%5d\n",a,b,c);
                System.out.print("Du doan ket qua cua phep toan (Dung/Sai): ");
                String k = s.nextLine();  
                if( (a + b == c && "Dung".equalsIgnoreCase(k) ) || (a + b != c && "Sai".equalsIgnoreCase(k))){
                    inUpper(k);
                    System.out.println("Ban da tra loi dung");
                }else
                {
                    inLower(k);
                    System.out.println("Ban da tra loi sai");
                }
                System.out.println("Ban co muon tiep tuc ko (c: yes/k: no)");
                String h = s.nextLine();
                if("k".equalsIgnoreCase(h))
                break;
             } while(true);
        } 
    }
}
