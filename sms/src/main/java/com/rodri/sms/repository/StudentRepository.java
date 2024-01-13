package com.rodri.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodri.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
