package Class;

public class Game {
	private String name, type, closeTestDate, openTestDate, status, agent, company, chargeMode, classification, memo;

	public Game() {
	}

	public Game(String name1, String type1) {
		name = name1;
		type = type1;
	}

	public Game(String name1, String type1, String closeTestDate1, String openTestDate1, String status1, String agent1,
			String company1, String chargeMode1, String classification1, String memo1) {
		name = name1;
		type = type1;
		closeTestDate = closeTestDate1;
		openTestDate = openTestDate1;
		status = status1;
		agent = agent1;
		company = company1;
		chargeMode = chargeMode1;
		classification = classification1;
		memo = memo1;
	}

	public void setName(String name2) {
		name = name2;
	}

	public String getName() {
		return name;
	}

	public void setType(String type2) {
		type = type2;
	}

	public String getType() {
		return type;
	}

	public void setCloseTestDate(String closeTestDate2) {
		closeTestDate = closeTestDate2;
	}

	public String geCloseTestDate() {
		return closeTestDate;
	}

	public void setOpenTestDate(String openTestDate2) {
		openTestDate = openTestDate2;
	}

	public String getOpenTestDate() {
		return openTestDate;
	}

	public void setStatus(String status2) {
		status = status2;
	}

	public String getStatus() {
		return status;
	}

	public void setAgent(String agent2) {
		agent = agent2;
	}

	public String getAgent() {
		return agent;
	}



	public void setCompany(String company2) {
		company = company2;
	}

	public String getCompany() {
		return company;
	}
	public void setChargeMode(String chargeMode2) {
		chargeMode = chargeMode2;
	}
	public String getChargeMode() {
		return chargeMode;
	}
	public void setClassification(String classification2) {
		classification = classification2;
	}
	public String getClassification() {
		return classification;
	}
	public void setMemo(String memo2) {
		memo = memo2;
	}
	public String getMemo() {
		return memo;
	}
	public void showInfo() {
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println(
				this.getName() +  "(" + this.getType()+")," + this.getChargeMode()+","+this.getClassification()+","+this.getStatus() );
		System.out.println("--------------------------------------------------------------------------------------------------------");
	}
}
