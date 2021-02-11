package lk.lakshan.booking.bookingservice.model;

import lk.lakshan.booking.model.booking.Booking;
import lk.lakshan.booking.model.customer.Customer;
import lk.lakshan.booking.model.room.Room;

public class DetailResponse implements Response{
    Booking booking;
    Customer customer;
    Room room;

    public DetailResponse(Booking booking, Customer customer, Room room) {
        this.booking = booking;
        this.customer = customer;
        this.room = room;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
