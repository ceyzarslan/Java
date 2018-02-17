package term;

public enum TermColor{
	BLACK(30), RED(31), GREEN(32), YELLOW(33), BLUE(34), MAGENTA(35), CYAN(36), WHITE(37),
	BRIGHTBLACK(90), BRIGHTRED(91), BRIGHTGREEN(92), BRIGHTYELLOW(93), BRIGHTBLUE(94), BRIGHTMAGENTA(95), BRIGHTCYAN(96), BRIGHTWHITE(97);

	public final int fgValue;
	public final int bgValue;
	private TermColor(int fgValue){
		this.fgValue = fgValue;
		this.bgValue = fgValue + 10;
	}
}
