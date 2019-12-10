import java.util.Scanner;
import java.util.ArrayList;
class Queue3503
{
    public int size;
    public int top;
    public int capacity;
    public ArrayList<Integer> elements = new ArrayList<Integer>(size);
    
    public Queue3503(int capacity)
    {
        size = capacity;
        top = capacity;
    }

    public Queue3503()
    { 
        capacity = 0;
    }
    public void enqueue(int v)
    {
        elements.add(v);
    }
    public void dequeue()
    {
        int temp = elements.get(0);
        for (int i = 0; i < size -1; i++)
        {
            elements.set(i, elements.get(i+1));
        }
        size--;

    }
    public boolean empty()
    {
        //return true if the queue is empty
        if(size == 0)
            return true;

        return false;
    }
    public int getSize() 
    {
        //return the size of the queue (as an int)
        return size;
    }

    public void outputArray()
    {
        System.out.println("\nAfter removing 5 elements: ");
        for(int i = 0; i < getSize(); i++)
            System.out.print(elements.get(i) + " ");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {   

        int x;
        Scanner input = new Scanner(System.in);
        Queue3503 queue = new Queue3503(20);
        for(int i = 0; i < queue.getSize(); i++)
        {   
            x = input.nextInt();
            queue.enqueue(x);
            
        }

        //Printing initial array
        System.out.println("Initial content:");
        for(int i = 0; i < queue.getSize(); i++)
            System.out.println(queue.elements.get(i));


        //removing first 5


        for (int i = 0, counter = 0; i < queue.top; i++)
        {   
            queue.dequeue();
            counter++;
            if(counter >= queue.top)
            {   
                break;
            }
            else if (counter%5 == 0)
            {
                queue.outputArray();
            }      

        }
    }
}