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
        user3.setEmail("1");
        user3.setPassword("1");
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





        movieRepository.saveAll(Arrays.asList(movie1, movie2));

        // Initialize Theater
        Theater theater1 = new Theater();
        theater1.setName("big Theater");
        theaterRepository.save(theater1);

        Theater theater2 = new Theater();
        theater2.setName("small Theater");
        theaterRepository.save(theater2);

        for (int y = 1; y <= 12; y++) {
            for (int x = 1; x <= 20; x++) {
                Seat seat1 = new Seat();
                seat1.setId(0);
                seat1.setNumberSeat(x);
                seat1.setNumberRow(y);
                if(y<11){
                    seat1.setPrice(15);
                }else {
                    seat1.setPrice(10f);
                }

                seat1.setTheater(theater1);
                seatRepository.save(seat1);
            }
        }
        // Initialize Seats

        for (int y = 1; y <= 16; y++) {
            for (int x = 1; x <= 25; x++) {
                Seat seat2 = new Seat();
                seat2.setId(0);
                seat2.setNumberSeat(x);
                seat2.setNumberRow(y);

                if(y<15){
                    seat2.setPrice(15);
                }else {
                    seat2.setPrice(10f);
                }

                seat2.setTheater(theater2);
                seatRepository.save(seat2);
            }
        }


        System.out.println(seatRepository.findAll().size());



        // Initialize Showings
        Showing showing1 = new Showing();
        showing1.setDate(LocalDate.now());
        showing1.setTime(LocalTime.of(19, 0));
        showing1.setMovie(movie1);
        showing1.setTheater(theater1);

        Showing showing2 = new Showing();
        showing2.setDate(LocalDate.now());
        showing2.setTime(LocalTime.of(21, 0));
        showing2.setMovie(movie2);
        showing2.setTheater(theater2);

        showingRepository.saveAll(Arrays.asList(showing1, showing2));


    }
}
