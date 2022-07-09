
interface IStarBuilding {
	public String getTribe(); //종족 정보
	public String getName(); //이름 정보
	public int getEnergy(); //에너지 정보
	public void makeUnit(); //유닛 생산
	public void progressing(int time); //생산 기간
}
