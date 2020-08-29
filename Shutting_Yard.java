import java.until.String;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
import java.util.Stack;

public class Shutting_Yard {
  public static void main(String[]args){
      //string save in list then loop 
      // for example 1+((2+3)*4)-5
      //change to arrayList{1,(,(,2,+3,),*,4),-,5}
      String express="3+4*2/(1-5)^2^3";
      List<String> infixExpressionList=toInExpressionList(express);
      System.out.println(infixExpressionList);////change to arrayList{1,(,(,2,+3,),*,4),-,5}
      Queue <String> output=ShuttingYard(infixExpressionList);//dont sure
      System.out.println("ooutput: "+output);
  }  
  public static Queue ShuttingYard(List<String> ls){
    Stack<String> s1=new Stack<String>();// operarion
    Queue<String> s2= new LinkedList<>();// number
    for(String item:ls){
      if(item.matches("\\d+")){
        s2.add(item);
      }
      else if(item.equals("(")){
        s1.push(item);
      }
      else if(item.equals(")")){
        while(!s1.peek().equals("(")){
          s2.add(s1.pop());
        }
        s1.pop();//cancel the "(" and ")"
      }

      else{
        while(s1.size()!=0 && Operarion.getValue(s1.peek()) >=Operarion.getValue(item)){
          s2.add(s1.pop());
        }
        s1.push(item);
      }
    }
    while(s1.size()!=0){
      s2.add(s1.pop());
    }
    return s2;
  }

  public static List<String> toInExpressionList(String s){
    List<String> ls = new ArrayList<String>();
    int i=0;// this is index to take loop for string
    String str;
    char token;//
    /*while(i<s.length()){
      if(token=s.CharAt(i).equals('+')){
        ls.add(""+token);
        i++;
      }
      else if(  token=s.CharAt(i).equals('-')    ){
        ls.add(""+token);
        i++;
      }
      else if (token=s.CharAt(i).equals('*') ){
        ls.add(""+token);
        i++;
      }
      else if(token=s.CharAt(i).equals('/')){
        ls.add(""+token);
        i++;
      }
      else if (token=s.CharAt(i).equals('(')){
        ls.add(""+token);
        i++;
      }
      else if (token=s.CharAt(i).equals(')')){
        ls.add(""+token);
        i++;
      }
      else{
        str="";
        while(i<s.length()&&(token.euqals(s.CharAt(i))=='0'||token.euqals(s.CharAt(i))=='1'||token.euqals(s.CharAt(i))=='2'||token.euqals(s.CharAt(i))=='3'||token.euqals(s.CharAt(i))=='4'||token.euqals(s.CharAt(i))=='5'||token.euqals(s.CharAt(i))=='6'||token.euqals(s.CharAt(i))=='7'||token.euqals(s.CharAt(i))=='8'||token.euqals(s.CharAt(i))=='9')){
          str+=token;
          i++;
        }
        ls.add(str);

      }
      return ls;*/
      do{
        if((token=s.charAt(i))<48 || (token=s.charAt(i))>57){// operation
          ls.add(""+token);
          i++;
        }else{//number
          str="";
          while(i<s.length()&&(token=s.charAt(i))>=48 &&(token=s.charAt(i))<=57){
            str+=token;
            i++;
          }
          ls.add(str);
        }
        }while(i<s.length());
        return ls;
      }
    

}
class Operarion{
  public static int getValue(String operarion){//why
    int reslut=0;
    switch (operarion) {
      case "+":
        reslut = 1;
        break;
       case"-":
         reslut=1;
         break;
       case"*":
         reslut=2;
         break;
       case"/":
       reslut=2;
       break;
       case"^":
       reslut=3;
       break;
      default:
      reslut=0;
        break;
    }
    return reslut;
 }
}
/*public class LinkedListNode{
  public String num;
  public LinkedList next;
  public LinkedList pre;
  public LinkedList(String num){
    this.num=num;
  }
  
}
   
class LinkedList{
  private LinkedListNode head = new LinkedListNode("");
  public LinkedListNode gethead(){
    return head;
  }
  public void offer
}
   */

    

