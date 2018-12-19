package lambda;

public interface Convert<T, F> {

	F convert(T from);
}
