package code;

import java.util.*;

public class Lab10 {
	public static float reward (int n, int m) {

		int[] randNum = new int[n];
		int[] rewards = new int[m];
		int ones = 0, twos= 0, threes= 0, fours= 0, fives= 0, sixes= 0, sevens= 0, eights= 0, nines= 0;
		int w = 0;
		int count = 0; //used for printing reward testing
		int sum = 0;
		float rewardAverage;

		float matrixReward = 0;
		int countMat = 0;
		int countOne = 0; int countTwo = 0;int countThree = 0;int countFour = 0;
		int countFive = 0;int countSix = 0;int countSeven = 0;int countEight = 0;int countNine = 0;
		int tmpOne = 0;int tmpTwo = 0;int tmpThree = 0;int tmpFour = 0;
		int tmpFive = 0;int tmpSix = 0;int tmpSeven = 0;int tmpEight = 0;int tmpNine = 0;

		int aOne[][] = new int [n][n];
		int aTwo[][] = new int [n][n];
		int aThree[][] = new int [n][n];
		int aFour[][] = new int [n][n];
		int aFive[][] = new int [n][n];
		int aSix[][] = new int [n][n];
		int aSeven[][] = new int [n][n];
		int aEight[][] = new int [n][n];
		int aNine[][] = new int [n][n];
		
		int matrixOneSum[][] = new int [n][n];
		int matrixTwoSum[][] = new int [n][n];
		int matrixThreeSum[][] = new int [n][n];
		int matrixFourSum[][] = new int [n][n];
		int matrixFiveSum[][] = new int [n][n];
		int matrixSixSum[][] = new int [n][n];
		int matrixSevenSum[][] = new int [n][n];
		int matrixEightSum[][] = new int [n][n];
		int matrixNineSum[][] = new int [n][n];

		int matrixTotal[][] = new int [n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				aOne[i][j] = 0;
				aTwo[i][j] = 0;
				aThree[i][j] = 0;
				aFour[i][j] = 0;
				aFive[i][j] = 0;
				aSix[i][j] = 0;
				aSeven[i][j] = 0;
				aEight[i][j] = 0;
				aNine[i][j] = 0;
			}
		}

		for (int i = 0; i < rewards.length; i++)
			rewards[i] = 0;

