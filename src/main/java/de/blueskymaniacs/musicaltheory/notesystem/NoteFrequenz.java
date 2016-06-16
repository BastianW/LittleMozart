package de.blueskymaniacs.musicaltheory.notesystem;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public abstract class NoteFrequenz {
	public static class German extends NoteFrequenz {
		/* 88 */ public static final double c5 = 4186.01;
		/* 87 */ public static final double h4 = 3951.07;
		/* 86 */ public static final double ais4 = 3729.31;
		/* "" */ public static final double b4 = 3729.31;
		/* 85 */ public static final double a4 = 3520.00;
		/* 84 */ public static final double gis4 = 3322.44;
		/* "" */ public static final double as4 = 3322.44;
		/* 83 */ public static final double g4 = 3135.96;
		/* 82 */ public static final double fis4 = 2959.96;
		/* "" */ public static final double ges4 = 2959.96;
		/* 81 */ public static final double f4 = 2793.83;
		/* 80 */ public static final double e4 = 2637.02;
		/* 79 */ public static final double dis4 = 2489.02;
		/* "" */ public static final double es4 = 2489.02;
		/* 78 */ public static final double d4 = 2349.32;
		/* 77 */ public static final double cis4 = 2217.46;
		/* "" */ public static final double des4 = 2217.46;
		/* 76 */ public static final double c4 = 2093.00;
		/* 75 */ public static final double h3 = 1975.53;
		/* 74 */ public static final double ais3 = 1864.66;
		/* "" */ public static final double b3 = 1864.66;
		/* 73 */ public static final double a3 = 1760.00;
		/* 72 */ public static final double gis3 = 1661.22;
		/* "" */ public static final double as3 = 1661.22;
		/* 71 */ public static final double g3 = 1567.98;
		/* 70 */ public static final double fis3 = 1479.98;
		/* "" */ public static final double ges3 = 1479.98;
		/* 69 */ public static final double f3 = 1396.91;
		/* 68 */ public static final double e3 = 1318.51;
		/* 67 */ public static final double dis3 = 1244.51;
		/* "" */ public static final double es3 = 1244.51;
		/* 66 */ public static final double d3 = 1174.66;
		/* 65 */ public static final double cis3 = 1108.73;
		/* "" */ public static final double des3 = 1108.73;
		/* 64 */ public static final double c3 = 1046.50;
		/* 63 */ public static final double h2 = 987.767;
		/* 62 */ public static final double ais2 = 932.328;
		/* "" */ public static final double b2 = 932.328;
		/* 61 */ public static final double a2 = 880.000;
		/* 60 */ public static final double gis2 = 830.609;
		/* "" */ public static final double as2 = 830.609;
		/* 59 */ public static final double g2 = 783.991;
		/* 58 */ public static final double fis2 = 739.989;
		/* "" */ public static final double ges2 = 739.989;
		/* 57 */ public static final double f2 = 698.456;
		/* 56 */ public static final double e2 = 659.255;
		/* 55 */ public static final double dis2 = 622.254;
		/* "" */ public static final double es2 = 622.254;
		/* 54 */ public static final double d2 = 587.330;
		/* 53 */ public static final double cis2 = 554.365;
		/* "" */ public static final double des2 = 554.365;
		/* 52 */ public static final double c2 = 523.251;
		/* 51 */ public static final double h1 = 493.883;
		/* 50 */ public static final double ais1 = 466.164;
		/* "" */ public static final double b1 = 466.164;
		/* 49 */ public static final double a1 = 440.000;
		/* 48 */ public static final double gis1 = 415.305;
		/* "" */ public static final double as1 = 415.305;
		/* 47 */ public static final double g1 = 391.995;
		/* 46 */ public static final double fis1 = 369.994;
		/* "" */ public static final double ges1 = 369.994;
		/* 45 */ public static final double f1 = 349.228;
		/* 44 */ public static final double e1 = 329.628;
		/* 43 */ public static final double dis1 = 311.127;
		/* "" */ public static final double es1 = 311.127;
		/* 42 */ public static final double d1 = 293.665;
		/* 41 */ public static final double cis1 = 277.183;
		/* "" */ public static final double des1 = 277.183;
		/* 40 */ public static final double c1 = 261.626;
		/* 39 */ public static final double h = 246.942;
		/* 38 */ public static final double ais = 233.082;
		/* "" */ public static final double b = 233.082;
		/* 37 */ public static final double a = 220.000;
		/* 36 */ public static final double gis = 207.652;
		/* "" */ public static final double as = 207.652;
		/* 35 */ public static final double g = 195.998;
		/* 34 */ public static final double fis = 184.997;
		/* "" */ public static final double ges = 184.997;
		/* 33 */ public static final double f = 174.614;
		/* 32 */ public static final double e = 164.814;
		/* 31 */ public static final double dis = 155.563;
		/* "" */ public static final double es = 155.563;
		/* 30 */ public static final double d = 146.832;
		/* 29 */ public static final double cis = 138.591;
		/* "" */ public static final double des = 138.591;
		/* 28 */ public static final double c = 130.813;
		/* 27 */ public static final double H = 123.471;
		/* 26 */ public static final double Ais = 116.541;
		/* "" */ public static final double B = 116.541;
		/* 25 */ public static final double A = 110.000;
		/* 24 */ public static final double Gis = 103.826;
		/* "" */ public static final double As = 103.826;
		/* 23 */ public static final double G = 97.9989;
		/* 22 */ public static final double Fis = 92.4986;
		/* "" */ public static final double Ges = 92.4986;
		/* 21 */ public static final double F = 87.3071;
		/* 20 */ public static final double E = 82.4069;
		/* 19 */ public static final double Dis = 77.7817;
		/* "" */ public static final double Es = 77.7817;
		/* 18 */ public static final double D = 73.4162;
		/* 17 */ public static final double Cis = 69.2957;
		/* "" */ public static final double Des = 69.2957;
		/* 16 */ public static final double C = 65.4064;
		/* 15 */ public static final double H1 = 61.7354;
		/* 14 */ public static final double Ais1 = 58.2705;
		/* "" */ public static final double B1 = 58.2705;
		/* 13 */ public static final double A1 = 55.0000;
		/* 12 */ public static final double Gis1 = 51.9131;
		/* "" */ public static final double As1 = 51.9131;
		/* 11 */ public static final double G1 = 48.9994;
		/* 10 */ public static final double Fis1 = 46.2493;
		/* "" */ public static final double Ges1 = 46.2493;
		/* 9 */ public static final double F1 = 43.6535;
		/* 8 */ public static final double E1 = 41.2034;
		/* 7 */ public static final double Dis1 = 38.8909;
		/* "" */ public static final double Es1 = 38.8909;
		/* 6 */ public static final double D1 = 36.7081;
		/* 5 */ public static final double Cis1 = 34.6478;
		/* "" */ public static final double Des1 = 34.6478;
		/* 4 */ public static final double C1 = 32.7032;
		/* 3 */ public static final double H2 = 30.8677;
		/* 2 */ public static final double Ais2 = 29.1352;
		/* "" */ public static final double B2 = 29.1352;
		/* 1 */ public static final double A2 = 27.5000;
		/* 0 */ public static final double Gis2 = 25.9565;
		/* "" */ public static final double As2 = 25.9565;
		/*-1*/ public static final double G2 = 24.4997;
		/*-2*/ public static final double Fis2 = 23.1247;
		/* "" */ public static final double Ges2 = 23.1247;
		/*-3*/ public static final double F2 = 21.8268;
		/*-4*/ public static final double E2 = 20.6017;
		/*-5*/ public static final double Dis2 = 19.4454;
		/* "" */ public static final double Es2 = 19.4454;
		/*-6*/ public static final double D2 = 18.3540;
		/*-7*/ public static final double Cis2 = 17.3239;
		/* "" */ public static final double Des2 = 17.3239;
		/*-8*/ public static final double C2 = 16.3516;

		@Override
		protected double[] mapToFrequenz(Note[] notes) {
			double[] results = new double[notes.length];
			for (int i = 0; i < results.length; i++) {
				results[i] = mapToFrequenz(notes[i]);
			}
			return results;
		}

		private double mapToFrequenz(Note note) {
			switch (note) {
			case A:
				return a1;
			case AIS:
				return ais1;
			case AS:
				return as1;
			case B:
				return b1;
			case BES:
				return 0;
			case BIS:
				return 0;
			case C:
				return c1;
			case CES:
				return h1;
			case CIS:
				return cis1;
			case D:
				return d1;
			case DES:
				return des1;
			case DIS:
				return dis1;
			case E:
				return e1;
			case EIS:
				return f1;
			case ES:
				return es1;
			case F:
				return f1;
			case FES:
				return e1;
			case FIS:
				return fis1;
			case G:
				return g1;
			case GES:
				return ges1;
			case GIS:
				return gis1;
			case H:
				return h1;
			case HIS:
				return c1;
			default:
				return 0;

			}
		}
	}

	public void play(Note[]... notes) throws Exception {
		double[][]mapToFrequenzes=new double[notes.length][];
		int max=0;
		for(int i=0; i<notes.length; i++){
			Note[] tmpNotes = notes[i];
			if(tmpNotes.length>max){
				max=tmpNotes.length;
			}
			mapToFrequenzes[i]=mapToFrequenz(tmpNotes);
		}

		byte[] buf = new byte[1];
		;
		AudioFormat af = new AudioFormat((float) 44100, 8, 1, true, false);
		SourceDataLine[] sdls = new SourceDataLine[mapToFrequenzes.length];
		for (int i = 0; i < sdls.length; i++) {
			sdls[i]=AudioSystem.getSourceDataLine(af);
		}
		for (SourceDataLine sourceDataLine : sdls) {
			sourceDataLine.open();
			sourceDataLine.start();
		}
		
		
		for (int j = 0; j < max; j++) {
			
//			System.out.println(notes[j].name());
			long start = System.currentTimeMillis();
			for (int runs = 0; System.currentTimeMillis() - start < 300; runs++) {
				for(int i=0; i<mapToFrequenzes.length;i++){
					if(mapToFrequenzes[i].length<=j){
						continue;
					}
				double frequenz = mapToFrequenzes[i][j];
				double angle = runs / (44100 / frequenz) * 2.0 * Math.PI;
				buf[0] = (byte) (Math.sin(angle) * 100);
				sdls[i].write(buf, 0, 1);
				}
			}
		}
		for (SourceDataLine sourceDataLine : sdls) {
			sourceDataLine.drain();
		}
		for (SourceDataLine sourceDataLine : sdls) {
			sourceDataLine.stop();
		}
	}

	protected abstract double[] mapToFrequenz(Note[] notes);
}
