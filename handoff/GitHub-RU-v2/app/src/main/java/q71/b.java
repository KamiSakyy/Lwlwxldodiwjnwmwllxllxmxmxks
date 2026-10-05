package q71;

import java.util.Iterator;
import java.util.NoSuchElementException;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class b implements Iterator, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public final int f30990r;

    /* renamed from: s, reason: collision with root package name */
    public final int f30991s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f30992t;

    /* renamed from: u, reason: collision with root package name */
    public int f30993u;

    public b(char c10, char c11, int i) {
        this.f30990r = i;
        this.f30991s = c11;
        boolean z10 = false;
        if (i <= 0 ? k.h(c10, c11) >= 0 : k.h(c10, c11) <= 0) {
            z10 = true;
        }
        this.f30992t = z10;
        this.f30993u = z10 ? c10 : c11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30992t;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f30993u;
        if (i != this.f30991s) {
            this.f30993u = this.f30990r + i;
        } else {
            if (!this.f30992t) {
                throw new NoSuchElementException();
            }
            this.f30992t = false;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
