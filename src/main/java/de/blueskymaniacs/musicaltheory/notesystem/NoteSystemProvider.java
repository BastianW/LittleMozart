package de.blueskymaniacs.musicaltheory.notesystem;

public final class NoteSystemProvider{
	
	/**
	 * The German note system. [position][names];
	 */
	public final static Note[][]GERMAN_SYSTEM = new Note[12][];
	public final static Note[][]AMERICAN_SYSTEM = new Note[12][];
	static{
		int i=0;
		GERMAN_SYSTEM[i++]=new Note[]{Note.HIS,Note.C,null};
		GERMAN_SYSTEM[i++]=new Note[]{Note.CIS,null,Note.DES};
		GERMAN_SYSTEM[i++]=new Note[]{null, Note.D, null};
		GERMAN_SYSTEM[i++]=new Note[]{Note.DIS, null, Note.ES};
		GERMAN_SYSTEM[i++]=new Note[]{null, Note.E, Note.FES};
		GERMAN_SYSTEM[i++]=new Note[]{null, Note.F,Note.EIS};
		GERMAN_SYSTEM[i++]=new Note[]{Note.FIS,null,Note.GES};
		GERMAN_SYSTEM[i++]=new Note[]{null, Note.G, null};
		GERMAN_SYSTEM[i++]=new Note[]{Note.GIS, null, Note.AS};
		GERMAN_SYSTEM[i++]=new Note[]{null, Note.A, null};
		GERMAN_SYSTEM[i++]=new Note[]{Note.AIS, null, Note.B};
		GERMAN_SYSTEM[i++]=new Note[]{null, Note.H, Note.CES};	
		i=0;
		AMERICAN_SYSTEM[i++]=new Note[]{Note.BIS,Note.C,null};
		AMERICAN_SYSTEM[i++]=new Note[]{Note.CIS,null,Note.DES};
		AMERICAN_SYSTEM[i++]=new Note[]{null, Note.D, null};
		AMERICAN_SYSTEM[i++]=new Note[]{Note.DIS, null, Note.ES};
		AMERICAN_SYSTEM[i++]=new Note[]{null, Note.E, Note.FES};
		AMERICAN_SYSTEM[i++]=new Note[]{null, Note.F,Note.EIS};
		AMERICAN_SYSTEM[i++]=new Note[]{Note.FIS,null,Note.GES};
		AMERICAN_SYSTEM[i++]=new Note[]{null, Note.G, null};
		AMERICAN_SYSTEM[i++]=new Note[]{Note.GIS, null, Note.AS};
		AMERICAN_SYSTEM[i++]=new Note[]{null, Note.A, null};
		AMERICAN_SYSTEM[i++]=new Note[]{Note.AIS, null, Note.BES};
		AMERICAN_SYSTEM[i++]=new Note[]{null, Note.B, Note.CES};		
	}

	
	/**
	 * Private constructor. No instance should be created.
	 */
	private NoteSystemProvider(){
		
	}
}
