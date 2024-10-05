package me.carletto.microkernel_interface.service;

import org.springframework.http.HttpStatus;

import java.util.HashMap;

public interface DefaultService {

    HttpStatus doWork(HashMap<String, String> params);
}
