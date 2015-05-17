package littlegene;

import java.util.Random;

/*Ver 0.2
 * 제작자 김준겸
 * 확률들 추가
 * GeneControler 클래스 정비 & 메소드 추가
 * LiveConditon 클래스 정비
 * Gene 클래스 메소드 추가
 * */

class MakeRandom
{
	private Random ra=new Random();
	int dice(int a, int b)
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
	private char[] airCon=new char[]{'A','B','C'}; //10,11,12 (A,B,C)
	private char[] otherCon=new char[]{'0','1','2','3','4','5','6'}; //moveCon,watCon,neutCon,hotCon,coldCon,disCon,oxyCon
	
	public char returnCon(int whCon)
	{
		if(whCon>9)
			return airCon[whCon-10];
		else
			return otherCon[whCon];
	}
}

class geneControler
{
	private int howManyGene;
	private int mutatePro; //1000단위
	private Gene[] genePair=new Gene[howManyGene];
	
	public geneControler(int myManyGene)
	{
		howManyGene=myManyGene;
	}
	public void crossOver()
	{
		
	}
}

class Gene
{
	private int geneLen;
	private int geneOxyLen;
	private int[] gene=new int[geneLen];
	private int[] geneOxy=new int[geneOxyLen];
	
	public void initGeneLen(int myGeneLen, int myGeneOxyLen)
	{
		geneLen=myGeneLen;
		geneOxyLen=myGeneOxyLen;
	}
	public int returnGene(int wh)
	{
		return gene[wh];
	}
	public int returnOxyGene(int wh)
	{
		return geneOxy[wh];
	}
	public void setGene(int x, int wh)
	{
		gene[wh]=x;
	}
	public void setOxyGene(int x, int wh)
	{
		geneOxy[wh]=x;
	}
	public void mutate(int mutatePro)
	{
		int i;
		MakeRandom mr=new MakeRandom();
		for(i=0;i<geneLen;i++)
		if(mr.dice(0,1000)<mutatePro)
		{
			setGene(mr.dice(0,6),i);
		}
	}
}

public class LittleGene {

	public static void main(String[] args) {
			
	}

}