		for (int y = 1; y <= m; y++) {	
			//matrixReward = 0;
			countMat = 0; count = 0;
			countOne = 0;  countTwo = 0; countThree = 0; countFour = 0;
			countFive = 0; countSix = 0; countSeven = 0; countEight = 0; countNine = 0;
			tmpOne = 0; tmpTwo = 0; tmpThree = 0; tmpFour = 0;
			tmpFive = 0; tmpSix = 0; tmpSeven = 0; tmpEight = 0; tmpNine = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					aOne[i][j] = 0;
					aTwo[i][j] = 0;
					aThree[i][j] = 0;
					aFour[i][j] = 0;
					aFive[i][j] = 0;
					aSix[i][j] = 0;
					aSeven[i][j] = 0;
					aEight[i][j] = 0;
					aNine[i][j] = 0;
				}
			}

			for (int i = 0; i < n; i++) {
				Random rand = new Random();
				randNum[i] = rand.nextInt(n) + 1;
				if (randNum[i] == 1)
					ones++;
				else if (randNum[i] == 2)
					twos++;
				else if (randNum[i] == 3)
					threes++; 
				else if (randNum[i] == 4)
					fours++; 
				else if (randNum[i] == 5)
					fives++; 
				else if (randNum[i] == 6)
					sixes++; 
				else if (randNum[i] == 7)
					sevens++; 
				else if (randNum[i] == 8)
					eights++; 
				else if (randNum[i] == 9)
					nines++; 
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					for (int x = 0; x < randNum.length; x++) {

						if (randNum[x] == 1) {
							if (countOne <= 1) {
								aOne[x][x] = 1;
								countOne++;
								tmpOne = x;
							}
							else {
								aOne[tmpOne][x] = 1;
								aOne[x][tmpOne] = 1;
								aOne[x][x] = 1;
								tmpOne = x;
							}
						}
						else if (randNum[x] == 2) {
							if (countTwo <= 1) {
								aTwo[x][x] = 1;
								countTwo++;
								tmpTwo = x;
							}
							else {
								aTwo[tmpTwo][x] = 1;
								aTwo[x][tmpTwo] = 1;
								aTwo[x][x] = 1;
								tmpTwo = x;
							}
						}
						else if (randNum[x] == 3) {
							if (countThree <= 1) {
								aThree[x][x] = 1;
								countThree++;
								tmpThree = x;
							}
							else {
								aThree[tmpThree][x] = 1;
								aThree[x][tmpThree] = 1;
								aThree[x][x] = 1;
								tmpThree = x;
							}
						}
						else if (randNum[x] == 4) {
							if (countFour <= 1) {
								aFour[x][x] = 1;
								countFour++;
								tmpFour = x;
							}
							else {
								aFour[tmpFour][x] = 1;
								aFour[x][tmpFour] = 1;
								aFour[x][x] = 1;
								tmpFour = x;
							}
						}
						else if (randNum[x] == 5) {
							if (countFive <= 1) {
								aFive[x][x] = 1;
								countFive++;
								tmpFive = x;
							}
							else {
								aFive[tmpFive][x] = 1;
								aFive[x][tmpFive] = 1;
								aFive[x][x] = 1;
								tmpFive = x;
							}
						}
						else if (randNum[x] == 6) {
							if (countSix <= 1) {
								aSix[x][x] = 1;
								countSix++;
								tmpSix = x;
							}
							else {
								aSix[tmpSix][x] = 1;
								aSix[x][tmpSix] = 1;
								aSix[x][x] = 1;
								tmpSix = x;
							}
						}
						else if (randNum[x] == 7) {
							if (countSeven <= 1) {
								aSeven[x][x] = 1;
								countSeven++;
								tmpSeven = x;
							}
							else {
								aSeven[tmpSeven][x] = 1;
								aSeven[x][tmpSeven] = 1;
								aSeven[x][x] = 1;
								tmpSeven = x;
							}
						}
						else if (randNum[x] == 8) {
							if (countEight <= 1) {
								aEight[x][x] = 1;
								countEight++;
								tmpEight = x;
							}
							else {
								aEight[tmpEight][x] = 1;
								aEight[x][tmpEight] = 1;
								aEight[x][x] = 1;
								tmpEight = x;
							}
						}
						else if (randNum[x] == 9) {
							if (countNine <= 1) {
								aNine[x][x] = 1;
								countNine++;
								tmpNine = x;
							}
							else {
								aNine[tmpNine][x] = 1;
								aNine[x][tmpNine] = 1;
								aNine[x][x] = 1;
								tmpNine = x;
							}
						}
					}
				}
			}
			
			for (int a = 0; a < n; a++) {
				for (int b = 0; b < n; b++) {
					if(aOne[a][b] == 1)
						matrixReward++;
					else if(aTwo[a][b] == 1)
						matrixReward++;
					else if(aThree[a][b] == 1)
						matrixReward++;
					else if(aFour[a][b] == 1)
						matrixReward++;
					else if(aFive[a][b] == 1)
						matrixReward++;
					else if(aSix[a][b] == 1)
						matrixReward++;
					else if(aSeven[a][b] == 1)
						matrixReward++;
					else if(aEight[a][b] == 1)
						matrixReward++;
					else if(aNine[a][b] == 1)
						matrixReward++;
				}
			}
			
			/*System.out.println("##########################\n Random Numbers Generated\n##########################"); // comment out here to stop print the random numbers generated
			for (int i = 0; i < randNum.length; i++) {
				System.out.print(randNum[i]);
				count++;
				if (count <= randNum.length - 1)
					System.out.print(", ");
			}
			System.out.println(); 
			System.out.println("\n-----------\n Matrix A1\n-----------");// comment out here to stop printing the matrices
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(aOne[i][j] + "  ");
					countMat++;
					if (countMat == n) {
						System.out.println();
						countMat = 0;
					}
				}
			}

			System.out.println();
			System.out.println("-----------\n Matrix A2\n-----------");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(aTwo[i][j] + "  ");
					countMat++;
					if (countMat == n) {
						System.out.println();
						countMat = 0;
					}
				}
			}

			System.out.println();
			System.out.println("-----------\n Matrix A3\n-----------");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(aThree[i][j] + "  ");
					countMat++;
					if (countMat == n) {
						System.out.println();
						countMat = 0;
					}
				}
			}
			System.out.println();
			System.out.println("-----------\n Matrix A4\n-----------");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(aFour[i][j] + "  ");
					countMat++;
					if (countMat == n) {
						System.out.println();
						countMat = 0;
					}
				}
			}
			System.out.println();
			System.out.println("-----------\n Matrix A5\n-----------");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(aFive[i][j] + "  ");
					countMat++;
					if (countMat == n) {
						System.out.println();
						countMat = 0;
					}
				}
			}
			System.out.println();
			/*System.out.println("-----------\n Matrix A6\n-----------");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(aSix[i][j] + "  ");
					countMat++;
					if (countMat == n) {
						System.out.println();
						countMat = 0;
					}
				}
			}
			System.out.println();
			System.out.println("-----------\n Matrix A7\n-----------");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(aSeven[i][j] + "  ");
					countMat++;
					if (countMat == n) {
						System.out.println();
						countMat = 0;
					}
				}
			}
			System.out.println();
			System.out.println("-----------\n Matrix A8\n-----------");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(aEight[i][j] + "  ");
					countMat++;
					if (countMat == n) {
						System.out.println();
						countMat = 0;
					}
				}
			}
			System.out.println();
			System.out.println("-----------\n Matrix A9\n-----------");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(aNine[i][j] + "  ");
					countMat++;
					if (countMat == n) {
						System.out.println();
						countMat = 0;
					}
				}
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					matrixOneSum[i][j] = matrixOneSum[i][j] + aOne[i][j];
					matrixTwoSum[i][j] = matrixTwoSum[i][j] + aTwo[i][j];
					matrixThreeSum[i][j] = matrixThreeSum[i][j] + aThree[i][j];
					matrixFourSum[i][j] = matrixFourSum[i][j] + aFour[i][j];
					matrixFiveSum[i][j] = matrixFiveSum[i][j] + aFive[i][j];
					matrixSixSum[i][j] = matrixSixSum[i][j] + aSix[i][j];
					matrixSevenSum[i][j] = matrixSevenSum[i][j] + aSeven[i][j];
					matrixEightSum[i][j] = matrixEightSum[i][j] + aEight[i][j];
					matrixNineSum[i][j] = matrixNineSum[i][j] + aNine[i][j];
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					matrixTotal[i][j] = matrixOneSum[i][j] + matrixTwoSum[i][j] + matrixThreeSum[i][j] + matrixFourSum[i][j] + matrixFiveSum[i][j] + matrixSixSum[i][j] + matrixSevenSum[i][j] + matrixEightSum[i][j] + matrixNineSum[i][j];
				}
			}*/	
			int reward = (ones * ones) + (twos * twos) + (threes * threes) + (fours * fours) + (fives * fives) + (sixes * sixes) + (sevens * sevens) + (eights * eights) + (nines * nines); 	
			//System.out.println(reward);
			ones = 0; twos= 0; threes= 0; fours= 0; fives= 0; sixes= 0; sevens= 0; eights= 0; nines= 0;
			rewards[w++] = reward;
			reward = 0;
			count = 0;

		}

		/*for (int i = 0; i < rewards.length; i++) {
			System.out.print(rewards[i]);
			count++;
			if (count <= rewards.length - 1)
				System.out.print(", ");
		}*/

		for (int i = 0; i < rewards.length; i++) {
			sum = sum + rewards[i];
		}
		
		/*System.out.println(); // comment out here to stop print summations
		System.out.println("###################\n Matrix Summations\n###################");
		System.out.println("--------------\n MatrixSUM A1\n--------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrixOneSum[i][j] + "  ");
				countMat++;
				if (countMat == n) {
					System.out.println();
					countMat = 0;
				}
			}
		}

		System.out.println("\n--------------\n MatrixSUM A2\n--------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrixTwoSum[i][j] + "  ");
				countMat++;
				if (countMat == n) {
					System.out.println();
					countMat = 0;
				}
			}
		}
		System.out.println("\n--------------\n MatrixSUM A3\n--------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrixThreeSum[i][j] + "  ");
				countMat++;
				if (countMat == n) {
					System.out.println();
					countMat = 0;
				}
			}
		}
		System.out.println("\n--------------\n MatrixSUM A4\n--------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrixFourSum[i][j] + "  ");
				countMat++;
				if (countMat == n) {
					System.out.println();
					countMat = 0;
				}
			}
		}
		System.out.println("\n--------------\n MatrixSUM A5\n--------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrixFiveSum[i][j] + "  ");
				countMat++;
				if (countMat == n) {
					System.out.println();
					countMat = 0;
				}
			}
		}
		/*System.out.println("\n--------------\n MatrixSUM A6\n--------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrixSixSum[i][j] + "  ");
				countMat++;
				if (countMat == n) {
					System.out.println();
					countMat = 0;
				}
			}
		}
		System.out.println("\n--------------\n MatrixSUM A7\n--------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrixSevenSum[i][j] + "  ");
				countMat++;
				if (countMat == n) {
					System.out.println();
					countMat = 0;
				}
			}
		}
		System.out.println("\n--------------\n MatrixSUM A8\n--------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrixEightSum[i][j] + "  ");
				countMat++;
				if (countMat == n) {
					System.out.println();
					countMat = 0;
				}
			} 
		}
		System.out.println("\n--------------\n MatrixSUM A9\n--------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrixNineSum[i][j] + "  ");
				countMat++;
				if (countMat == n) {
					System.out.println();
					countMat = 0;
				}
			}
		}
		System.out.println("\n-------------------\n MatrixSUM A1 - A9\n-------------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrixNineSum[i][j] + "  ");
				countMat++;
				if (countMat == n) {
					System.out.println();
					countMat = 0;
				}
			}
		}*/
		
		//matrixReward = 0;
		countMat = 0; count = 0;
		countOne = 0;  countTwo = 0; countThree = 0; countFour = 0;
		countFive = 0; countSix = 0; countSeven = 0; countEight = 0; countNine = 0;
		tmpOne = 0; tmpTwo = 0; tmpThree = 0; tmpFour = 0;
		tmpFive = 0; tmpSix = 0; tmpSeven = 0; tmpEight = 0; tmpNine = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				aOne[i][j] = 0;
				aTwo[i][j] = 0;
				aThree[i][j] = 0;
				aFour[i][j] = 0;
				aFive[i][j] = 0;
				aSix[i][j] = 0;
				aSeven[i][j] = 0;
				aEight[i][j] = 0;
				aNine[i][j] = 0;
			}
		}
		System.out.println(matrixReward);
		System.out.println("Matrix method reward:" + matrixReward/m);
		System.out.println();
		rewardAverage = (float)sum/m;
		return rewardAverage;

	}

	public static void main (String args[]) {

		System.out.println("Square method reward: " + reward(5, 10000));

	}
}

