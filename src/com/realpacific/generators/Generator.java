package com.realpacific.generators;

import java.util.List;

public interface Generator<T> {
    List<List<T>> generate();
}
