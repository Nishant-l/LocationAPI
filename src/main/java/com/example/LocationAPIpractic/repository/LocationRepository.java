package com.example.LocationAPIpractic.repository;

import com.example.LocationAPIpractic.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}
