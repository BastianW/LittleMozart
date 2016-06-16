package de.blueskymaniacs.musicaltheory.notesystem;
	import static de.blueskymaniacs.musicaltheory.notesystem.C.*;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.*;
public enum ChordType {

// 0  1  2  3  4  5  6  7  8  9  10 11 12
// 1  2b 2  3b 3  4  4# 5  6b 6  7b 7  8
// C  C# D  D# E  F  F# G  G# A  A# H  C

//Scale	I	II / IX		III		IV / XI		V	VI / XIII	VII	 	I(octave)
//		C	D			E		F			G	A	 		B		C

//Major							I - III - V
//Major <6>						I - III - V - VI
//Major <6add9>				I - III - V - VI - IX
//Major <maj7>						I - III - V - VII
//Major <maj9>						I - III - V - VII - IX
//Dominant <7>				I - III - V - bVII
//Dominant <dom7b10>			I - III - V - bVII - bX
//Dominant <dom7aug5>			I - III - #V - bVII
//Dominant <dom7sus4>			I - IV - V - bVII
//Dominant <dom9>				I - III - V - bVII - IX
//Dominant <dom9sus4>			I - IV - V - bVII - IX
//Dominant <dom11>			I - III - V - bVII - IX - XI
//Dominant <dom13>			I - III - V - bVII - IX - XI - XIII
//Augmented				I - III - #V
//Minor					I - bIII - V
//Minor 6				I - bIII - V - VI
//Minor 7				I - bIII - V - bVII
//Minor 7 Flat 5		I - bIII - bV - bVII
//Diminished			I - bIII - bV
//Diminished 7			I - bIII - bV - VI
//Suspended 4			I - IV - V
//Suspended 2			I - II - V
//Add 9					I - III - V - IX


//	public static final String _7_SUS4_CHORD="7sus4";
//	public static final String _7_B5_CHORD="7/b4";
//	public static final String _AUG9_CHORD="aug9";
	MAJOR(MAJOR_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MAJOR, FIFTH_PERFECT}),//C E G
	_5(_5_CHORD,new NoteInterval[]{PRIME_PERFECT,FIFTH_PERFECT}),//C G
	_6(_6_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MAJOR, FIFTH_PERFECT, SIXTH_MAJOR}),//C E A
	_7(_7_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MAJOR, FIFTH_PERFECT, SEVENTH_MINOR}),//C E B
	MAJ7(MAJ7_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MAJOR, FIFTH_PERFECT,SEVENTH_MAJOR}),//C E H
	_9(_9_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MAJOR, FIFTH_PERFECT, SEVENTH_MINOR, NINTH_MAJOR}),
	MAJ9(_9_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MAJOR, FIFTH_PERFECT, SEVENTH_MAJOR, NINTH_MAJOR}),
	_11(_11_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MAJOR, FIFTH_PERFECT, SEVENTH_MINOR, NINTH_MAJOR, ELEVENTH_MAYOR}),
	_13(_13_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MAJOR, FIFTH_PERFECT, SEVENTH_MINOR, NINTH_MAJOR, ELEVENTH_MAYOR, THIRDHTEENTH_MAYOR}),
	MAJ13(MAJ13_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MAJOR, FIFTH_PERFECT, SEVENTH_MAJOR, NINTH_MAJOR, ELEVENTH_MAYOR, THIRDHTEENTH_MAYOR}),
	_6_9(_9_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MAJOR, FIFTH_PERFECT, SEVENTH_MINOR, NINTH_MAJOR}),
	_9_SUS4(_9_SUS4_CHORD,new NoteInterval[]{PRIME_PERFECT, FOURTH_PERFECT, FIFTH_PERFECT, SEVENTH_MINOR, NINTH_MAJOR}),
	MINOR(MINOR_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MINOR, FIFTH_PERFECT}),
	ADD9(MAJOR_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MAJOR, FIFTH_PERFECT,NINTH_MAJOR}),
	MIN_6(MIN_6_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MINOR, FIFTH_PERFECT, SIXTH_MAJOR}),
	MIN_7(MIN_7_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MINOR, FIFTH_PERFECT, SEVENTH_MINOR}),
	MIN_9(MIN_9_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MINOR, FIFTH_PERFECT, SEVENTH_MINOR, NINTH_MAJOR}),
	MIN_11(MIN_11_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MINOR, FIFTH_PERFECT, SEVENTH_MINOR, NINTH_MAJOR,ELEVENTH_MAYOR}),
	MIN_13(MIN_11_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MINOR, FIFTH_PERFECT, SEVENTH_MINOR, NINTH_MAJOR,ELEVENTH_MAYOR,THIRDHTEENTH_MAYOR}),
	MIN_MAJ7(MIN_MAJ7_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MINOR, SEVENTH_MAJOR}),
	SUS2(SUS2_CHORD,new NoteInterval[]{PRIME_PERFECT,SECOND_MAJOR,FIFTH_PERFECT}),	
	SUS4(SUS4_CHORD,new NoteInterval[]{PRIME_PERFECT,FOURTH_PERFECT,FIFTH_PERFECT}),	
	
	
	AUGMENTED(AUG_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MAJOR, FIFTH_AUGMENTED}),
	DIMINISHED(DIM_CHORD,new NoteInterval[]{PRIME_PERFECT, THIRD_MINOR, FIFTH_DIMINISHED});
	
	private NoteInterval[] mScale;
	private String mName;
	
	private ChordType(String name, NoteInterval[] mScale) {
		this.mScale = mScale;
		mName=name;
	}

	public NoteInterval[] getIntervals() {
		return mScale;
	}
	
}
