package de.blueskymaniacs.musicaltheory.notesystem;

import static de.blueskymaniacs.musicaltheory.notesystem.C.*;

public enum NoteInterval {
	// Scale I II / IX III IV / XI V VI / XIII VII I(octave)
	// C D E F G A B C
	PRIME_PERFECT(0, PERFECT_STR + " " + PRIME_STR),
	SECOND_DIMINISHED(0, DIMINISHED_STR + " " + SECOND_STR), // C
	SECOND_MINOR(1, MINOR_STR + " " + SECOND_STR),
	UNISON_AUGMENTED(1, AUGMENTED_STR + " " + PRIME_STR),
	SEMITONE(1, C.SEMITONE_STR), // CIS
	SECOND_MAJOR(2, MAJOR_STR + " " + SECOND_STR),
	THIRD_DIMINISHED(2, DIMINISHED_STR + " " + THIRD_STR), // D
	THIRD_MINOR(3, MINOR_STR + " " + THIRD_STR),
	SECOND_AUGMENTED(3, AUGMENTED_STR + " " + SECOND_STR), // DIS
	THIRD_MAJOR(4, MAJOR_STR + " " + THIRD_STR),
	FOURTH_DIMINISHED(4, DIMINISHED_STR + " " + FOURTH_STR), // E
	FOURTH_PERFECT(5, PERFECT_STR + " " + FOURTH_STR),
	THIRD_AUGMENTED(5, AUGMENTED_STR + " " + THIRD_STR), // F
	FOURTH_AUGMENTED(6, AUGMENTED_STR + " " + FOURTH_STR),
	FIFTH_DIMINISHED(6, DIMINISHED_STR + " " + FIFTH_STR),
	TRITONE(6, C.TRITONE_STR), // FIS
	FIFTH_PERFECT(7, PERFECT_STR + " " + FIFTH_STR),
	SIXTH_DIMINISHED(7, DIMINISHED_STR + " " + SIXTH_STR), // G
	SIXTH_MINOR(8, MINOR_STR + " " + THIRD_STR),
	FIFTH_AUGMENTED(8, AUGMENTED_STR + " " + FIFTH_STR), // GIS
	SIXTH_MAJOR(9, MAJOR_STR + " " + SIXTH_STR),
	SEVENTH_DIMINISHED(9, DIMINISHED_STR + " " + SEVENTH_STR), // A
	SEVENTH_MINOR(10, MINOR_STR + " " + SEVENTH_STR),
	SIXTH_AUGMENTED(10, AUGMENTED_STR + " " + SIXTH_STR), // AIS
	SEVENTH_MAJOR(11, MAJOR_STR + " " + SEVENTH_STR),
	OCTAVE_DIMINISHED(11, DIMINISHED_STR + " " + OCTAVE_STR), // H
	OCTAVE_PERFECT(12, PERFECT_STR + " " + OCTAVE_STR),
	SEVENTH_AUGMENTED(12, AUGMENTED_STR + " " + SEVENTH_STR), // C
	NINTH_MAJOR(14, MAJOR_STR + " " + NINTH_STR), // D
	ELEVENTH_MAYOR(17, MAJOR_STR + " " + ELEVENTH_STR), // F
	THIRDHTEENTH_MAYOR(21, MAJOR_STR + " " + THIRDTEENTH_STR)// A
	;

	/**
	 * Count of semitones.
	 */
	private int countSemitones;
	/**
	 * The name.
	 */
	private String name;

	private NoteInterval(int countHalfTones, String name) {
		this.countSemitones = countHalfTones;
		this.name = name;
	}

	/**
	 * Get the count of semitones.
	 * 
	 * @return count of semitones
	 */
	public int getSemitones() {
		return countSemitones;
	}

	@Override
	public String toString() {
		return name;
	}

}
