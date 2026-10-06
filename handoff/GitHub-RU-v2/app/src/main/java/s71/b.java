package s71;

import java.util.Iterator;
import java.util.NoSuchElementException;
import sy.d0;
import x61.u;

/* loaded from: /home/user/work/p/classes.dex */
public final class b implements Iterator, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f31724r = 2;

    /* renamed from: s, reason: collision with root package name */
    public int f31725s;

    /* renamed from: t, reason: collision with root package name */
    public final Iterator f31726t;

    public b(Iterator it) {
        k71.k.g(it, "iterator");
        this.f31726t = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f31724r) {
            case k5.f.J:
                break;
            case 1:
                return this.f31725s > 0 && this.f31726t.hasNext();
            default:
                return this.f31726t.hasNext();
        }
        while (true) {
            int i = this.f31725s;
            it = this.f31726t;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f31725s--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f31724r) {
            case k5.f.J:
                break;
            case 1:
                int i = this.f31725s;
                if (i == 0) {
                    throw new NoSuchElementException();
                }
                this.f31725s = i - 1;
                return this.f31726t.next();
            default:
                int i10 = this.f31725s;
                this.f31725s = i10 + 1;
                if (i10 >= 0) {
                    return new u(i10, this.f31726t.next());
                }
                d0.x();
                throw null;
        }
        while (true) {
            int i11 = this.f31725s;
            it = this.f31726t;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f31725s--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f31724r) {
            case k5.f.J:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar, byte b10) {
        this.f31725s = cVar.f31729c;
        this.f31726t = cVar.f31728b.iterator();
    }

    public b(c cVar) {
        this.f31726t = cVar.f31728b.iterator();
        this.f31725s = cVar.f31729c;
    }
    public Object t = null;
}
