package memento;

public class ContractVersion {//Memento part
	
	private String contractClause;

	public String getContractClause() {
		return contractClause;
	}

	public void setContractClause(String contractClause) {
		this.contractClause = contractClause;
	}

	public ContractVersion(String contractClause) {
		super();
		this.contractClause = contractClause;
	}
	
	
	public ContractVersion() {
		super();
		
	}
	
	

}
