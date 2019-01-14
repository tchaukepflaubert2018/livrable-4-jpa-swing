	************************************
*****  	Description de l'application:   	*****
	************************************

Cette application va permettre une gestion des malades. Elle va en quelques sortes permettre d’avoir des informations  sur les antécédents médicaux des patients qui fréquentent l’hôpital au cas où le carnet de santé se serait égaré.  Les cas des accidentées qui arrivent dans un hôpital à partir de leurs noms on pourra avoir accès à leur dossier médical, afin d’éviter par exemple d’administré du glucose (perfusion glucosé) à un diabétique.
•	Enregistré les patients (nom, prénom, matricule, lieu de résidence, fonction)
•	Les vaccins administrés (BCG, polio, rougeole, tétanique ….)
•	Eventuelle opération (rate, cancer, hémorroïde,….)
•	Allergies (aux médicaments, aux aliments, au froid ou à la chaleur…)
•	Transfusion sanguine :( groupe sanguin, plaquettes, rhésus….)
•	Maladie héréditaire 


	************************************
*****  	     Pré-requis avant execution		*****
	************************************
Installer un jdk ou au moins un jre sur son ordinateur.
Pour l'installation merci de suivre les étapes suivantes:

	-Rendez-vous sur la partie Java du site d’Oracle : http://www.oracle.com/technetwork/java
	-Dans la zone de droite ’software downloads’, cliquez sur le lien ’Java SE’ (pour Java Standard Edition)
	-Cliquez sur l’icône ’Java’ pour télécharger le JDK
	-Accepter la licence
	-De préférence choisir la version la plus récente (dernière sur la liste)
		-si votre machine est une 64 bit, choisir le jdk dont le nom a 'windows-X64' avant le '.exe'
		-si votre machine est une 32 bit, choisir le jdk dont le nom a 'windows-i586' avant le '.exe'
		-la version 32 bit fonctionne sur un Système Windows 32 bit ou 64 bit.
	-Cliquez sur le bouton ’Enregistrer le fichier’. Le téléchargement commence
	-Double cliquez sur le fichier téléchargé. L’assistant d’installation du JDK se lance
	-Cliquez sur le bouton ’Next’ des fenêtre qui vont s'afficher
	-Au moment d’installer un environnement d’exécution indépendant du JDK, l’assistant vous consulte. Acceptez les options par défaut et cliquez sur Next
	-Ainsi même si vous supprimez par la suite le répertoire d’installation du JDK (qui contient aussi une JRE), vous pourrez tout de même exécuter des programmes Java sur votre ordinateur
	-Vous arrivez à l’écran de fin d’installation, qui vous précise que l’installation s’est bien déroulée 
	-Cliquez sur Close: L’installation du JDK est terminée. 

	************************************
*****  		Version du jdk utilié		  	*****
	**********************************
java version "1.8.0_20"
Java(TM) SE Runtime Environment (build 1.8.0_20-b26)
Java HotSpot(TM) Client VM (build 25.20-b23, mixed mode)



	************************************
*****  	Documentation:			  	*****
	************************************

Veuillez suivre les indications suivantes:

1) Rendez vous dans le dossier 'Livraison1\doc'.

2) Double cliquez sur 'index.html'.

	
	************************************
***** 	Execution de l'application:    		*****
	************************************

Veuillez suivre les indications suivantes:
	
1) 	A l'aide de votre interpretteur de commande (cmd.exe),
	placer vous dans le dossier où vous avez téléchargé
	le fichier compressé "GestionPatients.jar"
	('cd [chemin]/[dossier cible]').

2)	Entrer la commande 'java -jar GestionPatients.jar'.