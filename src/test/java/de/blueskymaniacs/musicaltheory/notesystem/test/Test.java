package de.blueskymaniacs.musicaltheory.notesystem.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

import de.blueskymaniacs.musicaltheory.notesystem.Chord;
import de.blueskymaniacs.musicaltheory.notesystem.ChordType;
import de.blueskymaniacs.musicaltheory.notesystem.Note;
import de.blueskymaniacs.musicaltheory.notesystem.NoteFrequenz;
import de.blueskymaniacs.musicaltheory.notesystem.NoteSystem;
import de.blueskymaniacs.musicaltheory.notesystem.TonalSystem;
import de.blueskymaniacs.musicaltheory.notesystem.TonalSystemType;

public class Test {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// printScales(Note.C);
		// System.out.println();
		// System.out.println();
		// printChord(Note.C);
		// System.out.println();
		// System.out.println();
		// printChordsOfScale(Note.C, TonalSystemType.MAJOR);
		// printScaleCompletition();
		NoteSystem noteSystem = NoteSystem.GERMAN_NOTESYSTEM;
		Note[] scale = noteSystem.getScale(Note.A, TonalSystemType.BLUES);
		Random random = new Random();
		LinkedList<Note> notes1 = new LinkedList<>();

		for (int i = 0; i < 40; i++) {
			notes1.add(scale[random.nextInt(scale.length)]);
		}

		LinkedList<Note> notes2 = new LinkedList<>();

		for (int i = 0; i < 40; i++) {
			notes2.add(scale[random.nextInt(scale.length)]);
		}

		new NoteFrequenz.German().play(notes1.toArray(new Note[0]), notes2.toArray(new Note[0]));
	}

	private static void printScales(Note note) {
		System.out.println("Scales");
		NoteSystem noteSystem = NoteSystem.GERMAN_NOTESYSTEM;
		for (TonalSystemType t : TonalSystemType.values()) {
			Note[] scale = noteSystem.getScale(note, t);
			System.out.println(t.toString() + " : " + Arrays.toString(scale));
		}
	}

	private static void printChord(Note note) {
		System.out.println("Chords");
		NoteSystem noteSystem = NoteSystem.GERMAN_NOTESYSTEM;
		for (ChordType c : ChordType.values()) {
			Chord chord = noteSystem.getChord(note, c);
			System.out.println(c.toString() + " : " + chord.notesToString());
		}
	}

	private static void printChordsOfScale(Note note, TonalSystemType type) {
		System.out.println("Chord of scale");
		NoteSystem noteSystem = NoteSystem.GERMAN_NOTESYSTEM;
		Chord[] chords = noteSystem.getChords(note, type);
		for (Chord c : chords) {
			System.out.println(c.toString() + " : " + c.notesToString());
		}
	}

	private static void printScaleCompletition() {
		System.out.println("printScaleCompletition");
		NoteSystem noteSystem = NoteSystem.GERMAN_NOTESYSTEM;
		Chord C = noteSystem.getChord(Note.C, ChordType.MAJOR);
		Chord E = noteSystem.getChord(Note.E, ChordType.MINOR);
		Chord[] chords = new Chord[] { C, E };
		TonalSystem[] tonalSystems = noteSystem.getChords(chords);
		for (TonalSystem tonalSystem : tonalSystems) {
			for (Chord c : tonalSystem.getChords()) {
				System.out.println(c.toString() + " : " + c.notesToString());
			}
		}
	}

}
