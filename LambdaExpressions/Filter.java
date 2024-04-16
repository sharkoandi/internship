package LambdaExpressions;

import java.util.List;

public interface Filter<T> {
    List<T> func(T[] array);
}
