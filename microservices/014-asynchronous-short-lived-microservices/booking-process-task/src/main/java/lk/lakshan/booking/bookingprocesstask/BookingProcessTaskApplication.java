package lk.lakshan.booking.bookingprocesstask;

import lk.lakshan.booking.bookingprocesstask.service.BookingProcessTaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class BookingProcessTaskApplication {

	@Bean
	BookingProcessTaskRunner getBookingProcessTaskRunner(){
		return new BookingProcessTaskRunner();
	}

	public static void main(String[] args) {
		SpringApplication.run(BookingProcessTaskApplication.class, args);
	}

}
