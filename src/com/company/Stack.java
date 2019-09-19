package com.company;

import java.util.Scanner;

public  class Stack<T> {
   static final int max = 5;
    static int top = -1;

   static Object arr[] = new Object[max];



   static boolean underflow()
    {
        if(size()==-1)
        {

            return true;
        }

        return  false;
    }

    boolean push(T x)
    {

        top++;
        if(overflow()) {
            System.out.println("cannot be inserted");
            return false;
        } else {
            arr[top] = x;
            return true;
        }

    }
static int size(){
       return top;
}

  static boolean isEmpty()
  {
      if(underflow())
      {
          return true;
      }

      return false;
  }

   static Object pop()
    {
        if(underflow())
        {
            System.out.println("Empty Array");
            return 0;
        } else {
            Object x = arr[top--];

            return x;
        }
    }

   static boolean overflow()
    {
        if(size() >= max)
        {

            return true;
        } else {
            return false;
        }
    }

    static Object peek()
    {
        if(underflow())
        {
            System.out.println("Empty Array");
            return 0;
        } else {
            Object x = arr[top];

            return x;
        }

    }

    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        int element = sc.nextInt();

         Stack<Integer> st = new Stack<>();

        System.out.println(st.isEmpty());

         st.push(10);
         st.push(20);
         st.push(30);
         st.push(40);
         st.push(50);

        System.out.println(st.isEmpty());

       while(st.isEmpty()==false)
       {
           System.out.println(st.pop());
       }

        st.peek();

//        for(int i=st.size();i>=0;i--)
//        {
//            System.out.println(st.pop());
//        }


        System.out.println(st.isEmpty());






    }

}
