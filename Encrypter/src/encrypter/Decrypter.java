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
public class Decrypter {

    
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

      x = j - ID;
      if(x<0)
      {y=a.length+x;
      }else
      {y=x;}
      encrypt1.append(a[y % a.length]);

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
  String txt = "J8JQ8 DRMQ8 FP 8K FKQBIIFDBKQ MBOPLK";
  String txtup = txt.toUpperCase();
  String code ="2928",inc="",time="";
  char ch;
  int id=0,time1=0;
  for(int i=0;i<2;i++)
  {
  ch = code.charAt(i);
  inc=inc+ch;
   id =Integer.parseInt(inc);
  
  }
  for(int j=2;j<4;j++)
  {   
  ch = code.charAt(j);
  time=time+ch;
   time1 =Integer.parseInt(time);
  
  }
  int ID=id;
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
 while(num<time1)
 {StringBuffer str = encrypt(str2.toString(),a,ID);
str2=encrypt(str.toString(),a,ID);
num++;
 }
 
System.out.print(str2);
 }
 
}