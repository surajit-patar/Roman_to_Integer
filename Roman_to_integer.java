import java.util.Scanner;
import java.util.HashMap;

public class Roman_to_integer{
    public static void fnConvert(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int ans = map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                ans-=map.get(s.charAt(i));
            }
            else ans+=map.get(s.charAt(i));
        }

        System.out.println("=====\nRoman: "+s);
        System.out.println("Integer: "+ans+"\n======");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the Roman Number here ------- ");
            String s = sc.nextLine();
            fnConvert(s);
        }

    }
}