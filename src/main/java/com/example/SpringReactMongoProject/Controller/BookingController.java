package com.example.SpringReactMongoProject.Controller;

import com.example.SpringReactMongoProject.Entity.Booking;
import com.example.SpringReactMongoProject.Entity.User;
import com.example.SpringReactMongoProject.Service.BookingServices;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/booking")
public class BookingController {

    private final BookingServices bookingServices;

    public BookingController(BookingServices bookingServices) {
        this.bookingServices = bookingServices;
    }

    @PostMapping(value = "/save")
    private String saveVendor(@RequestBody Booking booking){
        bookingServices.saveOrUpdate(booking);
        return booking.get_id();
    }

    @GetMapping(value = "/getall")
    private Iterable<Booking> getBookings(){
        return bookingServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private Booking update(@RequestBody Booking booking, @PathVariable(name="id")String _id){
        booking.set_id(_id);
        bookingServices.saveOrUpdate(booking);
        return booking;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteBooking(@PathVariable("id") String _id){
        bookingServices.deleteBooking(_id);
    }

    @RequestMapping("/search/{id}")
    private Booking getBooking(@PathVariable(name="id")String bookingId){
        return bookingServices.getBookingById(bookingId);
    }

}
