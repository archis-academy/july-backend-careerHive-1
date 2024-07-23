package com.archisacademy.career_hive.repository;

import com.archisacademy.career_hive.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}