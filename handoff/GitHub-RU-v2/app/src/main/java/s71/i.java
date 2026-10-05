package s71;

import java.util.Iterator;
import java.util.NoSuchElementException;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class i implements Iterator, a71.c, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public int f31739r;

    /* renamed from: s, reason: collision with root package name */
    public Object f31740s;

    /* renamed from: t, reason: collision with root package name */
    public Iterator f31741t;

    /* renamed from: u, reason: collision with root package name */
    public a71.c f31742u;

    public final RuntimeException a() {
        int i = this.f31739r;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f31739r);
    }

    public final void b(a71.c cVar, Object obj) {
        this.f31740s = obj;
        this.f31739r = 3;
        this.f31742u = cVar;
        b71.a aVar = b71.a.r;
        k71.k.g(cVar, "frame");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f31739r;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f31741t;
                k71.k.d(it);
                if (it.hasNext()) {
                    this.f31739r = 2;
                    return true;
                }
                this.f31741t = null;
            }
            this.f31739r = 5;
            a71.c cVar = this.f31742u;
            k71.k.d(cVar);
            this.f31742u = null;
            cVar.i(a0.a);
        }
    }

    public final void i(Object obj) {
        y.j(obj);
        this.f31739r = 4;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f31739r;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f31739r = 1;
            Iterator it = this.f31741t;
            k71.k.d(it);
            return it.next();
        }
        if (i != 3) {
            throw a();
        }
        this.f31739r = 0;
        Object obj = this.f31740s;
        this.f31740s = null;
        return obj;
    }

    public final a71.h q() {
        return a71.i.r;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
