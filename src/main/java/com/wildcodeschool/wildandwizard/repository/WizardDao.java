package com.wildcodeschool.wildandwizard.repository;

import com.wildcodeschool.wildandwizard.entity.Wizard;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface WizardDao{

    Wizard save(Wizard entity);

    Wizard findById(Long id);

    List<Wizard> findAll();

    Wizard update(Wizard entity);

    void deleteById(Long id);
}