package com.example.LocationAPIpractic.service;

import com.example.LocationAPIpractic.repository.LocationRepository;
import com.example.LocationAPIpractic.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationRepository locationRepository;

    public List<Location> retrieveLocations() {
        return (List<Location>) locationRepository.findAll();
    }
}

