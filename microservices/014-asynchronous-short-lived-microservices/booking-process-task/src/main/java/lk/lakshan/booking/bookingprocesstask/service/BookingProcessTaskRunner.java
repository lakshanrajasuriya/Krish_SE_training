package lk.lakshan.booking.bookingprocesstask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class BookingProcessTaskRunner implements CommandLineRunner {

    @Autowired
    BookingProcessService bookingProcessService;

    @Override
    public void run(String... args) throws Exception {

        if (args.length > 0) {
            System.out.println("task running with arguments");

            if (bookingProcessService.validateNIC(args[0])) {
                System.out.println("Validate NIC");
            } else {
                System.out.println("Invalid NIC");
            }
        } else
            System.out.println("task running without arguments");

    }
}
