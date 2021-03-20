/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueuePkg;

import java.util.Scanner;

/**
 *
 * @author Danial
 */
public class QueueMenu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opt, queueSizeInput, input;
        String backToMenu = "", mqsAdd = "";
        Queue<Integer> q1 = new Queue<Integer>();
        
        System.out.println
        ("**************** WELCOME ****************\n" +
         "  Welcome to the Integer Queue Program!\n" + 
         "*****************************************\n");
        
        
        do {
            System.out.println
             ("What operation would you like to perform?" +
                 "\n1 - New Queue"
               + "\t\t\t6 - Dequeue Item"
               + "\n2 - Clear Queue"
               + "\t\t\t7 - Peek at Queue"
               + "\n3 - Check Queue if Full"
               + "\t\t8 - Display Queue"
               + "\n4 - Check Queue if Empty"
               + "\t9 - Exit Program"
               + "\n5 - Enqueue Item");
            opt = s.nextInt();
            
            switch(opt) {
                case 1: //new 
                    q1 = new Queue();
                    q1.clear();
                    System.out.println("Would you like to set up a custom max queue size? Yes or No?");
                    s.nextLine();
                    mqsAdd = s.nextLine();
                    
                    if (mqsAdd.equalsIgnoreCase("yes")) {
                        System.out.println("Enter desired max queue size: ");
                        queueSizeInput = s.nextInt();
                        q1.setMaxQueueSize(queueSizeInput);
 
                        System.out.println
                       ("\n*********** NEW NOTICE ***********\n" + 
                          "New Queue with size: " + queueSizeInput + " created!\n" + 
                          "**********************************\n");
                    }
                    else {
                        System.out.println
                       ("\n*********** NEW NOTICE ***********\n" + 
                          " New Queue with size 999 created!\n" + 
                          "**********************************\n");
                    }
                    
                    backToMenu = "yes";
                    break;
                case 2: //clear
                    q1.clear();
                    System.out.println
                       ("\n*********** CLEAR NOTICE ***********\n" + 
                          "           Queue cleared!\n" + 
                          "************************************\n");
                    backToMenu = "yes";
                    break;
                case 3: //isFull
                    if(q1.isFull()) {
                        System.out.println
                       ("\n*********** FULL NOTICE ***********\n" + 
                          "         The Queue is full!\n" + 
                          "***********************************\n");
                    }
                    else {
                        System.out.println
                       ("\n*********** FULL NOTICE ***********\n" + 
                          "       The Queue is not full!\n" + 
                          "***********************************\n");
                    }
                    backToMenu = "yes";
                    break;
                case 4: //isEmpty
                    if(q1.isEmpty()) {
                        System.out.println
                       ("\n*********** EMPTY NOTICE ***********\n" + 
                          "        The Queue is empty!\n" + 
                          "************************************\n");
                    }
                    else {
                        System.out.println
                       ("\n*********** EMPTY NOTICE ***********\n" + 
                          "      The Queue is not empty!\n" + 
                          "************************************\n");
                    }
                    backToMenu = "yes";
                    break;
                case 5: //enqueue
                    System.out.println("Input what Integer you would like to add to the queue: ");
                    input = s.nextInt();
                   
                    if (q1.isFull())
                    {
                        System.out.println
                       ("\n*********** FULL NOTICE ***********\n" + 
                          " The queue is full, can't enqueue!\n" + 
                          "***********************************\n");
                    }
                    else {
                        q1.enqueue(input);
                        System.out.println
                       ("\n*********** ENQUEUE NOTICE ***********\n" + 
                          "Item: [" + input + "] was enqueued!\n" + 
                          "**************************************\n");
                    }
                    backToMenu = "yes";
                    break;
                case 6: //dequeue
                    System.out.println
                       ("\n*********** DEQUEUE NOTICE ***********\n" + 
                          "Item: [" + q1.dequeue() + "] was dequeued!\n" + 
                          "**************************************\n");
                    backToMenu = "yes";
                    break;
                case 7: //peek
                    System.out.println
                       ("\n*********** PEEK NOTICE ***********\n" + 
                          "Item at Front: [" + q1.peek() + "]\n" + 
                          "***********************************\n");
                    backToMenu = "yes";
                    break;
                case 8: //display
                    System.out.println
                       ("\n*********** DISPLAY QUEUE ***********");
                    System.out.println("The queue is as follows:");
                    System.out.print("[ ");
                    q1.displayQueue();
                    System.out.print(" ]");
                    System.out.println
                       ("\n*************************************\n");
                    backToMenu = "yes";
                    break;
                case 9: //exit
                    System.out.println("\n***************************"
                                     + "\nThe program will now close."
                                     + "\n***************************");
                    
                    backToMenu = "no";
                    break;
                default: //error
                    
                    System.out.println
                    ("********************************** ERROR **********************************\n" + 
                     "Please input 1-9 only to access the specified operations. Please try again.\n" +
                     "***************************************************************************\n");
                    backToMenu = "yes";
                    System.out.println("\n");
                    break;
            
            
            }
        
        } while(backToMenu.equalsIgnoreCase("yes"));
        
        s.close();
    }
}
