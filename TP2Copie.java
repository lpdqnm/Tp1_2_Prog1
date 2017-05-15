
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe TP2 ici.
 * 
 * @author Leopold Quenum 
 * @version (une date)
 *
 * QUEL16107105
 * (votre adresse de courriel)
 */

public class TP2Copie {

    ////////////////
    // CONSTANTES //
    ////////////////

    public final static String MSG_PRESENTATION = "Ce programme permet de "
        + "construire et modifier un horaire de cours.";
    public final static String MSG_FIN = "\n\nFIN NORMALE DU PROGRAMME.";

    public final static char CHOIX_MENU_MIN = '1';
    public final static char CHOIX_MENU_MAX = '5';
    public final static String TITRE_MENU = "MENU";
    public final static String MSG_SOL_CHOIX_MENU = "ENTREZ VOTRE CHOIX : ";
    public final static String MSG_ERR_CHOIX_MENU = "Erreur, entrez une"
        + " valeur entre 1 et 5... Recommencez.";
    public final static String CATEGORIE_MENU = "choisirMenu";

    public final static char CHOIX_AJOUTER_COURS = CHOIX_MENU_MIN;
    public final static String TITRE_AJOUTER_COURS = "AJOUTER UN COURS A " 
    		+ "L'HORAIRE";
    
    public final static String MSG_SOL_SIGLE_COURS = "Sigle du cours : ";
    public final static String MSG_ERR_SIGLE_COURS = "Erreur, le sigle du"
        + " cours doit etre compose de 3 lettres suivies de 4 chiffres...";
    public final static String CATEGORIE_SIGLE = "entrerSigle";
    public final static String MSG_EXISTANCE_SIGLE = "Ce cours ne peut etre "
    	+ "ajoute car il est deja present dans votre horaire.";

    public final static String MSG_SOL_JOUR_COURS = "Jour du cours : ";
    public final static String MSG_ERR_JOUR_COURS = "Erreur, le jour doit" 
    	+ " etre : lundi, mardi, mercredi, jeudi ou vendredi...";
    public final static String JOUR_1 = "lundi";
    public final static String JOUR_2 = "mardi";
    public final static String JOUR_3 = "mercredi";
    public final static String JOUR_4 = "jeudi";
    public final static String JOUR_5 = "vendredi";
    public final static char JOUR_1_CHIFFRE = '1';
    public final static char JOUR_5_CHIFFRE = '5';
    public final static String CATEGORIE_JOUR = "entrerJour";

    public final static String MSG_SOL_MOMENT_COURS = "Moment du jour de ce "
    	+ "cours : ";
    public final static String MSG_ERR_MOMENT_COURS = "Erreur, le moment du" 
    	+ " jour doit etre : am, pm, ou soir...";
    public final static String MOMENT_1 = "am";
    public final static String MOMENT_2 = "pm";
    public final static String MOMENT_3 = "soir";
    public final static String CATEGORIE_MOMENT = "entrerMoment";
    public final static String MSG_EXISTANCE_PLAGE_HOR = "Il existe deja un "
    	+ "cours (ou laboratoire) dans la plage horaire : ";
    
    public final static String MSG_SOL_GROUPE = "Groupe du cours : ";
    public final static String MSG_ERR_GROUPE = "Erreur, le groupe du cours " 
        	+ "est invalide...";
    public final static String CATEGORIE_GROUPE = "entrerGroupe";
    
    public final static String MSG_SOL_LAB = "Ce cours comprend-il une " 
    		+ "periode de laboratoire (oui ou non) ? ";
    public final static String MSG_ERR_LAB = "Repondez par OUI ou par NON..."; 
    public final static String CATEGORIE_LAB = "repondreLabo";
    public final static String MSG_SOL_JOUR_LAB = "Jour du laboratoire : ";
    public final static String MSG_SOL_MOM_LAB = "Moment du jour de ce "
    + "laboratoire : ";
    
    public final static String TITRE_ANNULATION = "OPERATION ANNULEE.";
    public final static String MSG_PAUSE = "Appuyez sur \"ENTREE\" pour "
    		+ "continuer...";

