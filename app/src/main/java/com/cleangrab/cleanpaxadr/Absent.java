package com.cleangrab.cleanpaxadr;

import android.support.annotation.Nullable;

import java.util.Collections;
import java.util.Set;

/**
 * Created by qingyun.wang on 11/12/17.
 */

final class Absent<T> extends Optional<T> {
    static final Absent<Object> INSTANCE = new Absent<>();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    @SuppressWarnings("unchecked") // implementation is "fully variant"
    static <T> Optional<T> withType() {
        return (Optional<T>) INSTANCE;
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    @Override
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override
    public T or(T defaultValue) {
        return Preconditions.checkNotNull(defaultValue, "use Optional.orNull() instead of Optional.or(null)");
    }

    @SuppressWarnings("unchecked") // safe covariant cast
    @Override
    public Optional<T> or(Optional<? extends T> secondChoice) {
        return (Optional<T>) Preconditions.checkNotNull(secondChoice);
    }

    @Override
    @Nullable
    public T orNull() {
        return null;
    }

    @Override
    public Set<T> asSet() {
        return Collections.emptySet();
    }

    @Override
    public <V> Optional<V> transform(Function<? super T, V> function) {
        Preconditions.checkNotNull(function);
        return absent();
    }

    @Override
    public boolean equals(@Nullable Object object) {
        return object == this;
    }

    @Override
    public int hashCode() {
        return 0x598df91c;
    }

    @Override
    public String toString() {
        return "Optional.absent()";
    }

    private Object readResolve() {
        return INSTANCE;
    }
}