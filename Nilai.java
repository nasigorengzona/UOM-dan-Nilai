public class Nilai {
	private String nama;
	private double tugas;
	private double uts;
	private double uas;

	public Nilai(String nama, double tugas, double uts, double uas) {
		this.nama = nama;
		this.tugas = tugas;
		this.uts = uts;
		this.uas = uas;
	}

	public String getNama() { return nama; }
	public double getTugas() { return tugas; }
	public double getUTS() { return uts; }
	public double getUAS() { return uas; }
	public double getNilaiAkhir() {
		return ((getTugas()*0.3) + (getUTS()*0.3) + (getUAS()*0.4));
	}
	
	
	public String toString() {
		return String.format("Nilai<%s Tugas: %.2f UTS: %.2f UAS: %.2f Nilai Akhir: %.2f>", nama, tugas, uts, uas, getNilaiAkhir());
	}
}