    public final static String SEP = "|"; //pipe pour separer dans l'horaire
    //pipe plus 1 espace pour separer dans affichage horaire
    public final static String SEP_VID = SEP + " "; 
    
    public final static char CHOIX_AFFICHER_HOR = '3';
    //Caracteres pour souligner avec la methode traitVertical()
    public final static char CAR_SOUL_1 = '-';
    public final static char CAR_SOUL_2 = '*';
    public final static char CAR_SOUL_3 = '=';
    public final static String TITRE_HOR = "HORAIRE";
    public final static int LARGEUR_HOR = 79;
    public final static String MOMENT_1_HOR = "MATIN";
    public final static String MOMENT_2_HOR = "APRES-MIDI";
    public final static String MOMENT_3_HOR = "SOIREE";
    public final static String FORMAT_AFF_HOR = "%-12S%-22S%-22S%-22S%1S";
    
    public final static char CHOIX_SUPP_COURS = '2';
    public final static String TITRE_SUPP_COURS = "SUPPRIMER UN COURS A "
            + "L'HORAIRE";
    public final static String MSG_ANNULER_SUPP = "L'horaire ne "
            + "contient aucun cours.";
    public final static String MSG_ANNULER_OP_SUPP_CRS = "Ce cours n'est pas"
            + " a l'horaire.";
    
    public final static char CHOIX_SUPP_TS_COURS = '4';
    public final static String TITRE_SUPP_TS_CRS = "EFFACER TOUS LES COURS"
    		+ " A L'HORAIRE";
    public final static String MSG_CONFIRM_EFF_TS_CRS = "Voulez-vous vraiment"
    		+ " supprimer tous les cours de cet horaire (OUI ou NON) ? ";
    
    
    // Autres m�thodes s'il y a lieu

    public static void main (String[] params) {

        String horaire = "";
        String choix;
        char choixCar;
        
        //Debut
        System.out.println(MSG_PRESENTATION);
        
        do {
        	choix = choixMenu();
        	choixCar = choix.charAt(0);
        	if (choixCar == CHOIX_AJOUTER_COURS) {
        		horaire = ajouterCours(horaire);
        	} else if (choixCar == CHOIX_SUPP_COURS) {
        		horaire = supprimerUnCours(horaire);
			} else if (choixCar == CHOIX_AFFICHER_HOR) {
				afficherHoraire(horaire);
				System.out.println(horaire);//Test
			} else if (choixCar == CHOIX_SUPP_TS_COURS) {
				horaire = supprimerTousCours(horaire);
			}
        	
        } while(choixCar != CHOIX_MENU_MAX);
        
        //Tests
        //System.out.println(entreeValide("", CATEGORIE_MENU));
        
        //Fin
        System.out.println(MSG_FIN);
    } // main

