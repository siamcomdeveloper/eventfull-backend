package com.example.SpringReactMongoProject.Service;


import com.example.SpringReactMongoProject.Entity.Booking;
import com.example.SpringReactMongoProject.Repo.BookingRepo;
import org.springframework.stereotype.Service;

@Service
public class BookingServices {

    private final BookingRepo repo;

    public BookingServices(BookingRepo repo) {
        this.repo = repo;
    }

    public void saveOrUpdate(Booking booking) {
        repo.save(booking);
    }

    public Iterable<Booking> listAll() {
        return this.repo.findAll();
    }

    public void deleteBooking(String id) {
        repo.deleteById(id);
    }

    public Booking getBookingById(String bookingId) {
        return this.repo.findById(bookingId).get();
    }

}
