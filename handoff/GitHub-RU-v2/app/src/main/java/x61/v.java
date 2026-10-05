package x61;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v implements Iterator, l71.a {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
