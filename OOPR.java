import java.text.DecimalFormat;
import java.util.Scanner;

public class OOPR {

    public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

		int choice;
		do{

			float semSumTotal;
			float finalsSumTotal = 0, prelimAve = 0, midtermAve = 0, finalsAve = 0, semFinalAve = 0, prelimSumTotal = 0, midtermSumTotal = 0;
			int yearLevel = 0, numSub = 0;
			int status;
			int semester;
			String[] subjects = new String[0];
			String name;
        	String idNumber;

			System.out.println("\033[H\033[2J");
                System.out.println("------------------------------------------------------------");
                System.out.println("\t\t\t\t\t\tGWA CALCULATOR\n");
                
                do{
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    
                    if (!name.matches("[a-zA-Z. ]+")) {
                        System.out.println("Error: Name must only contain letters.\n");
                        
                    } else if (name.length() < 3) {
                        System.out.println("Error: Name must be at least 3 characters long.\n");
                        
                    }
                } while (!name.matches("[a-zA-Z. ]+") || name.length() < 3);
                
                do{
                System.out.print("\nEnter student ID Number: ");
                idNumber = scanner.nextLine();
                if (!idNumber.matches("[0-9]+")) {
                    System.out.println("Error: ID Number must only contain numbers.\n");
                }
                } while (!idNumber.matches("[0-9]+"));
    
	
            System.out.println("\033[H\033[2J");
			int program;
			String programName = "Bachelor of Science in Computer Science";

			do {
				System.out.println("------------------------------------------------------------");
				System.out.println("                          COURSES\n");
				System.out.println("1. Bachelor of Science in Computer Science");
				System.out.println("2. Others (Unavailable)");
				System.out.print("\nSelect a number for your program: ");
				program = scanner.nextInt();
				scanner.nextLine();
				System.out.println("------------------------------------------------------------");
				System.out.println("\033[H\033[2J");

				if (program == 2) {
					System.out.println("Content Unavailable! Please try again.\n");

				} else if (program < 1 || program > 2) {
					System.out.println("Invalid selection! Please try again.\n");

				}

			} while(program < 1 || program > 2 || program == 2);

			if (program == 1) {

				do {
					System.out.println("------------------------------------------------------------");
					System.out.println("                        YEAR LEVEL\n");
					System.out.print("Please input your Year Level: ");
					yearLevel = scanner.nextInt();
					System.out.println("------------------------------------------------------------");
					System.out.println("\033[H\033[2J");
					if (yearLevel < 1 || yearLevel > 4) {
						System.out.println("Invalid input! Please enter a valid Year Level between 1 and 4.\n");
					}
				} while (yearLevel < 1 || yearLevel > 4);
			}

			do {
				System.out.println("------------------------------------------------------------");
				System.out.println("                      STUDENT STATUS\n");
				System.out.print("Regular (1)\nIrregular (2)\n\nPlease Choose A Number: ");
				status = scanner.nextInt();
				System.out.println("------------------------------------------------------------");
				System.out.println("\033[H\033[2J");

				if (status < 1 || status > 2) {
					System.out.println("Invalid selection! Please try again.");
				}
			} while (status < 1 || status > 2);
			do{
			System.out.println("------------------------------------------------------------");
			System.out.println("                       SEMESTER\n");
			System.out.print("Please Select Semester (1/2): ");
			semester = scanner.nextInt();
			System.out.println("------------------------------------------------------------");
			System.out.println("\033[H\033[2J");
			if(semester < 1 || semester > 2){
				System.out.println("Invalid selection! Please try again.");
			}
			}while(semester < 1 || semester > 2);
			if (status == 1) {
				do {
					if (yearLevel == 1 && semester == 1) {
						numSub = 7;
						System.out.println("------------------------------------------------------------");
						System.out.println("                          SUBJECTS");
						System.out.println("1st Year 1st Sem Subjects (REGULAR): ");
						System.out.println("1. UNDS111 \n2. STAS111 \n3. TCWD111 \n4. FILP111 \n5. FOPR111 \n6. ICOM111 \n7. PCAS111");
						System.out.println("------------------------------------------------------------");
						subjects = new String[]{"1. UNDS111", "2. STAS111", "3. TCWD111", "4. FILP111", "5. FOPR111", "6. ICOM111", "7. PCAS111"};
					} else if (yearLevel == 1 && semester == 2) {
						numSub = 7;
						System.out.println("------------------------------------------------------------");
						System.out.println("                          SUBJECTS");
						System.out.println("1st Year 2nd Sem Subjects (REGULAR): ");
						System.out.println("1. PURC111 \n2. MATM111 \n3. RIPH111 \n4. FILP112 \n5. INPR111 \n6. WBDV111 \n7. DLOG111");
						System.out.println("------------------------------------------------------------");
						subjects = new String[]{"1. PURC111", "2. MATM111", "3. RIPH111", "4. FILP112", "5. INPR111", "6. WBDV111", "7. DLOG111"};
					} else if (yearLevel == 2 && semester == 1) {
						numSub = 8;
						System.out.println("------------------------------------------------------------");
						System.out.println("                          SUBJECTS");
						System.out.println("2nd Year 1st Sem Subjects (REGULAR): ");
						System.out.println("1. ETIC211 \n2. DSAA211 \n3. ADET211 \n4. PLNG211 \n5. DSMM211 \n6. OOPR211 \n7. NUTH211 \n8. PHED213");
						System.out.println("------------------------------------------------------------");
						subjects = new String[]{"1. ETIC211", "2. DSAA211", "3. ADET211", "4. PLNG211", "5. DSMM211", "6. OOPR211", "7. NUTH211", "8. PHED213"};
					} else if (yearLevel == 2 && semester == 2) {
						numSub = 8;
						System.out.println("------------------------------------------------------------");
						System.out.println("                          SUBJECTS");
						System.out.println("2nd Year 2nd Sem Subjects (REGULAR): ");
						System.out.println("1. LFAD211 \n2. DCAL211 \n3. IMGT211 \n4. ALGO211 \n5. DIMM211 \n6. OOPR212 \n7. FILP113 \n8. PHED214");
						System.out.println("------------------------------------------------------------");
						subjects = new String[]{"1. LFAD211", "2. DCAL211", "3. IMGT211", "4. ALGO211", "5. DIMM211", "6. OOPR212", "7. FILP113", "8. PHED214"};
					} else if (yearLevel == 3 && semester == 1) {
						numSub = 7;
						System.out.println("------------------------------------------------------------");
						System.out.println("                          SUBJECTS");
						System.out.println("3rd Year 1st Sem Subjects (REGULAR): ");
						System.out.println("1. ATFL311 \n2. NETC311 \n3. SOFE311 \n4. SEPC311 \n5. ITPM311 \n6. HMBY311 \n7. SFCR311");
						System.out.println("------------------------------------------------------------");
						subjects = new String[]{"1. ATFL311", "2. NETC311", "3. SOFE311", "4. SEPC311", "5. ITPM311", "6. HMBY311", "7. SFCR311"};

					} else if (yearLevel == 3 && semester == 2) {
						numSub = 7;
						System.out.println("------------------------------------------------------------");
						System.out.println("                          SUBJECTS");
						System.out.println("3rd Year 2nd Sem Subjects (REGULAR): ");
						System.out.println("1. CTIC311 \n2. IAAS311 \n3. BUSM311 \n4. CSTH311 \n5. SOFE312 \n6. HCIN311 \n7. COPH311");
						System.out.println("------------------------------------------------------------");
						subjects = new String[]{"1. CTIC311", "2. IAAS311", "3. BUSM311", "4. CSTH311", "5. SOFE312", "6. HCIN311", "7. COPH311"};
					} else if (yearLevel == 4 && semester == 1) {
						numSub = 5;
						System.out.println("------------------------------------------------------------");
						System.out.println("                          SUBJECTS");
						System.out.println("4th Year 1st Sem Subjects (REGULAR): ");
						System.out.println("1. CSTH312 \n2. OPS411 \n3. ARTA411 \n4. RIZL411 \n5. CSOA411");
						System.out.println("------------------------------------------------------------");
						subjects = new String[]{"1. CSTH312", "2. OPS411", "3. ARTA411", "4. RIZL411", "5. CSOA411"};
					} else if (yearLevel == 4 && semester == 2) {
						numSub = 1;
						System.out.println("------------------------------------------------------------");
						System.out.println("                          SUBJECTS");
						System.out.println("4th Year 2nd Sem Subjects (REGULAR): ");
						System.out.println("1. CSIM412");
						System.out.println("------------------------------------------------------------");
						subjects = new String[]{"1. CSIM412"};
					}

					float[] prelimGrades = new float[numSub];
					System.out.println("\nInput Prelim Grades: ");
					for (int i = 0; i < numSub; i++) {
						do {
							System.out.print(subjects[i] + ": ");
							prelimGrades[i] = scanner.nextInt();
							if (prelimGrades[i] <= 0 || prelimGrades[i] > 100) {
						    System.out.println("Grade cannot be less than 1 or more than 100.");
						}
						} while (prelimGrades[i] <= 0 || prelimGrades[i] > 100);
						prelimSumTotal += prelimGrades[i];
					}

					prelimAve = prelimSumTotal / numSub;
					System.out.println("\nPrelim Average: " + df.format(prelimAve));
					System.out.println("------------------------------------------------------------");

					float[] midtermGrades = new float[numSub];
					System.out.println("\nInput Midterm Grades: ");
					for (int i = 0; i < numSub; i++) {
						do {
							System.out.print(subjects[i] + ": ");
							midtermGrades[i] = scanner.nextInt();
							if (midtermGrades[i] <= 0 || midtermGrades[i] > 100) {
						    System.out.println("Grade cannot be less than 1 or more than 100.");
						}
						} while (midtermGrades[i] <= 0 || midtermGrades[i] > 100);
						midtermSumTotal += midtermGrades[i];
					}

					midtermAve = midtermSumTotal / numSub;
					System.out.println("\nMidterm Average: " + df.format(midtermAve));
					System.out.println("------------------------------------------------------------");

					float[] finalsGrades = new float[numSub];
					System.out.println("\nInput Finals Grades: ");
					for (int i = 0; i < numSub; i++) {
						do {
							System.out.print(subjects[i] + ": ");
							finalsGrades[i] = scanner.nextInt();
							if (finalsGrades[i] <= 0 || finalsGrades[i] > 100) {
						    System.out.println("Grade cannot be less than 1 or more than 100.");
						}
						} while (finalsGrades[i] <= 0 || finalsGrades[i] > 100);
						finalsSumTotal += finalsGrades[i];
					}

					finalsAve = finalsSumTotal / numSub;
					System.out.println("\nFinals Average: " + df.format(finalsAve));
					System.out.println("------------------------------------------------------------");

					semSumTotal = prelimAve + midtermAve + finalsAve;
					semFinalAve = semSumTotal / 3;
				} while (status != 1);

				if (semester < 1 || semester > 2) {
					System.out.println("Select only 1 or 2. Please try again.");
				}
				
			} else if (status == 2) {

				System.out.println("------------------------------------------------------------");
				System.out.println("                             IRREGULAR");
				do {
				System.out.print("Enter number of subjects: ");
				numSub = scanner.nextInt();
				scanner.nextLine();
				if (numSub <= 0) {
				    System.out.println("Number of subjects cannot be null");
				}
				} while (numSub <= 0);

				subjects = new String[numSub];

				System.out.println("Enter the subject codes of " + numSub + " subjects: ");
				for (int x = 0; x < numSub; x++) {
					System.out.print("Subject " + (x + 1) + ": ");
					subjects[x] = scanner.nextLine();
				}

				System.out.println("\nYou entered the following subjects:");
				for (int x = 0; x < numSub; x++) {
					System.out.println("Subject " + (x + 1) + ": " + subjects[x]);
				}

				float[] prelimGrades = new float[numSub];
				System.out.println("\nInput Prelim Grades: ");
				for (int i = 0; i < numSub; i++) {
					do {
						System.out.print(subjects[i] + ": ");
						prelimGrades[i] = scanner.nextInt();
						if (prelimGrades[i] <= 0 || prelimGrades[i] > 100) {
						    System.out.println("Grade cannot be less than 1 or more than 100.");
						}
					} while (prelimGrades[i] <= 0 || prelimGrades[i] > 100);
					prelimSumTotal += prelimGrades[i];
				}

				prelimAve = prelimSumTotal / numSub;
				System.out.println("\nPrelim Average: " + df.format(prelimAve));
				System.out.println("------------------------------------------------------------");

				float[] midtermGrades = new float[numSub];
				System.out.println("\nInput Midterm Grades: ");
				for (int i = 0; i < numSub; i++) {
					do {
						System.out.print(subjects[i] + ": ");
						midtermGrades[i] = scanner.nextInt();
						if (midtermGrades[i] <= 0 || midtermGrades[i] > 100) {
						    System.out.println("Grade cannot be less than 1 or more than 100.");
						}
					} while (midtermGrades[i] <= 0 || midtermGrades[i] > 100);
					midtermSumTotal += midtermGrades[i];
				}

				midtermAve = midtermSumTotal / numSub;
				System.out.println("\nMidterm Average: " + df.format(midtermAve));
				System.out.println("------------------------------------------------------------");

				float[] finalsGrades = new float[numSub];
				System.out.println("\nInput Finals Grades: ");
				for (int i = 0; i < numSub; i++) {
					do {
						System.out.print(subjects[i] + ": ");
						finalsGrades[i] = scanner.nextInt();
						if (finalsGrades[i] <= 0 || finalsGrades[i] > 100) {
						    System.out.println("Grade cannot be less than 1 or more than 100.");
						}
					} while (finalsGrades[i] <= 0 || finalsGrades[i] > 100);
					finalsSumTotal += finalsGrades[i];
				}

				finalsAve = finalsSumTotal / numSub;
				System.out.println("\nFinals Average: " + df.format(finalsAve));
				System.out.println("------------------------------------------------------------");

				semSumTotal = prelimAve + midtermAve + finalsAve;
				semFinalAve = semSumTotal / 3;
			
			} else{
				System.out.println("Semester can only be 1 and 2");
			}

			System.out.println("Name: " + name + "                                          ");
			System.out.println("ID Number: " + idNumber + "                                 ");
			System.out.println("Program: " + programName + "                                 ");
			System.out.println("------------------------------------------------------------");
			if (semester == 1){
			System.out.println("1st Semester Average Grade: " + df.format(semFinalAve));
			System.out.println("------------------------------------------------------------");
			}
			else if (semester == 2) {
				System.out.println("2nd Semester Average Grade: " + df.format(semFinalAve));
				System.out.println("------------------------------------------------------------");
			}

			if (semFinalAve >= 98) {
				System.out.println("Grade Point: 1.00\nExcellent!!!");
				System.out.println(" ");

			} else if (semFinalAve >= 95) {
				System.out.println("Grade Point: 1.25\nExcellent!!!");
				System.out.println(" ");

			} else if (semFinalAve >= 92) {
				System.out.println("Grade Point: 1.50\nVery Good!!");
				System.out.println(" ");

			} else if (semFinalAve >= 89) {
				System.out.println("Grade Point: 1.75\nVery Good!!");
				System.out.println(" ");

			} else if (semFinalAve >= 86) {
				System.out.println("Grade Point: 2.00\nGood!");
				System.out.println(" ");

			} else if (semFinalAve >= 83) {
				System.out.println("Grade Point: 2.25\nGood!");
				System.out.println(" ");

			} else if (semFinalAve >= 80) {
				System.out.println("Grade Point: 2.50\nFair");
				System.out.println(" ");

			} else if (semFinalAve >= 75) {
				System.out.println("Grade Point: 3.00\nPass");
				System.out.println(" ");

			} else {
				System.out.println("Grade Point: 5.00\nFAILED!!");
				System.out.println(" ");

			}
			System.out.println("------------------------------------------------------------");
			do {
				System.out.print("Do you want to restart the program? (1 - Yes, 2 - No): ");
				choice = scanner.nextInt();
				scanner.nextLine();
				if (choice < 1 || choice > 2) {
				System.out.println("The options are 1 and 2 only");
				System.out.println("------------------------------------------------------------");
				}
			} while (choice < 1 || choice > 2);
		

		} while (choice == 1);
		if (choice == 2) {
		    System.out.println("------------------------------------------------------------");
			System.out.println("Thank you for using the GWA Calculator!");
			System.out.println(" ");
		}

	}
}
