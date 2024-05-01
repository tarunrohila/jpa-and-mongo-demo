/*
 * Copyright (c) 2024-present Tech Rohila, All Rights Reserved.
 *
 * This code is confidential to Rohila Technologies and shall not be disclosed
 * outside the organisation without the prior written permission of the IT Director of
 * the organisation.
 *
 * In the event that such disclosure is permitted the code shall not be copied
 * or disclosed other than a need-to-know basis and any recipients may be
 * required to sign a confidentiality undertaking in favour of Tech Rohila
 */

package com.rohila.api.jpaandmongodemo.dao.impl;
/* @@_BEGIN: IMPORTS ---------------------------------------------*/

import com.rohila.api.jpaandmongodemo.dao.TestDao;
import com.rohila.api.jpaandmongodemo.entity.Test;
import com.rohila.api.jpaandmongodemo.repository.mongo.TestMongoRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
/* @@_END: IMPORTS -----------------------------------------------*/

/* @@_BEGIN: CLASS DEFINITION ------------------------------------*/

/**
 * Class which is used to
 *
 * @author Tarun Rohila
 * @version 1.0
 * @since 28-04-2024 20:46
 */
@ConditionalOnProperty(prefix = "api.core.svc.db", name = "type", havingValue = "mongodb")
@Component
public class TestMongoDaoImpl implements TestDao {

    /* @@_BEGIN: LOGGING --------------------------------------------*/
    /* @@_END: LOGGING ----------------------------------------------*/

    /* @@_BEGIN: STATIC ---------------------------------------------*/
    /* @@_END: STATIC -----------------------------------------------*/

    /* @@_BEGIN: MEMBERS --------------------------------------------*/
    private TestMongoRepository testRepository;

    public TestMongoDaoImpl(TestMongoRepository testRepository) {
        this.testRepository = testRepository;
    }

    /* @@_END: MEMBERS ----------------------------------------------*/

    /* @@_BEGIN: CONSTRUCTION ---------------------------------------*/
    /* @@_END: CONSTRUCTION -----------------------------------------*/

    /* @@_BEGIN: PROPERTIES -----------------------------------------*/
    /* @@_END: PROPERTIES -------------------------------------------*/

    /* @@_BEGIN: METHODS --------------------------------------------*/

    @Override
    public Test createTests(Test test) {
        return testRepository.save(test);
    }
    /* @@_END: METHODS ----------------------------------------------*/

    /* @@_BEGIN: GETTERS --------------------------------------------*/
    /* @@_END: GETTERS ----------------------------------------------*/

    /* @@_BEGIN: SETTERS --------------------------------------------*/
    /* @@_END: SETTERS ----------------------------------------------*/
} // TestJpaDaoImpl
/* @@_END: CLASS DEFINITION --------------------------------------*/