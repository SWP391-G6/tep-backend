package com.main.timeshareexchangeplatform_backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "request")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID request_id;

    @Column(columnDefinition = "nvarchar(max) not null", unique = true)
    private String requestCode;

    @Column(columnDefinition = "DATE", nullable = false)
    private LocalDate create_date;

    @Column(columnDefinition = "nvarchar(max) not null")
    private String message;

    @Column
    private int status;

//    @Column(columnDefinition = "nvarchar(max) not null")
//    private String request_to;



    @ManyToOne
    @JoinColumn(name = "resquest_by", unique = false)
    private User resquestby;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "timeshare_request_id", nullable = true)
    private Timeshare timeshare_request;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "timeshare_response_id", nullable = true)
    private Timeshare timeshare_response;


//    @OneToOne(mappedBy = "request")
//    private Request_history requestHistory;

    @ManyToOne
    @JoinColumn(name = "response_by", nullable = true)
    private User responseby;
}
