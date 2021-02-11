package lk.lakshan.booking.bookingservice.model;

import lk.lakshan.booking.model.booking.Booking;

public class SimpleResponse implements Response{
    Booking booking;

    public SimpleResponse(Booking booking) {
        this.booking = booking;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
