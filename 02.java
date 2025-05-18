class Vehicle{
    private String licencePlate;
    private String ownerName;
    private int hourseParked;

    Vehicle(String lp,String on,int hp){
        licencePlate = lp;
        ownerName = on;
        hourseParked = hp;
    }

    public String getLicencePlate(){
        return licencePlate;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public int gethourseParked(){
        return hourseParked;
    }

    public void setLicencePlate(String licencePlate){
        this.licencePlate = licencePlate;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public void setHourseParked(int hourseParked){
        this.hourseParked = hourseParked;
    }

}

class ParkingLot{
    private int parkLimit = 0;
    String parkedCarsLp[] = new String[4];
    String parkedOwner[] = new String[4];
    int parkedHours[] = new int[4];

    public void addVehicles(String lp,String owner,int hours){
         if(parkLimit < 4){
            parkedCarsLp[parkLimit] = lp;
            parkedOwner[parkLimit] = owner;
            parkedHours[parkLimit] = hours;
            parkLimit++;
        }
    }

    public void rmVehicles(String licencePlate){
        if(licencePlate)
    }

}

class problem02 {
    public static void main(String[] args){
        Vehicle v01 = new Vehicle("ABC123","John Doe",2);
        Vehicle v02 = new Vehicle("XYZ789","Jane Smith",4);
        Vehicle v03 = new Vehicle("LMN456","Bob Brown",1);

        ParkingLot p01 = new ParkingLot();

        p01.addVehicles(v01.getLicencePlate(),v02.getOwnerName(),v03.gethourseParked());
    }


}