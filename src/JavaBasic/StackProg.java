/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class StackProg 
{
    int st=-1;
    int[] item = new int[10];

      
    void push(int i)
    {
      //  System.out.println(i+st);
        if(st==9)
            System.out.println("Full");
        else
        {
           int t= ++st;
            //System.out.println(t);
            item[t]=i;
        }
    }
    void pop()
    {
        if(st==-1)
            System.out.println("UnderFlow");
        else
        {
            System.out.println(item[st]);
            st--;}
    }
public static void main(String args[])
{
    StackProg p = new  StackProg();
    p.push(4);
    p.push(10);
   for (int i = 0; i < p.st; i++) {
       p.pop();
    }
}
}
