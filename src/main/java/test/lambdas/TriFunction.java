package test.lambdas;

public interface TriFunction<T, U, V, R> {

    R result(T t, U u, V v);
}
