import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class TestUOM {
	public static void display(List<UOM> uoms) {
		for (UOM uom: uoms) {
			System.out.println(uom);
		}
	}

	public static void main(String []args) {
		List<UOM> uoms = Arrays.asList(new UOM[]{
			new UOM("m", 100, 1),
			new UOM("cm", 100, 100),
			new UOM("km", 100, 0.001),
			new UOM("mm", 100, 1000),
			new UOM("dm", 100, 0.1)
		});

		display(uoms);
		System.out.println("");
		uoms.sort((UOM x, UOM y) -> (int)(x.getHasil() - y.getHasil()));
		display(uoms);
	}
}