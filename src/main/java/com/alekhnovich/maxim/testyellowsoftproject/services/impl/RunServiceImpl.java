package com.alekhnovich.maxim.testyellowsoftproject.services.impl;

import com.alekhnovich.maxim.testyellowsoftproject.models.Run;
import com.alekhnovich.maxim.testyellowsoftproject.repositories.RunRepository;
import com.alekhnovich.maxim.testyellowsoftproject.services.RunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RunServiceImpl extends CrudServiceImpl<Run,Long> implements RunService {

    private final RunRepository runRepository;

    @Autowired
    public RunServiceImpl(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    @Override
    public JpaRepository<Run, Long> getRepository() {
        return runRepository;
    }
}