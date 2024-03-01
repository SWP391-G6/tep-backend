package com.main.timeshareexchangeplatform_backend.service;

import com.main.timeshareexchangeplatform_backend.dto.BookingModel;

import java.util.List;
import java.util.UUID;

public interface IBookingService {
    BookingModel addBooking(BookingModel bookingModel);

    List<BookingModel> showAllBooking(UUID userId);

}
