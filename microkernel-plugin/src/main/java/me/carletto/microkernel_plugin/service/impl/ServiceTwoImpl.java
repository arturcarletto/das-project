package me.carletto.microkernel_plugin.service.impl;

import me.carletto.microkernel_interface.service.DefaultService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ServiceTwoImpl implements DefaultService {

    @Override
    public HttpStatus doWork(HashMap<String, String> params) {
        System.out.println("Service TWO");
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

}
