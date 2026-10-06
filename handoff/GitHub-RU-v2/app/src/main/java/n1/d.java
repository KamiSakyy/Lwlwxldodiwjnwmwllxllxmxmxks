package n1;

import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends a {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f29373t = 1;

    /* renamed from: u, reason: collision with root package name */
    public Object f29374u;

    public d(Object[] objArr, int i, int i10) {
        super(i, i10);
        this.f29374u = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f29373t) {
            case k5.f.J /* 0 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f29374u;
                int i = this.f29369r;
                this.f29369r = i + 1;
                return objArr[i];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f29369r++;
                return this.f29374u;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f29373t) {
            case k5.f.J /* 0 */:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f29374u;
                int i = this.f29369r - 1;
                this.f29369r = i;
                return objArr[i];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f29369r--;
                return this.f29374u;
        }
    }

    public d(int i, Object obj) {
        super(i, 1);
        this.f29374u = obj;
    }
}
