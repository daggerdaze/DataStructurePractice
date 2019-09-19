package com.company;

public class Queue {

//   static int size =5;
//    static int arr[] = new int[size];
//   static int front = -1;
//    static int rear = -1;


//    static boolean underflow()
//    {
//        return front==-1;
//    }
//
//    static boolean overflow()
//    {
//        return front==0 && rear==size-1;
//    }
//
//    static void ins(int data)
//    {
//        if(front==-1)
//        {
//            front=0;
//            rear=0;
//            arr[rear] = data;
//        } else if(overflow()) {
//            System.out.println("Size full paaji");
//        } else {
//            rear++;
//            arr[rear] = data;
//        }
//    }
//
//    static void delete()
//    {
//        if (front==rear)
//        {
//            front = rear = -1;
//        }  else if (underflow())
//        {
//            System.out.println("No element to be deleted");
//        } else {
//            front++;
//        }
//    }

    static int size;
    static int arr[];
    static int front;
    static int rear;
    static int capacity;

    Queue(int capacity)
    {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        arr = new int[this.capacity];
    }



    static void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("This operation can't be performed.Queue is full");
        } else {
            rear = (rear + 1) % capacity;
            arr[rear] = data;
            size++;
            System.out.println(data + " enqueued to queue");
        }

    }

    static void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("This operation can't be performed.Queue is empty");
        } else {
        front = (front+1);
        size--;
            }
    }

  static boolean isFull()
  {
     if(capacity == size)
     {
         return true;
     }

     return false;
  }

  static boolean isEmpty()
  {
      if(size==0)
      {
          return true;
      }
      return false;
  }

    static void print()
    {
        for (int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }





}
