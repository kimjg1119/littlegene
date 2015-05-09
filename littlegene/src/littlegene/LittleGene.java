package littlegene;

import java.util.Random;

/*Ver 0.1
 * ������ ���ذ�
 * MakeRandom Ŭ���� �߰�
 * LiveCondition Ŭ���� �߰�
 * Gene Ŭ���� �߰�
 * LittleGene, main �Լ� �߰�
 * GeneController Ŭ���� Ʋ �߰�
 * */

class MakeRandom
{
	private Random ra=new Random();
	private int dice(int a, int b)
	{
		return 1+ra.nextInt(b-a);
	}
	public int[] dicePack(int a, int b, int m)
	{
		int i;
		int[] diceArr=new int[m];
		for(i=0;i<m;i++)
		{
			diceArr[i]=dice(a,b);
		}
		
		return diceArr;
	}
}

class LiveCondition
{
	private int[] airCon=new int[3]; //10,11,12 (A,B,C)
	private int[] otherCon=new int[7]; //moveCon,watCon,neutCon,hotCon,coldCon,disCon,oxyCon
	
	public int returnCon(int whCon)
	{
		if(whCon>9)
			return airCon[whCon-10];
		else
			return otherCon[whCon];
	}
}

class geneControler
{
	
}

class Gene
{
	private int geneLen;
	private int geneOxyLen;
	private int[] gene=new int[geneLen];
	private int[] geneOxy=new int[geneOxyLen];
	
	public Gene(int myGeneLen, int myGeneOxyLen)
	{
		geneLen=myGeneLen;
		geneOxyLen=myGeneOxyLen;
	}
}

public class LittleGene {

	public static void main(String[] args) {
			
	}

}
