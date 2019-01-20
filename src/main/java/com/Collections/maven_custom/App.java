package com.Collections.maven_custom;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BookList<Book> list = new BookList<Book>();
        
        list.add(new Book("Arhtur konan doyale","Sherlock Holmes",250));
        list.add(new Book("Sharadhindho Chaterjee","Byomkesh Bakshi",250));
        list.add(new Book("Sunil Gangopaddhay","Kakababu",250));
        list.add(new Book("Samaresh Majumdar","Arjun",250));
        list.remove(3);
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
       } 
    	
    	
    }
}