     /**
     * Un exemple de méthode - remplacez ce commentaire par le vôf4tre
     *
     * @param  y   un paramètre pour cette méthode
     * @param  x   un autre paramètre
     * @return     la somme des deux paramètres
     */
    public static String choixMenu()
    {
        String choix;
        //afficherMenu();
        choix = validerEntree(MSG_SOL_CHOIX_MENU, MSG_ERR_CHOIX_MENU, CATEGORIE_MENU);
        
        return choix;
    } // choixMenu

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôf4tre
     *
     */
    public static void afficherMenu () {
        String menu = "1. AJOUTER UN COURS A L'HORAIRE\n"
            + "2. SUPPRIMER UN COURS A L'HORAIRE\n"
            + "3. VISUALISER L'HORAIRE\n"
            + "4. EFFACER TOUS LES COURS A L'HORAIRE\n"
            + "5. QUITTER LE PROGRAMME\n"
            + "\n";
        
        encadrerTitre(TITRE_MENU, CAR_SOUL_1);
        System.out.print(menu);
    } // afficherMenu

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôf4tre
     *
     * @param  y   un paramètre pour cette méthode
     * @param  x   un autre paramètre
     * @return     la somme des deux paramètres
     */
    public static String validerEntree(String msgSoll, String msgErr, 
            String categorie)
    {
        String entreeClavier;
        boolean entreeClavierValide = false;
        do {
            //Afficher d'abord le menu, avant le message de sollicitation
        	//du menu
        	if (categorie.equals(CATEGORIE_MENU)) {
                afficherMenu();
            }
            System.out.print(msgSoll);
            entreeClavier = Clavier.lireString();
            entreeClavierValide = entreeValide(entreeClavier, categorie);
            if (!entreeClavierValide){
            	System.out.println();
            	System.out.println(msgErr);
            }
        } while(!entreeClavierValide);
        return entreeClavier.toLowerCase();
    } // validerEntree

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôf4tre
     *
     * @param  y   un paramètre pour cette méthode
     * @param  x   un autre paramètre
     * @return     la somme des deux paramètres
     */
    public static boolean entreeValide(String entree, String categorie)
    {
        boolean validiteEntree = false;

        if (entree != null) {
            switch (categorie) {
                case CATEGORIE_MENU :
                    validiteEntree = entree.length() == 1 
                        && chaineValide(entree, CHOIX_MENU_MIN, CHOIX_MENU_MAX);
                    break;
                case CATEGORIE_SIGLE :
                    validiteEntree = entree.length() == 7 
                        && chaineValide(entree.substring(0, 3), 'a', 'z')
                        && chaineValide(entree.substring(3), '0', '9');
                    break;
                case CATEGORIE_JOUR :
                    validiteEntree = chaineValide("" + jourEnChiffre(entree), 
						JOUR_1_CHIFFRE, JOUR_5_CHIFFRE);
                    break;
                case CATEGORIE_MOMENT :
                	validiteEntree = entree.equalsIgnoreCase(MOMENT_1) 
                		|| entree.equalsIgnoreCase(MOMENT_2) 
                		|| entree.equalsIgnoreCase(MOMENT_3);
                	break;
                case CATEGORIE_GROUPE :
                	//Valide uniqement si la chaine entree comporte 2 chiffres
                    validiteEntree = entree.length() == 2 
                        && chaineValide(entree, '0', '9');
                    break;
                case CATEGORIE_LAB :
                	validiteEntree = entree.equalsIgnoreCase("oui") 
                		|| entree.equalsIgnoreCase("non");
                	break;
            }
        }
        return validiteEntree;
    } // entreeValide

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôf4tre
     *
     * @param  y   un paramètre pour cette méthode
     * @param  x   un autre paramètre
     * @return     la somme des deux paramètres
     */
    public static boolean chaineValide(String seqCar, char carMin, 
    char carMax){
        boolean seqCarValide = false;
        String seqCarMin;
        int i = 0;
        char car;

        if (seqCar != null && !seqCar.isEmpty()) {
            seqCarMin = seqCar.toLowerCase();
            seqCarValide = true;
            while (i < seqCarMin.length() && seqCarValide) {
                car = seqCarMin.charAt(i);
                if (car < carMin || car > carMax) {
                    seqCarValide = false;
                }
                i++;
            }
        }

        return seqCarValide;
    } // chaineValide

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôf4tre
     *
     */
    public static String ajouterCours(String horaire)
    {
        String sigle;
        String jour;
        String moment;
        String groupe;
        boolean dejaDansHoraire;
        String repLab;
        String jrLab;
        String momLab;
        boolean ajouterCrs = true;
        
        encadrerTitre(TITRE_AJOUTER_COURS, CAR_SOUL_2);
        System.out.println();
        
        sigle = validerEntree(MSG_SOL_SIGLE_COURS, MSG_ERR_SIGLE_COURS, 
        		CATEGORIE_SIGLE);
        dejaDansHoraire = annulerOperation(horaire, sigle, 
        		MSG_EXISTANCE_SIGLE);
        
        if (!dejaDansHoraire) {
        	jour = validerEntree(MSG_SOL_JOUR_COURS, MSG_ERR_JOUR_COURS, 
        			CATEGORIE_JOUR);
        	moment = validerEntree(MSG_SOL_MOMENT_COURS, MSG_ERR_MOMENT_COURS,
        			CATEGORIE_MOMENT);
        	groupe = validerGroupeJour(jour);
        	dejaDansHoraire = annulerOperation(horaire, jour + SEP + moment, 
        			MSG_EXISTANCE_PLAGE_HOR 
        			+ (jour + " " + moment + ".").toUpperCase());
        	
        	if (!dejaDansHoraire) {
        		repLab = validerEntree(MSG_SOL_LAB, MSG_ERR_LAB, CATEGORIE_LAB);
        		
        		if (repLab.equals("oui")) {
        			jrLab = validerEntree(MSG_SOL_JOUR_LAB, MSG_ERR_JOUR_COURS, 
                			CATEGORIE_JOUR);
        			momLab = validerEntree(MSG_SOL_MOM_LAB, MSG_ERR_MOMENT_COURS,
                			CATEGORIE_MOMENT);
        			
        			if (jrLab.equals(jour) && momLab.equals(moment)) {
						ajouterCrs = false;
						annulerOperation("", "", 
								"Conflit d'horaire entre le cours et le labo");
					} else {
        			dejaDansHoraire = annulerOperation(horaire, jrLab + SEP + momLab, 
                			MSG_EXISTANCE_PLAGE_HOR 
                			+ (jrLab + " " + momLab + ".").toUpperCase());
        			
        			if (dejaDansHoraire) {
        				ajouterCrs = false;
        			} else {
						if (!horaire.isEmpty()) {
							horaire += "\n";
						}
						horaire += "L" + SEP + sigle + SEP + groupe + SEP + jrLab
		        				+ SEP +momLab;
					}
					}
        		}
        		
        		if (ajouterCrs) {
        			if (!horaire.isEmpty()) {
        				horaire += "\n";
        			}
        			horaire += "C" + SEP + sigle + SEP + groupe + SEP + jour
        				+ SEP +moment;
        		}
        	}
        }
        return horaire;
    } // ajouterCours
  
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôf4tre
     *
     * @param  y   un paramètre pour cette méthode
     * @param  x   un autre paramètre
     * @return     la somme des deux paramètres
     */
    public static char jourEnChiffre(String jour)
    {
        char jrEnChiff = '0';
        
        if (jour != null){
            switch (jour.toLowerCase()) {
			case JOUR_1:
				jrEnChiff = '1';
				break;
			case JOUR_2:
				jrEnChiff = '2';
				break;
			case JOUR_3:
				jrEnChiff = '3';
				break;
			case JOUR_4:
				jrEnChiff = '4';
				break;
			case JOUR_5:
				jrEnChiff = '5';
				break;

			default:
				jrEnChiff = '0';
				break;
			}
        }
        return jrEnChiff;
    } // jourEnChiffre
    
