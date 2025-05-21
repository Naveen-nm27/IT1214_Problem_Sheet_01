import java.util.ArrayList;

import javax.security.auth.login.AccountException;

class Ticket{
    private int ticketID;
    private String coustomerName;
    private int seatNumber;

    Ticket(int ticketID,String coustomerName,int seatNumber){
        this.ticketID = ticketID;
        this.coustomerName = coustomerName;
        this.seatNumber = seatNumber;
    }
    public int getTid(){
        return ticketID;
    }

    public String getCname(){
        return coustomerName;
    }

    public int grtSeatnum(){
        return seatNumber;
    }

    public void setTid(int Tid){
        ticketID = Tid;
    }

    public void setCname(String cName){
        coustomerName = cName;
    }

    public void setseatNum(int seatNum){
        seatNumber = seatNum;
    }

}

class MovieTheater {

    ArrayList <Ticket> bookings = new ArrayList<>();
    int numOfBookins = 0;

    public boolean validateSeatNum(int ticketNum){
        for(Ticket num:bookings){
            if(num.getTid() == ticketNum){
                return true;
            }

        }
        return false;
    }
    public void bookTikets(int tid){
        
        try{
            if(numOfBookins <= 10 && validateSeatNum(tid)){
                bookings.add(t01);
            } else{
                throw new IllegalArgumentException("We are Sorry to inform that we are fully booked for today!\nTry again on the next showing time Thank you.")
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void cancelSeat(int t01){
        try{
            for(int i = 0;i < numOfBookins;i++){
                if(t01 == bookings.get(i).getTid()) {
                    bookings.remove(i);
                    numOfBookins--;
                    System.out.println("Your booking has been canceled!");
                    break;
                } else{
                    throw new IllegalArgumentException("Invalid ticket id! try again.");
                }    
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void printSeats(){
        for(int i = 0; i <= 0; i++){
            Ticket t01 = bookings.get(i);
            System.out.println("Seat Id: " + t01.getTid());
            System.out.println("Name: " + t01.getCname());
            System.out.println("Seat Number: " + t01.grtSeatnum());

        }
    }
}

class Problem04 {
    public static void main(String[] args){
        Ticket ti_01 = new Ticket(1,"Kate",1);
        Ticket ti_02 = new Ticket(2,"Alice" ,2);
        Ticket ti_03 = new Ticket(3, "Bishop", 3);

        MovieTheater mov01 = new MovieTheater();

        mov01.cancelSeat(2);
        mov01.bookTikets(ti_02);
    }

    
    
}
