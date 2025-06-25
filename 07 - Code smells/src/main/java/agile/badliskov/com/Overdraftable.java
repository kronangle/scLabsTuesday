package agile.badliskov.com;

public interface Overdraftable {
	public void setOverdraftLimit(double overdraftLimit);
	public boolean isOverDrawn();
}