    /**
     * Cette methode affiche, s'il y a lieu un titre, et un message qui indique
     * pourquoi une opreratoin a ete annulee
     *
     * @param  msg
     */
    public static void annulerOperation(String msg)
    {
    		if (!msg.equals(MSG_ANNULER_SUPP)){
    			System.out.println();
    			System.out.println(TITRE_ANNULATION);
			}
    		
    		System.out.println(msg);
    		pause();
    } // annulerOperation
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public static boolean annulerOperation(String horaire, String chaine, 
    		String msgExistence)
    {
    	boolean chaineDansHoraire = horaire.contains(chaine);
    	
    	if (chaineDansHoraire) {
    		System.out.println();
    		System.out.println(TITRE_ANNULATION);
    		System.out.println(msgExistence);
    		pause();
    		
    	}
        return chaineDansHoraire;
    } // annulerOperation
    
    /**
     * Cette methode permet de marquer une pause dans l'execution du programme
     * permettant a l'utilisateur de lire les messages, puis d'appuyer une 
     * touche pour continuer
     *
     */
    public static void pause()
    {
        System.out.println();
        System.out.println(MSG_PAUSE);
        System.out.println();
        Clavier.lireFinLigne();
    } // pause
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôf4tre
     *
     * @param  y   un paramètre pour cette méthode
     * @param  x   un autre paramètre
     * @return     la somme des deux paramètres
     */
    public static String validerGroupeJour(String jour)
    {
    	String groupe;
    	//D'abord, obtenir un groupe qui a 2 chiffres
		groupe = validerEntree(MSG_SOL_GROUPE, MSG_ERR_GROUPE, 
				CATEGORIE_GROUPE);
		//Validation groupe avec jour
		while (groupe.charAt(0) != jourEnChiffre(jour)) {
			System.out.println();
			System.out.println(MSG_ERR_GROUPE);
			groupe = validerEntree(MSG_SOL_GROUPE, MSG_ERR_GROUPE, 
    				CATEGORIE_GROUPE);
		}
        return groupe;
    } // validerGroupeJour
    
