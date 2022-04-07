package com.ead.course.services.imp;

import com.ead.course.repositories.ModuleRepository;
import com.ead.course.services.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleServiceImp implements ModuleService {

    @Autowired
    ModuleRepository moduleRepository;
}
