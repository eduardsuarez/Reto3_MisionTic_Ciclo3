/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Reto3.Reto3.repository;

import com.Reto3.Reto3.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author eduar
 */
public interface AdminRepository extends JpaRepository<Admin, Integer>{
    
}
