package n1;

import java.util.ListIterator;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a implements ListIterator, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public int f29369r;

    /* renamed from: s, reason: collision with root package name */
    public int f29370s;

    public a(int i, int i10) {
        this.f29369r = i;
        this.f29370s = i10;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f29369r < this.f29370s;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f29369r > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f29369r;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f29369r - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
