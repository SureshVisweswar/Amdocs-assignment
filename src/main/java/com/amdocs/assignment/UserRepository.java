package com.amdocs.assignment;
import org.springframework.data.jpa.repository.JpaRepository;
interface UserRepository extends JpaRepository<Users, String> {

}

