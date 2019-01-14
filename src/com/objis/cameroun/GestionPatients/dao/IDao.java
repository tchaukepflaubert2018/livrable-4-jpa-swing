package com.objis.cameroun.GestionPatients.dao;

import java.util.List;

import com.objis.cameroun.GestionPatients.domaine.Patient;

/**
 * Interface generique: qui contient uniquement
 * les signatures des methodes qui vont etre implementer par Dao
 * 
 * @author FLAUBERT
 * 
 *@version 1.0 \\ premiere version de mon programme
 */
public interface IDao {
public int savePatientDao(Patient Patient);
public List<Patient> getAllPatientDao();
}
