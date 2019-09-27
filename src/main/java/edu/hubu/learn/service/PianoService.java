package edu.hubu.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.PianoDao;
import edu.hubu.learn.entity.Piano;

@Service
public class PianoService {

    @Autowired
    private PianoDao pianoDao;

    public Piano getPiano(Long id) {
        return pianoDao.findById(id).get();
    }
}