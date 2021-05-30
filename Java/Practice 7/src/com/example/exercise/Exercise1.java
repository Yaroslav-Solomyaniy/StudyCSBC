package com.example.exercise;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.City;

/**
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public class Exercise1 {
    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        List<City> highPopulatedCitiesOfCountries = countryDao.findAllCountries()
                .stream()
                .map(country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation)))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        highPopulatedCitiesOfCountries.forEach(System.out::println);
        printTimeStamp();
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }
}
