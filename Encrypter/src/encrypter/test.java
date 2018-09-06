/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypter;

/**
 *
 * @author Saransh Gupta
 */
public class test {

    
 public static StringBuffer encrypt(String txtup,char a[],int ID) {
     int x,y;
     char ch;
     int num=0;
     StringBuffer encrypt1= new StringBuffer("");
      for (int i = 0; i < txtup.length(); i++) {
   ch = txtup.charAt(i);
   if (ch != ' ') {
    for (int j = 0; j < a.length; j++) {
     if (ch == a[j]) {

      x = j + ID;
     // y=Math.abs(x);
      encrypt1.append(a[x % a.length]);

     }
    }
   } else {
    encrypt1.append(" ");
   }
  }
     
     
      
//System.out.print(encrypt1);
return encrypt1;

 }

 // driver code to check the above function
 public static void main(String args[]) {
  String txt = "Mamta Gupta is an intelligent person";
  String code;
  String txtup = txt.toUpperCase();
  int z=0,ID=0,check=0;
 while(ID<100 && check< 100 && ID!=35){
  ID=(int) (Math.random() * 34932);
  check=(int) (Math.random() * 98435);}
  check=check%100;
   ID=ID%35;
   if(ID==0)
       ID++;
   if(ID<10)
   { code =0+""+ID+""+check;}
   else if(check<10)
   {code =ID+""+0+""+check;}
   else
   { code =ID+""+check;}
   
   int result = Integer.parseInt(code);			
	System.out.println(code);
  char[] a = new char[] {
   'A',
   'B',
   'C',
   'D',
   'E',
   'F',
   'G',
   'H',
   'I',
   'J',
   'K',
   'L',
   'M',
   'N',
   'O',
   'P',
   'Q',
   'R',
   'S',
   'T',
   'U',
   'V',
   'W',
   'X',
   'Y',
   'Z','1','2','3','4','5','6','7','8','9','0'
  };

 int num=0;
  StringBuffer str2 = encrypt(txtup,a,ID);
 while(num<check)
 {StringBuffer str = encrypt(str2.toString(),a,ID);
str2=encrypt(str.toString(),a,ID);
num++;
 }
 
System.out.print(str2);

    

 }
 
}