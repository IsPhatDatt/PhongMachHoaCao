/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.service;

import com.dev.pojo.MedicalRegister;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Thanh_Tam
 */
public interface StatsService {
        List<MedicalRegister> registerStats(Date fromDate, Date toDate); 
}
