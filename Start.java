import student.Student;
import studentoperations.StudentOperations;
import librarian.Librarian;
import librarianoperations.LibrarianOperations;
import bookoperations.BookOperations;
import book.Book;
import borrowoperations.*;
import interfaces.*;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Start{
    public static void main(String[] args){
        
        StudentOperations stos=new StudentOperations();
        Student student=new Student();

        LibrarianOperations los=new LibrarianOperations();
        Librarian librarian=new Librarian();

        BookOperations bos=new BookOperations();
        Book book=new Book();
        
        BorrowOperations bro=new BorrowOperations();
        Borrow borrow=new Borrow();
        
    
    while(true){  
    Scanner in=new Scanner(System.in);      
        try{           
            System.out.println("\n********************************************");
            System.out.println("**********LIBRARY MANAGEMENT SYSTEM*********");
            System.out.println("********************************************");
            System.out.println("ENTER VALID INFOS TO LOGIN AS ADMIN/LIBRARIAN/STUDENT ");
            System.out.println("ENTER USERNAME: ");
            String username=in.nextLine();
            System.out.println("ENTER PASSWORD: ");
            String password=in.nextLine();
            
            int i=1;
            if(username.equals("admin") && password.equals("1234")){
                while(i!=-2){
                    System.out.println("\nADMIN PORTAL\n1. Add New Librarian\n2. Search by Librarian Id\n3. Show All Librarian\n4. Delete Librarian \n5. Main Menu\n");
                    System.out.println("Enter your choice: ");
                    int lchoice =in.nextInt();
                    if(lchoice==1){
                        los.insertLibrarian(librarian);                        
                    }                
                    else if(lchoice==2){                           
                        System.out.println("Enter  Librarian ID: ");
                        int id=in.nextInt();    
                        los.getLibrarian(id);                                            
                    }
                    else if(lchoice==3){
                        los.showAllLibrarians();                       
                    }
                    else if(lchoice==4){
                    	System.out.println("Enter Librarian ID: ");
                        int id=in.nextInt();
                        los.removeLibrarian(id);                       
                    }
                    else if(lchoice==5){
                        break;
                    }

                }
            }
                           
            else if(username.equals("librarian") && password.equals("1234")){
                while(i!=-2){System.out.println("\nLIBRARIAN PORTAL\n\n*Student Management*\n1. Add new student \n2. Search a Student\n3. Show All Students\n4. Delete a Student\n\n*Book Management*\n5. Issue New Book\n6. Search by BookId\n7. Show All Books\n8. Main Menu\n");
                    System.out.println("Enter your choice: ");
                    int schoice =in.nextInt();                                   
                    if(schoice==1){
                        stos.insertStudent(student);                       
                    }
                    else if(schoice==2){ 
                        System.out.println("Enter  Library ID: ");
                        int lid=in.nextInt();                      
                        stos.getStudent(lid);                        
                    }
                    else if(schoice==3){
                        stos.showAllStudents();                        
                    }
                    else if(schoice==4){
                    	System.out.println("Enter  Library ID: ");
                        int id=in.nextInt();
                        stos.removeStudent(id);    
                    }
                    else if(schoice==5){
                        bos.insertBook(book);                 
                    }
                    else if(schoice==6){                      
                        System.out.println("Enter  Book ID: ");
                        int id=in.nextInt();                      
                        bos.getBook(id);    
                    }
                    else if(schoice==7){
                        bos.showAllBooks();            
                    }
                    else if(schoice==8){
                        break;
                    }
                }
            }

            else if (username.equals("student") && password.equals("1234")){
                while(i!=-2){
                    System.out.println("\nSTUDENT PORTAL\n\n1. Show Book List\n2. Search A Book\n3. Borrow A Book\n4. Return Book\n5. Main Menu");
                    System.out.println("Enter your choice: ");
                    int brchoice =in.nextInt();
                    if(brchoice==1){
                        bos.showAllBooks();
                    }
                    else if(brchoice==2){                           
                        System.out.println("Enter  Book ID: ");
                        int id=in.nextInt();                      
                        bos.getBook(id);             
                    }
                    else if(brchoice==3){
                        bro.borrowAbook(borrow);
                    }
                    else if(brchoice==4){
                 	    System.out.println("Enter Library ID: ");
                        int id=in.nextInt();
                        bro.returnbook(id);
                    }
                    else if(brchoice==5){
                 	    break;
                    }
                }
            }
        }
        catch(InputMismatchException ex){
            System.out.println("************WRONG INPUT! TRY AGAIN**********"); 
        } 
    } 
        
    }
}