package n1;

import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes.dex */
public final class g extends a {

    /* renamed from: t, reason: collision with root package name */
    public final Object[] f29387t;

    /* renamed from: u, reason: collision with root package name */
    public final j f29388u;

    public g(int i, int i10, int i11, Object[] objArr, Object[] objArr2) {
        super(i, i10);
        this.f29387t = objArr2;
        int i12 = (i10 - 1) & (-32);
        this.f29388u = new j(objArr, i > i12 ? i12 : i, i12, i11);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f29388u;
        if (jVar.hasNext()) {
            this.f29369r++;
            return jVar.next();
        }
        int i = this.f29369r;
        this.f29369r = i + 1;
        return this.f29387t[i - jVar.f29370s];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f29369r;
        j jVar = this.f29388u;
        int i10 = jVar.f29370s;
        if (i <= i10) {
            this.f29369r = i - 1;
            return jVar.previous();
        }
        int i11 = i - 1;
        this.f29369r = i11;
        return this.f29387t[i11 - i10];
    }
}
