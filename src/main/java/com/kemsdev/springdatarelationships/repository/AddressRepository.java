package com.kemsdev.springdatarelationships.repository;

import com.kemsdev.springdatarelationships.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {


}
