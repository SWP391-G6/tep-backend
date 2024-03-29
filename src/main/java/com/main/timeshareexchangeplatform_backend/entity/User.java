package com.main.timeshareexchangeplatform_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
//    @Id
//    @GeneratedValue(generator = "UUID", strategy = GenerationType.AUTO)
//    @GenericGenerator(
//            name = "UUID",
//            strategy = "org.hibernate.id.UUIDGenerator"
//    )
//    private UUID user_id;
//    @PrePersist
//    public void generateUUID() {
//        if (user_id == null) {
//            user_id = UUID.randomUUID();
//        }
//    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID user_id;

    @Column(unique = true, columnDefinition = "varchar(50) not null",name = "user_name")
    private String username;


    @Column(unique = true, columnDefinition = "varchar(50)", nullable = false)
    private String email;


    @Column(columnDefinition = "varchar(100)", nullable = false)
    private String password;

    @Column(columnDefinition = "nvarchar(50)", nullable = false)
    private String fullname;

    @Column(unique = true, columnDefinition = "varchar(12)")
    private String phone;

    @Column
    private LocalDate dob;

    @Column
    private Boolean gender;

    @Column
    private boolean status;

    @Column (columnDefinition = "nvarchar(10)", nullable = false)
    private String role;

    @Column(columnDefinition = "DATE", name = "create_date")
    private LocalDate createDate;

    @OneToMany(mappedBy = "user")
    private Collection<Booking> bookings;

    @OneToMany(mappedBy = "postBy")
    private Collection<Timeshare> timeshares;

    @OneToMany(mappedBy = "user")
    private Collection<Transaction_history> transactionHistories;

    @OneToMany(mappedBy = "resquestby")
    private Collection<Request> requests;

    @OneToMany(mappedBy = "responseby")
    private Collection<Request> response;

    @OneToOne(mappedBy = "user")
    private RefreshToken refreshToken;

//    @OneToMany(mappedBy = "user")
//    private Collection<Exchange_information> exchangeInformations;

}
