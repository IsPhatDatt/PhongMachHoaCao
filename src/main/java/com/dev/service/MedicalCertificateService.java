/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.service;

import com.dev.pojo.MedicalCertificate;
import com.dev.pojo.MedicalRegister;
import java.util.List;

/**
 *
 * @author Thanh_Tam
 */
public interface MedicalCertificateService {

    MedicalCertificate addMedicalCertificate(MedicalCertificate m);

    MedicalCertificate getMedicalCertificate(int certificateID);

    List<Object[]> getMedicalCertificates(String phone);

    List<MedicalCertificate> getMedicalCertificates(MedicalRegister medicalRegister);

    List<MedicalCertificate> getMedicalCertificates();

    boolean deleteMedicalCertificate(int id);

    boolean addMC(MedicalCertificate mc);

    void updateMedicalCertificate(MedicalCertificate mc, int id);
}
