package com.objis.cameroun.GestionPatients.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Acceuil {

	private JFrame frmAcceuil;

	/**
	 * @param args c'est la classe qui contient la methode qui permet de lancer mon application 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			/* (non-Javadoc)
			 * @see java.lang.Runnable#run()
			 */
			public void run() {
				try {
					Acceuil window = new Acceuil();
					window.frmAcceuil.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Acceuil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAcceuil = new JFrame();
		frmAcceuil.setTitle("Acceuil");
		frmAcceuil.setBounds(100, 100, 450, 300);
		frmAcceuil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmAcceuil.setJMenuBar(menuBar);
		
		JMenu mnPatient = new JMenu("Patient");
		menuBar.add(mnPatient);
		
		JMenuItem mntmEnregistrer = new JMenuItem("Enregistrer");
		mntmEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Enregistrer frame = new Enregistrer();
				frame.setVisible(true);
			}
		});
		mnPatient.add(mntmEnregistrer);
		
		JMenuItem mntmListpatient = new JMenuItem("ListPatient");
		mntmListpatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListPatient frame = new ListPatient();
				frame.setVisible(true);
			}
		});
		mnPatient.add(mntmListpatient);
		
		JMenuItem mntmModifier = new JMenuItem("Modifier");
		mnPatient.add(mntmModifier);
		
		JMenuItem mntmSupprimer = new JMenuItem("Supprimer");
		mnPatient.add(mntmSupprimer);
		
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mnPatient.add(mntmQuitter);
		
		JMenu mnMedecin = new JMenu("Medecin");
		menuBar.add(mnMedecin);
		frmAcceuil.getContentPane().setLayout(null);
		
		JLabel lblMessage = new JLabel("Bienvenue dans mon application de gestion des patients dans les hopitaux clinic et centre de sante");
		lblMessage.setForeground(Color.PINK);
		lblMessage.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblMessage.setBounds(10, 164, 414, 35);
		frmAcceuil.getContentPane().add(lblMessage);
	}
}
