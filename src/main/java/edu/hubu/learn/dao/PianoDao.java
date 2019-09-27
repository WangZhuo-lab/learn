package edu.hubu.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hubu.learn.entity.Piano;

public interface PianoDao extends JpaRepository<Piano, Long> {

}