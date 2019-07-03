import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class TestCollection {
	public static void main(String []args) {
		List<Nilai> ns = Arrays.asList(new Nilai[]{
					new Nilai("budi", 70.0, 80.0, 90.0),
					new Nilai("susi", 30.0, 90.0, 70.0),
					new Nilai("agus", 60.0, 30.0, 20.0),
					new Nilai("rudi", 90.0, 40.0, 30.0)
		});

		System.out.println(ns);
		
		ns.sort(new NilaiTugasComparator());
		System.out.println(ns);
		
		//anon class
		ns.sort(new Comparator<Nilai>() {
			public int compare(Nilai n1, Nilai n2) {
				return (int)(n1.getUTS() - n2.getUTS());
			}
		});
		System.out.println(ns);
		
		//anon fuction/lambda
		ns.sort((Nilai x, Nilai y) -> (int)(x.getUAS() - y.getUAS()));
		System.out.println(ns);
		
		ns.sort(new NilaiTugasComparator());
		System.out.println(ns);
		ns.sort(new NilaiUTSComparator());
		System.out.println(ns);
		ns.sort(new NilaiUASComparator());
		System.out.println(ns);	
		ns.sort(new NilaiAkhirComparator());
		System.out.println(ns);	

		
	}
}

class NilaiTugasComparator implements Comparator<Nilai> {
	public int compare(Nilai n1, Nilai n2) {
		return (int)(n1.getTugas() - n2.getTugas());
	}
}

class NilaiUTSComparator implements Comparator<Nilai> {
	public int compare(Nilai n1, Nilai n2) {
		return (int)(n1.getUTS() - n2.getUTS());
	}
}
	
class NilaiUASComparator implements Comparator<Nilai> {
	public int compare(Nilai n1, Nilai n2) {
		return (int)(n1.getUAS() - n2.getUAS());
	}	
}

class NilaiAkhirComparator implements Comparator<Nilai> {
	public int compare(Nilai n1, Nilai n2) {
		return (int)(n1.getNilaiAkhir() - n2.getNilaiAkhir());
	}	
}