package com.example.GumballApp.components;

import com.example.GumballApp.models.Customer;
import com.example.GumballApp.models.Listing;
import com.example.GumballApp.repositories.CustomerRepository.CustomerRepository;
import com.example.GumballApp.repositories.ListingRepository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ListingRepository listingRepository;

public DataLoader(){

}

public void run(ApplicationArguments args) {

    Customer customer1 = new Customer("Kevin", "Allan",
            "1 Main Street", "Edinburgh",
            "0131-555-5656", "kevinAllan@yahoo.com");
    customerRepository.save(customer1);


    Customer customer2 = new Customer("Gerry", "Waterston",
            "19 Happy Street, Porty", "Edinburgh",
            "0131-654-3493", "gwaterston@yahoo.com");
    customerRepository.save(customer2);

    Customer customer3 = new Customer("Mark", "Mackay",
            "26 Kirklands", "Innerleithen",
            "01896831723", "mark@yahoo.com");
    customerRepository.save(customer3);

    Customer customer4 = new Customer("Keith", "Allan",
            "45 Buchanan Road", "Glasgow",
            "0141-599-5689", "keithAllan@yahoo.com");
    customerRepository.save(customer4);


    Customer customer5 = new Customer("John", "Doe",
            "19 Waverley Street", "Aberdeen",
            "01921-654-3493", "johndoe@yahoo.com");
    customerRepository.save(customer5);

    Customer customer6 = new Customer("Alison", "McFerson",
            "18 Blah Road", "London",
            "01213443553", "alisonmcferson@yahoo.com");
    customerRepository.save(customer6);

    Customer customer7 = new Customer("Shiela", "Anderson",
            "24 Morningside Road", "Edinburgh",
            "0131-654-3493", "shielaAnderson@yahoo.com");
    customerRepository.save(customer7);

    Customer customer8 = new Customer("Sian", "McCodeClan",
            "14 High Street", "Innerleithen",
            "01416831723", "sian@yahoo.com");
    customerRepository.save(customer8);

    Listing listing1 = new Listing("bike", "mountain",
            "Sports & Leisure", 35.00, "https://p.vitalmtb.com/photos/users/109/photos/80569/s1600_BT_20140818_untitled_shoot_322.jpg?1408418564", customer1);
             listing1.setSearchCounter(500L);
    listingRepository.save(listing1);


    Listing listing2 = new Listing("cooker", "vintage aga",
            "Kitchenware", 450.00, "https://i.dailymail.co.uk/i/pix/2014/08/22/1408747535424_wps_3_AGA_4_oven_cooker_BCGYDN.jpg", customer1);
    listing2.setSearchCounter(250L);
    listingRepository.save(listing2);


    Listing listing3 = new Listing("shoes", "Old clown shoes",
            "Clothing", 22.00, "https://images-na.ssl-images-amazon.com/images/I/619vcTzBpFL._UX466_.jpg", customer1);
    listing3.setSearchCounter (499L);
    listingRepository.save(listing3);


    Listing listing4 = new Listing("IT", "horror",
            "Books", 5.00, "https://images-na.ssl-images-amazon.com/images/I/71lZgzNE2kL.jpg", customer1);
    listing4.setSearchCounter(321L);
    listingRepository.save(listing4);

    Listing listing5 = new Listing("computer", "amiga",
            "Computing and Technology", 35.00, "http://www.classiccmp.org/dunfield/amiga/h/a500.jpg", customer3);
    listing5.setSearchCounter(172L);
    listingRepository.save(listing5);


    Listing listing6 = new Listing("Tent", "4 Person",
            "Sports & Leisure", 89.00, "https://images-na.ssl-images-amazon.com/images/I/719MITlFcQL._SL1000_.jpg", customer1);
    listing6.setSearchCounter(342L);
    listingRepository.save(listing6);


    Listing listing7 = new Listing("hairdryer", "blows hot air",
            "Health and Beauty", 24.00,"https://target.scene7.com/is/image/Target/GUEST_2b29c8e7-736a-453a-b3f3-728db975536c?wid=488&hei=488&fmt=pjpeg", customer1);
    listing7.setSearchCounter(50L);
    listingRepository.save(listing7);


    Listing listing8 = new Listing("Java for Dummies", "Reference book",
            "Books", 12.00, "https://images-na.ssl-images-amazon.com/images/I/51Gck4g%2By9L._SX383_BO1,204,203,200_.jpg", customer6);
    listing8.setSearchCounter(249L);
    listingRepository.save(listing8);


    Listing listing9 = new Listing("bike", "folding",
            "Sports & Leisure", 35.00, "https://unitedbike.com/sites/default/files/Resize%20of%20IMG_1736_0.jpg", customer1);
    listing9.setSearchCounter(101L);
    listingRepository.save(listing9);


    Listing listing10 = new Listing("cooker", "electric",
            "Kitchenware", 60.00, "https://da1urhpfd469z.cloudfront.net/uploads/advertphotos/18/0824/35838294-588-640x853.jpg", customer1);
    listing10.setSearchCounter(523L);
    listingRepository.save(listing10);

    Listing listing11 = new Listing("car", "volkswagen golf",
            "Automotive", 1500.00, "https://imgd.aeplcdn.com/300x225/cw/ucp/stockApiImg/YUONHR3_1599081_1_13144658.jpeg?q=85", customer1);
    listing11.setSearchCounter(5L);
    listingRepository.save(listing11);


    Listing listing12 = new Listing("tomatoes", "allotment surplus",
            "Kitchenware", 120.00, "https://www.thompson-morgan.com/product_images/100/zoom/z-TOMA-TM54735-A_h.jpg", customer1);
    listing12.setSearchCounter(235L);
    listingRepository.save(listing12);

//    Listing listing13 = new Listing("bike", "boneshaker",
//            "Sports & Leisure", 35.00, customer1);
//    listing13.setSearchCounter(401L);
//    listingRepository.save(listing13);
//
//    Listing listing14= new Listing("cooker", "aga",
//            "Kitchenware", 105.00, customer1);
//    listing14.setSearchCounter(111L);
//    listingRepository.save(listing14);
//
//    Listing listing15 = new Listing("bike", "boneshaker",
//            "Sports & Leisure", 35.00, customer1);
//    listing15.setSearchCounter(297L);
//    listingRepository.save(listing15);
//
//
//    Listing listing16 = new Listing("cooker", "aga",
//            "Kitchenware", 125.00, customer1);
//    listing16.setSearchCounter(351L);
//    listingRepository.save(listing16);
//
//    Listing listing17 = new Listing("bike", "boneshaker",
//            "Sports & Leisure", 35.00, customer1);
//    listing17.setSearchCounter(23L);
//    listingRepository.save(listing17);
//
//    Listing listing18= new Listing("cooker", "aga",
//            "Kitchenware", 200.00, customer1);
//    listing18.setSearchCounter(539L);
//    listingRepository.save(listing18);
//
//    Listing listing19 = new Listing("bike", "boneshaker",
//            "Sports & Leisure", 16.00, customer1);
//    listing19.setSearchCounter(491L);
//    listingRepository.save(listing19);
//
//
//    Listing listing20 = new Listing("cooker", "aga",
//            "Kitchenware", 100.00, customer1);
//    listing20.setSearchCounter(222L);
//    listingRepository.save(listing20);
//
//
//    Listing listing21 = new Listing("bike", "boneshaker",
//            "Sports & Leisure", 37.00, customer1);
//    listing21.setSearchCounter(317L);
//    listingRepository.save(listing21);
//
//
//    Listing listing22 = new Listing("cooker", "aga",
//            "Kitchenware", 135.00, customer1);
//    listing22.setSearchCounter(567L);
//    listingRepository.save(listing22);
//
//    Listing listing23 = new Listing("Trouser", "Chinos",
//            "Clothing", 22.00, customer1);
//    listingRepository.save(listing3);
//
//
//    Listing listing24 = new Listing("IT", "Steven King Book",
//            "Books", 5.00, customer1);
//    listingRepository.save(listing24);
//
//    Listing listing25 = new Listing("laptop", "macbook pro",
//            "Computing and Technology", 35.00, customer3);
//    listingRepository.save(listing25);
//
//
//    Listing listing26 = new Listing("Tent", "4 Person",
//            "Sports & Leisure", 89.00, customer3);
//    listingRepository.save(listing26);
//
//
//    Listing listing27 = new Listing("games console", "playstation",
//            "Computing and Technology", 24.00, customer3);
//    listingRepository.save(listing27);
//
//
//    Listing listing28 = new Listing("Java for Dummies", "Reference book",
//            "Books", 12.00, customer6);
//    listingRepository.save(listing28);
//
//
//    Listing listing29 = new Listing("bike", "boneshaker",
//            "Sports & Leisure", 15.00, customer6);
//    listingRepository.save(listing29);
//
//
//    Listing listing30 = new Listing("cooker", "aga",
//            "Kitchenware", 150.00, customer6);
//    listingRepository.save(listing30);
//
//    Listing listing31 = new Listing("bike", "boneshaker",
//            "Sports & Leisure", 20.00, customer4);
//    listingRepository.save(listing31);
//
//
//    Listing listing32 = new Listing("cooker", "aga",
//            "Kitchenware", 155.00, customer4);
//    listingRepository.save(listing32);

//    Listing listing33 = new Listing("bike", "boneshaker",
//            "Sports & Leisure", 105.00, customer7);
//    listingRepository.save(listing33);
//
//
//    Listing listing34= new Listing("cooker", "aga",
//            "Kitchenware", 100.00, customer7);
//    listingRepository.save(listing34);
//
//    Listing listing35 = new Listing("bike", "boneshaker",
//            "Sports & Leisure", 78.00, customer7);
//    listingRepository.save(listing35);
//
//
//    Listing listing36 = new Listing("cooker", "aga",
//            "Kitchenware", 90.00, customer3);
//    listingRepository.save(listing36);
//
//    Listing listing37 = new Listing("bike", "boneshaker",
//            "Sports & Leisure", 55.00, customer3);
//    listingRepository.save(listing37);
//
//
//    Listing listing38= new Listing("Mixer", "Mulinex",
//            "Kitchenware", 54.00, customer1);
//    listingRepository.save(listing38);
//
//    Listing listing39 = new Listing("Scooter", "Zippy Flyer",
//            "Sports & Leisure", 25.00, customer3);
//    listingRepository.save(listing39);
//
//
//    Listing listing40 = new Listing("cooker", "Hotpoint",
//            "Kitchenware", 95.00, customer1);
//    listingRepository.save(listing40);
//
//    Listing listing41 = new Listing("bike", "Mountain",
//            "Sports & Leisure", 136.00, customer1);
//    listingRepository.save(listing41);
//
   }
}
