package de.blueskymaniacs.musicaltheory.notesystem;

public enum Note {
	HIS("h#"),C("c"),
	CIS("c#"),DES("db"),
	D("d"),
	DIS("d#"),ES("eb"),
	E("e"),FES("fb"),
	EIS("e#"),F("f"),
	FIS("f#"),GES("gb"),
	G("g"),
	GIS("g#"),AS("ab"),
	A("a"),
	AIS("a#"),B("b"),
	H("h"),CES("cb"),
	BIS("b#"),BES("b");
	private String mValue;
	
	private Note(String value) {
		mValue=value;
	}
	
	
}
