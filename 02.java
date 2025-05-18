class Vehicle{
    private String licencePlate;
    private String ownerName;
    private int hourseParked;
    private int parkLimit = 5;

    Vehicle(String lp,String on,int hp,int pl){
        licencePlate = lp;
        ownerName = on;
        hourseParked = hp;
    }

    public String getlicencePlate(){
        return licencePlate;
    }

    public String getownerName(){
        return ownerName;
    }

    public int gethourseParked(){
        return hourseParked;
    }

    public void setlicencePlate(String licencePlate){
        this.licencePlate = licencePlate;
    }

    public void setownerName(String ownerName){
        this.ownerName = ownerName;
    }

    public void sethourseParked(String hourseParked){
        this.hourseParked = hourseParked;
    }

}

class ParkingLot{
    String parkedCars[] = new String[parkLimit];

    
}