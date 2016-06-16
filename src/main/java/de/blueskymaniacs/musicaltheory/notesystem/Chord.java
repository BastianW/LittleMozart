package de.blueskymaniacs.musicaltheory.notesystem;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Chord implements Iterable<Note> {

	private Note mRootNote;
	private TreeSet<Note> mNotes = new TreeSet<Note>();

	public Chord(Note rootNote, Note... additionalNotes) {
		if (rootNote == null || additionalNotes == null) {
			throw new IllegalArgumentException("root note should note be null");
		}
		mRootNote = rootNote;
		mNotes.add(rootNote);
		for (Note n : additionalNotes) {
			mNotes.add(n);
		}
	}

	public String[] getNames() {
		// TODO
		return new String[] { "no name found" };
	}

	public Note getRootNote() {
		return mRootNote;
	}

	@Override
	public Iterator<Note> iterator() {
		return mNotes.iterator();
	}

	@Override
	public String toString() {
		return getNames()[0];
	}

	public String notesToString() {
		StringBuilder builder = new StringBuilder("[");
		for (Note n : this) {
			builder.append(n.toString());
			builder.append(", ");
		}
		builder.delete(builder.length() - 2, builder.length() - 1);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Chord) {
			Chord c2 = (Chord) obj;
			HashSet<Note> testHash = new HashSet<Note>();
			testHash.addAll(mNotes);
			testHash.addAll(c2.mNotes);
			if (testHash.size() == mNotes.size() && c2.mNotes.size() != 0) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return mRootNote.hashCode();
	}
}
