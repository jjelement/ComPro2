package sorrawich.self.self2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tisanai.Cha
 */
public class Theater {

    private int theaterId;

    //add  code here
    private Seat[] seats;
    public Theater(int theaterId, Seat[] seats) {
        this.theaterId = theaterId;
        this.seats = seats;
    }
    //--------

    public Seat[] getSeats() {
        return seats;
    }

    public void setSeats(Seat[] seats) {
        this.seats = seats;
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public boolean reserveSeat(int seatId) {
        for(Seat seat: seats) {
            if(seat.getSeatId() == seatId) {
                if(seat.isSeatSelected()) {
                    break;
                } else {
                    seat.setSeatSelected(true);
                    return true;
                }
            }
        }
        return false;
    }

    public int countNoReserveSeat() {
        int count = 0;
       	for(Seat seat: seats) {
            if(!seat.isSeatSelected()) {
                count++;
            }
        }
        return count;
    }

    public int countNoReserveSeat(String classSeat) {
        int count = 0;
        for(Seat seat: seats) {
            if(!seat.isSeatSelected() && seat.getClassSeat().equals(classSeat)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        String seatAll = "";
        for (Seat seat : seats) {
            seatAll += seat.toString() + "\n";
        }
        return "Theater{" + "theaterId=" + theaterId + "\nseats=" + seatAll + '}';
    }

}
