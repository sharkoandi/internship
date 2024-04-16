package LambdaExpressions;

import java.util.List;

public interface GetArrayReturnList<T>{
    List<T> apply(T[] arr);
}
