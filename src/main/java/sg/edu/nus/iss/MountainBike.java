package sg.edu.nus.iss;

public class MountainBike extends Bicycle{


    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int seatHeight;

    public int getSeatHeight() {
        return this.seatHeight;
    }

    public void setSeatHeight (int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSeat Height" + seatHeight;
    }

    
    
}
