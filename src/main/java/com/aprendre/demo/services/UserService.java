package com.aprendre.demo.services;

import com.aprendre.demo.classes.UserRecord;
import com.aprendre.demo.repository.UserRecorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRecorRepository userRecorRepository;

    public List<UserRecord> getAllUser()
    {

    }
}
