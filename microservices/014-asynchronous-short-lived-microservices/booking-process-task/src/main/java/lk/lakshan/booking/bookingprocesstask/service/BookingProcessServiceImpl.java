package lk.lakshan.booking.bookingprocesstask.service;

import org.springframework.stereotype.Service;

@Service
public class BookingProcessServiceImpl implements BookingProcessService {

    @Override
    public boolean validateNIC(String nic) {
        return nic.length() > 10;
    }
}
