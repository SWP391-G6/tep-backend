package com.main.timeshareexchangeplatform_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TimeshareDTO {
    private int timeshare_id;
    private LocalDate date_start;
    private LocalDate date_end;
    private int nights;
    private long price;
    private boolean status;
    private String name;
    private String post_by;
    private int destination_id;
    private String description;
    private String image_url;
}