    /**
     * Cette methode trace un trait vertical de longueur 'longueur' avec le
     * caractere car
     *
     * @param  longueur   
     * @param  car   
     */
    public static void traitVertical(int longueur, char car)
    {
    	System.out.println();
    	for (int i = 1; i <= longueur; i++) {
        	System.out.print(car);
        }
        System.out.println();
    } // traitVertical
    
    /**
     * Cette methode affiche un titre encadre par 2 traits verticals, un en 
     * haut et un en bas du titre, et possedent la meme longueur que le titre
     *
     *
     * @param  titre   
     * @param  car   
     */
    public static void encadrerTitre(String titre, char car)
    {
        int longueurTitre = titre.length();
        traitVertical(longueurTitre, car);
        System.out.print(titre);
        traitVertical(longueurTitre, car);
    } // encadrerTitre
    
    /**
     * Cette methode affiche l'horaire courant dans un tableau
     *
     * @param  horaire  
     */
    public static void afficherHoraire(String horaire)
    {
        String coursPm;
        String coursSoir;
        
        encadrerTitre(TITRE_HOR, CAR_SOUL_2);//affiche le titre du tableau
        
        //Affiche l'entete du tableau (premiere ligne)
        traitVertical(LARGEUR_HOR, CAR_SOUL_3);
        ligneTablHor("", MOMENT_1_HOR, MOMENT_2_HOR, MOMENT_3_HOR, CAR_SOUL_3);
        
      //Affiche la ligne du lundi
        afficherHorJour(JOUR_1, horaire, CAR_SOUL_1);
      //Affiche la ligne du mardi
        afficherHorJour(JOUR_2, horaire, CAR_SOUL_1);
      //Affiche la ligne du mercredi
        afficherHorJour(JOUR_3, horaire, CAR_SOUL_1);
      //Affiche la ligne du jeudi
        afficherHorJour(JOUR_4, horaire, CAR_SOUL_1);
      //Affiche la ligne du vendredi
        afficherHorJour(JOUR_5, horaire, CAR_SOUL_3);
        
        pause();//marque un temps d'arret pour lire l'horaire
    } // afficherHoraire
    
    /**
     * Cette methode, s'il y a lieu, extrait de l'horaire les cours/labo des
     *  3 moments d'une journee avec la methode extraireCoursJourMomHor(), puis 
     *  affiche la ligne du tableau correspondant a ce jour plus le trait bas
     *
     * @param  jour   
     * @param  horaire   
     * @param  carSoul   
     */
    public static void afficherHorJour(String jour, String horaire, 
    		char carSoul)
    {
    	String crsLabAm = "";
        String crsLabPm = "";
        String crsLabSoir = "";
    	
    	if (horaire.contains(jour)) {
    		if (horaire.contains(jour + SEP + MOMENT_1)) {
    			crsLabAm = extraireCoursJourMomHor(jour, MOMENT_1, horaire);
    		}
    		if (horaire.contains(jour + SEP + MOMENT_2)) {
    			crsLabPm = extraireCoursJourMomHor(jour, MOMENT_2, horaire);
    		}
    		if (horaire.contains(jour + SEP + MOMENT_3)) {
    			crsLabSoir = extraireCoursJourMomHor(jour, MOMENT_3, horaire);
    		}
    	}
    	ligneTablHor(jour, crsLabAm, crsLabPm, crsLabSoir, carSoul);
;
    } // afficherHorJour
    
