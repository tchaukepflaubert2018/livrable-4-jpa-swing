package com.objis.cameroun.GestionPatients.domaine;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class PatientModel extends AbstractTableModel {

    private final String[] entetes = {"id", "Nom","Prenom","Quartier","Fonction","Age","Sexe","Matricule"};

    private List<Patient> patients;

    public PatientModel(List<Patient> patients) {  
        this.patients = patients; 
    }


    public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}



	@Override
    public int getRowCount() {
        return patients.size();
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                // ID
                return patients.get(rowIndex).getIdPatients();

            case 1:
                // Nom
                return patients.get(rowIndex).getNom();
            case 2:
                // Prenom
                return patients.get(rowIndex).getPrenom();
            case 3:
                // Quartier
                return patients.get(rowIndex).getQuartier();
            case 4:
                // Fonction
                return patients.get(rowIndex).getFonction();
            case 5:
                // Age
                return patients.get(rowIndex).getAge();
            case 6:
            	//Sexe
            	return patients.get(rowIndex).getSexe();
            case 7:
            	//Matricule
            	return patients.get(rowIndex).getMatricule();
            default:
                throw new IllegalArgumentException();

        }
       
        
    }



}
