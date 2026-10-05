package x61;

import a5.g1;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends g1 implements ListIterator {
    public final /* synthetic */ e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i) {
        super(8, eVar);
        this.u = eVar;
        int a = eVar.a();
        if (i < 0 || i > a) {
            throw new IndexOutOfBoundsException(no.a.j(i, a, "index: ", ", size: "));
        }
        ((g1) this).s = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((g1) this).s > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((g1) this).s;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = ((g1) this).s - 1;
        ((g1) this).s = i;
        return this.u.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((g1) this).s - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
