package de.blueskymaniacs.musicaltheory.notesystem;

import static de.blueskymaniacs.musicaltheory.notesystem.C.AEOLIAN_MODE;
import static de.blueskymaniacs.musicaltheory.notesystem.C.BLUES_MODE;
import static de.blueskymaniacs.musicaltheory.notesystem.C.DORIAN_MODE;
import static de.blueskymaniacs.musicaltheory.notesystem.C.IONIAN_MODE;
import static de.blueskymaniacs.musicaltheory.notesystem.C.LOCRIAN_MODE;
import static de.blueskymaniacs.musicaltheory.notesystem.C.LYDIAN_MODE;
import static de.blueskymaniacs.musicaltheory.notesystem.C.MAJOR_MODE;
import static de.blueskymaniacs.musicaltheory.notesystem.C.MINOR_MODE;
import static de.blueskymaniacs.musicaltheory.notesystem.C.MIXOLYDIAN_MODE;
import static de.blueskymaniacs.musicaltheory.notesystem.C.PENTATONIC_MAJOR_MODE;
import static de.blueskymaniacs.musicaltheory.notesystem.C.PENTATONIC_MINOR_MODE;
import static de.blueskymaniacs.musicaltheory.notesystem.C.PHRYGIAN_MODE;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.FIFTH_DIMINISHED;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.FIFTH_PERFECT;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.FOURTH_AUGMENTED;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.FOURTH_PERFECT;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.PRIME_PERFECT;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.SECOND_AUGMENTED;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.SECOND_MAJOR;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.SECOND_MINOR;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.SEVENTH_MAJOR;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.SEVENTH_MINOR;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.SIXTH_AUGMENTED;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.SIXTH_MAJOR;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.SIXTH_MINOR;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.THIRD_AUGMENTED;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.THIRD_MAJOR;
import static de.blueskymaniacs.musicaltheory.notesystem.NoteInterval.THIRD_MINOR;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public enum NoteSystem {
	/**
	 * The German note system.
	 */
	GERMAN_NOTESYSTEM(NoteSystemProvider.GERMAN_SYSTEM),
	
	/**
	 * The American note system.
	 */
	AMERICAN_NOTESYSTEM(NoteSystemProvider.AMERICAN_SYSTEM);

	/**
	 * The notes
	 */
	private Note[][] notes;
	
	private HashMap<Note, int[]> notePositions=new HashMap<>();

	/**
	 * Private constructor.
	 * @param notes
	 */
	private NoteSystem(Note[][] notes) {
		this.notes = notes;
		for (int i = 0; i < notes.length; i++) {
			for (int j = 0; j < notes[i].length; j++) {
				Note note = notes[i][j];
				if(note!=null){
					notePositions.put(note, new int[]{i,j});
				}
			}
		}
	
	}

	/**
	 * Get all notes of the note system.
	 * @return
	 */
	public Note[][] getNotes() {
		return notes;
	}

	/**
	 * Get the index which represent the note in the current note system.
	 * 
	 * @param note
	 * @return
	 */
	private int[] getIndex(Note note) {
		if(note==null){
			throw new IllegalArgumentException("the note have to valid and not null.");
		}
		int[] aPos = notePositions.get(note);
		if(aPos!=null){
			return aPos;		
		}
		throw new IllegalArgumentException(
				"Note is not represented in current note system!");
	}
	
	
	
	public Note getNote(Note note, NoteInterval interval) {
		return _getNote(getIndex(note), interval);
	}
	
	
	private Note _getNote(int[] index, NoteInterval interval) {
		int i = index[0];
		int j = index[1];
		i += interval.getSemitones();
		i %= notes.length;
		Note note = notes[i][j];
		while (note == null) {
			j++;
			j %= 3;
			note = notes[i][j];
		}
		return note;
	}

	public NoteInterval getInterval(Note note1, Note note2) {
		int[] index1 = getIndex(note1);
		int[] index2 = getIndex(note2);
		int dIndex=index1[0]-index2[0];
		dIndex+=notes.length;
		dIndex%=notes.length;
		for(NoteInterval interval: NoteInterval.values()) {
			if(interval.getSemitones()==dIndex) {
				return interval;
			}
				
		}
		return null;
	}

	public Note[] getScale(Note rootNote, TonalSystemType tonalSystem) {
		return _getScale(getIndex(rootNote), tonalSystem.getScale());
	}

	private Note[] _getScale(int[] index, NoteInterval[] intervals) {

		Note[] scale = new Note[intervals.length];
		for (int i = 0; i < intervals.length; i++) {
			scale[i] = _getNote(index, intervals[i]);
		}

		return scale;
	}

	public Chord getChord(Note rootNote, ChordType chordType) {
		return new Chord(rootNote, _getChord(getIndex(rootNote), chordType));
	}

	private Note[] _getChord(int[] rootNote, ChordType chordType) {
		NoteInterval[] intervals = chordType.getIntervals();
		Note[] notes = new Note[intervals.length];
		for (int i = 0; i < intervals.length; i++) {
			notes[i] = _getNote(rootNote, intervals[i]);
		}
		return notes;
	}

	public TonalSystem[] getChords(Chord... chords) {
		List<TonalSystem> tonalSystems = new LinkedList<TonalSystem>();
		for (Note[] notes : getNotes()) {
			for (Note note : notes) {
				if (note != null) {
					tonalSystems.add(new TonalSystem(this, note, TonalSystemType.MAJOR));
				}
			}
		}
		List<TonalSystem> deleteList = new LinkedList<TonalSystem>();
		for(TonalSystem tonalSystem: tonalSystems) {
			
			if(!tonalSystem.containsChords(chords)) {
				deleteList.add(tonalSystem);
			}
		}
		tonalSystems.removeAll(deleteList);
		return  tonalSystems.toArray(new TonalSystem[tonalSystems.size()]);
	}

	/**
	 * @param rootNote
	 * @param tonalSystem
	 * @return
	 */
	public Chord[] getChords(Note rootNote, TonalSystemType tonalSystem) {
		Chord[] chords = new Chord[7];
		int offset = tonalSystem.getOffset();
		Note[] scale = getScale(rootNote, TonalSystemType.MAJOR);
		if (offset < 0)
			throw new IllegalArgumentException(tonalSystem.name()
					+ " is not an valid argument");
		for (int i = 0; i < 7; i++) {
			int step = (i + offset) % 7;
			switch (step) {
			case 0:// MAJOR =>IONIAN, MAJOR
			case 3: // MAJOR =>LYDIAN
			case 4: // MAJOR =>MIXOLYDIAN
				chords[i] = getChord(scale[step], ChordType.MAJOR);
				break;
			case 1:// MINOR =>DORIAN
			case 2: // MINOR =>PHRYGIAN
			case 5:// MINOR =>AEOLIAN, MINOR
				chords[i] = getChord(scale[step], ChordType.MINOR);
				break;
			case 6:// DIMINISHED =>LOCRIAN
				chords[i] = getChord(scale[step], ChordType.DIMINISHED);
				break;
			default:
				break;
			}
		}

		return chords;
	}

}
