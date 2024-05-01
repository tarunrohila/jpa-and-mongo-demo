/*
 * Copyright (c) 2023-present Tech Rohila, All Rights Reserved.
 *
 * This code is confidential to Rohila Technologies and shall not be disclosed
 * outside the organisation without the prior written permission of the IT Director of
 * the organisation.
 *
 * In the event that such disclosure is permitted the code shall not be copied
 * or disclosed other than a need-to-know basis and any recipients may be
 * required to sign a confidentiality undertaking in favour of Tech Rohila
 */

package com.rohila.api.jpaandmongodemo.controller;
/* @@_BEGIN: IMPORTS ---------------------------------------------*/

import com.rohila.api.jpaandmongodemo.entity.Test;
import com.rohila.api.jpaandmongodemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/* @@_END: IMPORTS -----------------------------------------------*/

/* @@_BEGIN: CLASS DEFINITION ------------------------------------*/

/**
 * Class which is used to
 *
 * @author Tarun Rohila
 * @version 1.0
 * @since 14-10-2023 20:12
 */
@RestController
@RequestMapping("/tests/v1")
public class TestSDKController {

    /* @@_BEGIN: LOGGING --------------------------------------------*/
    /* @@_END: LOGGING ----------------------------------------------*/

    /* @@_BEGIN: STATIC ---------------------------------------------*/
    /* @@_END: STATIC -----------------------------------------------*/

    /* @@_BEGIN: MEMBERS --------------------------------------------*/

    @Autowired
    private TestService testService;

    @GetMapping("test")
    public String test() {
        Test test = new Test();
        test.getId();
        return  "success";
    }

    @PostMapping("tests")
    public Test createTests(@RequestBody Test test) {
        return testService.createTests(test);
    }
    /* @@_END: MEMBERS ----------------------------------------------*/

    /* @@_BEGIN: CONSTRUCTION ---------------------------------------*/
    /* @@_END: CONSTRUCTION -----------------------------------------*/

    /* @@_BEGIN: PROPERTIES -----------------------------------------*/
    /* @@_END: PROPERTIES -------------------------------------------*/

    /* @@_BEGIN: METHODS --------------------------------------------*/
    /* @@_END: METHODS ----------------------------------------------*/

    /* @@_BEGIN: GETTERS --------------------------------------------*/
    /* @@_END: GETTERS ----------------------------------------------*/

    /* @@_BEGIN: SETTERS --------------------------------------------*/
    /* @@_END: SETTERS ----------------------------------------------*/
} // TestSDKController
/* @@_END: CLASS DEFINITION --------------------------------------*/