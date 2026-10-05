package o1;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class n implements Iterator, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public Object[] f29935r = m.f29930e.f29934d;

    /* renamed from: s, reason: collision with root package name */
    public int f29936s;

    /* renamed from: t, reason: collision with root package name */
    public int f29937t;

    public final void a(Object[] objArr, int i, int i10) {
        this.f29935r = objArr;
        this.f29936s = i;
        this.f29937t = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29937t < this.f29936s;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