    /**
     * Cette methode extrait de l'horaire s'il y lieu le cours/labo du moment 
     * de la journee et retourne le cours contenant le type de cours, le sigle,
     * et le groupe avecle format a afficher dans l'horaire
     * 
     * @param  jour   
     * @param  moment   
     * @param  horaire   
     * @return  cours 
     */
    public static String extraireCoursJourMomHor(String jour, String moment, 
    		String horaire)
    {
        String cours = "";
        String typCours = "C";
        int indexDebCours = 0;
        int jrMomDansHor = horaire.indexOf(jour + SEP + moment);
        
        if (jrMomDansHor >= 0) {
        	if (horaire.lastIndexOf("\n", jrMomDansHor) >= 0) {
        		indexDebCours = horaire.lastIndexOf("\n", jrMomDansHor) + 1;
        	}
        	cours = horaire.substring(indexDebCours, jrMomDansHor - 1);
        	if (cours.substring(0, 1).equals("C")) {
        		cours = cours.substring(2, cours.length())
        				.replace(SEP.charAt(0), CAR_SOUL_1) + " (COURS)";
        	} else {
        		cours = cours.substring(2, cours.length())
        				.replace(SEP.charAt(0), CAR_SOUL_1) + " (LABO)";
        	}
        }
        return cours;
    } // extraireCoursJourMomHor

    /**
     * Cette methode affiche le contenu d'une ligne du tableau des horaires, 
     * plus le trait vertical bas de cette ligne
     *
     * @param  jour   
     * @param  periodeAm   
     * @param  periodePm   
     * @param  periodeSoir   
     * @param  carSoul   
     */
    public static void ligneTablHor(String jour, String periodeAm, 
    		String periodePm, String periodeSoir, char carSoul)
    {
    	System.out.printf(FORMAT_AFF_HOR, SEP_VID + jour, SEP_VID + periodeAm,
        		SEP_VID + periodePm, SEP_VID + periodeSoir, SEP);
        traitVertical(LARGEUR_HOR, carSoul);
    } // ligneTablHor
    
    /**
     * Cette methode permet de supprimer un cours, et s'il y a lieu le labo
     * correspondant, de l'horaire
     *
     * @param  y   un paramètre pour cette méthode
     * @param  x   un autre paramètre
     * @return     la somme des deux paramètres
     */
    public static String supprimerUnCours(String horaire)
    {
        String sigle;
        int indexSigle;//1ere occurence du sigle dans l'horaire
        int dernIndexSigle;//2eme occurence du sigle dans l'horaire, si lab
        int indexDeb = 0; //index debut du cours/lab a supprimer
        int indexApFin = horaire.length();//index fin + 1 du cours/lab a supprimer
        int indexRech;
        String crsLb;
    	
        encadrerTitre(TITRE_SUPP_COURS, CAR_SOUL_2);
        System.out.println();
        
        if (horaire.isEmpty()) {
			annulerOperation(MSG_ANNULER_SUPP);
		} else {
			sigle = validerEntree(MSG_SOL_SIGLE_COURS, MSG_ERR_SIGLE_COURS, 
					CATEGORIE_SIGLE);
			indexSigle = horaire.indexOf(sigle);
			dernIndexSigle = horaire.lastIndexOf(sigle);
			if (indexSigle < 0) {
				annulerOperation(MSG_ANNULER_OP_SUPP_CRS);
			} else {
					indexRech = horaire.lastIndexOf("\n", indexSigle);
					if (indexRech >= 0) {
						indexDeb = indexRech;
					}
					indexRech = horaire.indexOf("\n", dernIndexSigle);
					if (indexRech >= 0) {
						indexApFin = indexRech;
					}
					crsLb = horaire.substring(indexDeb, indexApFin);
					horaire = horaire.replace(crsLb, "");
			}
			
		}
        return horaire;
    } // supprimerUnCours
    
    /**
     * Cette methode supprime tous les cours de l'horaire
     *
     * @param  horaire   
     * @return     la chaine vide
     */
    public static String supprimerTousCours(String horaire)
    {
    	String repConfirm;
    	
    	encadrerTitre(TITRE_SUPP_TS_CRS, CAR_SOUL_2);
        System.out.println();
        
        if (horaire.isEmpty()) {
			annulerOperation(MSG_ANNULER_SUPP);
		} else {
			repConfirm = validerEntree(MSG_CONFIRM_EFF_TS_CRS, MSG_ERR_LAB,
					CATEGORIE_LAB);
			if (repConfirm.equals("non")) {
				annulerOperation("");
			} else {
				horaire = "";
			}
		}
        
        return horaire;
    } // supprimerTousCours

} // TP2
