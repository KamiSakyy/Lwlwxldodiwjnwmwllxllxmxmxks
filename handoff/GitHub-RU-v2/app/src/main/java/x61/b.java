package x61;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b implements Iterator, l71.a {
    public int r;
    public Object s;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.r;
        if (i == 0) {
            this.r = 3;
            a();
            return this.r == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.r;
        if (i == 1) {
            this.r = 0;
            return this.s;
        }
        if (i != 2) {
            this.r = 3;
            a();
            if (this.r == 1) {
                this.r = 0;
                return this.s;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
