package com.lsk.entity;


import java.util.Enumeration;
import java.util.Vector;

public class OrderCart {
	
	protected Vector<Book> items=new Vector<Book>();

    public  OrderCart()
    {
       items  = new Vector<Book>();
       
    }

    @SuppressWarnings("unchecked")
	public Vector<Book> getItems()
    {
        return (Vector<Book>) items.clone();
    }

	public synchronized void addItem(Book newbook)
    {
        Enumeration e = items.elements();


        while (e.hasMoreElements())
        {
            Book currItem = (Book) e.nextElement();

            if (newbook.equals(currItem))
            {

                currItem.orderQuantity = currItem.orderQuantity +
                    newbook.orderQuantity;
                return;
            }
        }


        items.addElement(newbook);
    }


	 public synchronized void removeItem(int itemIndex)
     {
         Book item = (Book) items.elementAt(itemIndex);

         item.orderQuantity = item.orderQuantity - item.orderQuantity;

 
         if (item.orderQuantity <= 0)
         {
             items.removeElementAt(itemIndex);
         } 
       
     }
    

}
