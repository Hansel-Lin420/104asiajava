package 第一學期;

public class Student {
	private int cScore, eScore, nScore;
	private String studID, studName;

	public Student(String id, String name, int v1, int v2, int v3) {
		studID = id;
		studName = name;
		cScore = v1;
		eScore = v2;
		nScore = v3;
	}

	public float getAvg(){
	return(float)(cScore + eScore + nScore)/3.0f;
	}
	public String getInfo(){
		return new String(studID + "\t" + studName + "\t" + cScore +"\t"+eScore+"\t"+ nScore +"\t"+getAvg());
	}
	public int getcScore(){
		return cScore;
	}
	public int geteScore(){
		return eScore;
	}public int getnScore(){
		return nScore;
	}
}
