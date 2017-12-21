package com.cleangrab.cleanpaxadr;

import java.util.Iterator;

/**
 * Created by qingyun.wang on 11/12/17.
 */

public abstract class UnmodifiableIterator<E> implements Iterator<E> {
    /**
     * Constructor for use by subclasses.
     */
    protected UnmodifiableIterator() {
    }

    /**
     * Guaranteed to throw an exception and leave the underlying data unmodified.
     *
     * @throws UnsupportedOperationException always
     * @deprecated Unsupported operation.
     */
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}