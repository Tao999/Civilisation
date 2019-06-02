
public class Cell {
	public final int DEFAULT_HP = 10;
	public final int NOT_A_CIVILISATION = 0;
	public enum m_types {
		DEAD_CELL, FARMER, WARRIOR, ARCHER
	};
	
	private int m_typeOfCell;
	private int m_hp;
	private int m_civilisation;
	
	Cell() {
		m_hp = 0;
		m_typeOfCell = m_types.DEAD_CELL.ordinal();
		m_civilisation = NOT_A_CIVILISATION;
	}
	
	Cell(int typeOfCell, int civilisation){
		m_typeOfCell = typeOfCell;
		m_civilisation = civilisation;
	}
	
	public int getTypeOfCell() {
		return m_typeOfCell;
	}

	public void setTypeOfCell(int m_typeOfCell) {
		this.m_typeOfCell = m_typeOfCell;
	}

	public int getHp() {
		return m_hp;
	}

	public void setHp(int m_hp) {
		this.m_hp = m_hp;
	}

	public int getCivilisation() {
		return m_civilisation;
	}

	public void setCivilisation(int m_civilisation) {
		this.m_civilisation = m_civilisation;
	}

}
