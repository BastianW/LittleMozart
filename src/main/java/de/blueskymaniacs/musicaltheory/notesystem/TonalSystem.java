package de.blueskymaniacs.musicaltheory.notesystem;

import java.util.Arrays;
import java.util.HashSet;

public class TonalSystem {
	private ChordType[] chordTypeSteps=new ChordType[]{ChordType.MAJOR, ChordType.MINOR, ChordType.MINOR, ChordType.MAJOR, ChordType.MAJOR, ChordType.MINOR, ChordType.DIMINISHED};
	private int offset = 0;
	private HashSet<Chord> hashChords = new HashSet<Chord>();
	private Chord[] chords=new Chord[7];

	/**
	 * @param system
	 * @param rootNote
	 * @param type
	 */
	public TonalSystem(NoteSystem system, Note rootNote, TonalSystemType type) {
		offset = type.getOffset();
		if (offset < 0) {
			throw new IllegalArgumentException("type is not a Kirchentonart");
		}
		NoteInterval[] scale = type.getScale();
		for(int i=0; i<chordTypeSteps.length; i++) {
			Note note = system.getNote(rootNote, scale[i]);
			Chord chord = system.getChord(note, chordTypeSteps[(i+offset)%chordTypeSteps.length]);
			chords[i]=chord;
			hashChords.add(chord);
		}

	}

	public Chord[] getChords() {
		return Arrays.copyOf(chords, chords.length);
	}

	private boolean containsChord(Chord chord) {
		return hashChords.contains(chord);
	}
	public boolean containsChords(Chord... chords) {
		for(Chord chord: chords) {
			if(!hashChords.contains(chord)) {
				return false;
			}
		}
		return true;
	}
}
