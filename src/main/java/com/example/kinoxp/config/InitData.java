package com.example.kinoxp.config;

import com.example.kinoxp.model.*;
import com.example.kinoxp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

@Component
public class InitData implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private TheaterRepository theaterRepository;
    @Autowired
    private SeatRepository seatRepository;
    @Autowired
    private ShowingRepository showingRepository;
    @Autowired
    private ReservationRepository reservationRepository;


    @Override
    public void run(String... args) throws Exception {
        // Initialize Users
        User user1 = new User();
        user1.setEmail("user1@example.com");
        user1.setPassword("password1");
        user1.setPrivilegeLevel(PrivilegeLevel.CUSTOMER);
        user1.setPhoneNumber(123456789);

        User user2 = new User();
        user2.setEmail("user2@example.com");
        user2.setPassword("password2");
        user2.setPrivilegeLevel(PrivilegeLevel.CUSTOMER);
        user2.setPhoneNumber(987654321);

        User user3 = new User();
        user3.setEmail("user3@example.com");
        user3.setPassword("password3");
        user3.setPrivilegeLevel(PrivilegeLevel.ADMINISTRATOR);
        user3.setPhoneNumber(555555555);

        userRepository.saveAll(Arrays.asList(user1, user2, user3));

        // Initialize Movies
        Movie movie1 = new Movie();
        movie1.setTitle("Horror Movie");
        movie1.setCategory(Category.HORROR);
        movie1.setDescription("A scary horror movie");
        movie1.setDuration(Duration.ofMinutes(120));
        movie1.setPrice(9.99f);

        Movie movie2 = new Movie();
        movie2.setTitle("Romantic Movie");
        movie2.setCategory(Category.ROMANCE);
        movie2.setDescription("A lovely romance movie");
        movie2.setDuration(Duration.ofMinutes(110));
        movie2.setPrice(8.99f);

        Movie movie3 = new Movie();
        movie3.setTitle("Action Movie");
        movie3.setCategory(Category.ACTION);
        movie3.setDescription("An intense action movie");
        movie3.setDuration(Duration.ofMinutes(130));
        movie3.setPrice(10.99f);

        Movie movie4 = new Movie();
        movie4.setTitle("Horror Movie");
        movie4.setCategory(Category.HORROR);
        movie4.setDescription("A scary horror movie");
        movie4.setDuration(Duration.ofMinutes(120));
        movie4.setPrice(9.99f);

        Movie movie5 = new Movie();
        movie5.setTitle("Horror Movie");
        movie5.setCategory(Category.HORROR);
        movie5.setDescription("A scary horror movie");
        movie5.setDuration(Duration.ofMinutes(120));
        movie5.setPrice(9.99f);

        Movie movie6 = new Movie();
        movie6.setTitle("Horror Movie");
        movie6.setCategory(Category.HORROR);
        movie6.setDescription("A scary horror movie");
        movie6.setDuration(Duration.ofMinutes(120));
        movie6.setPrice(9.99f);

        Movie movie7 = new Movie();
        movie7.setTitle("Horror Movie");
        movie7.setCategory(Category.HORROR);
        movie7.setDescription("A scary horror movie");
        movie7.setDuration(Duration.ofMinutes(120));
        movie7.setPrice(9.99f);

        Movie movie8 = new Movie();
        movie8.setTitle("Horror Movie");
        movie8.setCategory(Category.HORROR);
        movie8.setDescription("A scary horror movie");
        movie8.setDuration(Duration.ofMinutes(120));
        movie8.setPrice(9.99f);

        Movie movie9 = new Movie();
        movie9.setTitle("Horror Movie");
        movie9.setCategory(Category.HORROR);
        movie9.setDescription("A scary horror movie");
        movie9.setDuration(Duration.ofMinutes(120));
        movie9.setPrice(9.99f);

        Movie movie10 = new Movie();
        movie10.setTitle("Horror Movie");
        movie10.setCategory(Category.HORROR);
        movie10.setDescription("A scary horror movie");
        movie10.setDuration(Duration.ofMinutes(120));
        movie10.setPrice(9.99f);

        Movie movie11 = new Movie();
        movie11.setTitle("Horror Movie");
        movie11.setCategory(Category.HORROR);
        movie11.setDescription("A scary horror movie");
        movie11.setDuration(Duration.ofMinutes(120));
        movie11.setPrice(9.99f);



        movieRepository.saveAll(Arrays.asList(movie1, movie2, movie3,movie4,movie5,movie6,movie7,movie8,movie9,movie11,movie10));

        // Initialize Theater
        Theater theater = new Theater();
        theater.setName("Main Theater");
        theaterRepository.save(theater);

        // Initialize Seats
        Seat seat1 = new Seat();
        seat1.setNumberRow(1);
        seat1.setNumberSeat(1);
        seat1.setPrice(12.50f);
        seat1.setTheater(theater);

        Seat seat2 = new Seat();
        seat2.setNumberRow(1);
        seat2.setNumberSeat(2);
        seat2.setPrice(12.50f);
        seat2.setTheater(theater);

        seatRepository.saveAll(Arrays.asList(seat1, seat2));

        // Initialize Showings
        Showing showing1 = new Showing();
        showing1.setDate(LocalDate.now());
        showing1.setTime(LocalTime.of(19, 0));
        showing1.setMovie(movie1);
        showing1.setTheater(theater);

        Showing showing2 = new Showing();
        showing2.setDate(LocalDate.now());
        showing2.setTime(LocalTime.of(21, 0));
        showing2.setMovie(movie2);
        showing2.setTheater(theater);

        showingRepository.saveAll(Arrays.asList(showing1, showing2));

        // Initialize Reservations
        Reservation reservation1 = new Reservation();
        reservation1.setShowing(showing1);
        reservation1.setSeat(seat1);
        reservation1.setUser(user1);

        Reservation reservation2 = new Reservation();
        reservation2.setShowing(showing2);
        reservation2.setSeat(seat2);
        reservation2.setUser(user2);

        reservationRepository.saveAll(Arrays.asList(reservation1, reservation2));
    }
}
