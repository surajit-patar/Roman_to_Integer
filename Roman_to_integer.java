import java.util.Scanner;
import java.util.HashMap;

class Roman_to_integer{
    public static void romanToInteger(String s){  //CIV
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int ans = map.get(s.charAt(s.length()-1));  //ans=5 V
        for(int i=s.length()-2;i>=0;i--){
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){ // 1<5,,, 100<1
                ans-=map.get(s.charAt(i)); // ANS=5-1; 4
            }
            else ans+=map.get(s.charAt(i)); //100+4=104
        }

        System.out.println("=========================================\nRoman: "+s);
        System.out.println("Integer: "+ans+"\n==================================");

    }

    public static void integerToRoman(int num){
        int code[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String s[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int n=num;
        String ans="";
        int i=100;
        for(i=code.length-1;i>=0;i--){
            if(num==0) break;
            while(num>=code[i]){
                ans+=s[i];
                num-=code[i];
            }
        }
        System.out.println(i+"\n");
        System.out.println("==============================\nInteger -> "+n);
        System.out.println("Roman -> "+ans+"\n===============================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------WELCOME TO THE INTERFACE-------------------");
        System.out.println("Press 1 For Integer to Roman!\nPress 2 For Roman to Integer!");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
            while (true) {
                System.out.println("Enter the Integer Value ->");
                int num=sc.nextInt();
                integerToRoman(num);
            }

            case 2:
            while(true){
                System.out.println("Enter the Roman Value ->");
                String s = sc.next();
                romanToInteger(s);
            }

        }
    }
}
