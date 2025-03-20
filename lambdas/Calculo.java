package lambdas;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	@Contract(pure = true)
	static @NotNull String muitoLegal() {
		return "muito legal";
	}
}
