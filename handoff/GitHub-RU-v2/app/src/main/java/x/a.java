package x;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements Iterator, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public int f33512r;

    /* renamed from: s, reason: collision with root package name */
    public int f33513s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f33514t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f33515u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f33516v;

    public a(int i) {
        this.f33512r = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33513s < this.f33512r;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f6;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f33513s;
        switch (this.f33515u) {
            case k5.f.J:
                f6 = ((e) this.f33516v).f(i);
                break;
            case 1:
                f6 = ((e) this.f33516v).i(i);
                break;
            default:
                f6 = ((f) this.f33516v).f33555s[i];
                break;
        }
        this.f33513s++;
        this.f33514t = true;
        return f6;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f33514t) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f33513s - 1;
        this.f33513s = i;
        switch (this.f33515u) {
            case k5.f.J:
                ((e) this.f33516v).g(i);
                break;
            case 1:
                ((e) this.f33516v).g(i);
                break;
            default:
                ((f) this.f33516v).a(i);
                break;
        }
        this.f33512r--;
        this.f33514t = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f33556t);
        this.f33515u = 2;
        this.f33516v = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i) {
        this(eVar.f33610t);
        this.f33515u = i;
        switch (i) {
            case 1:
                this.f33516v = eVar;
                this(eVar.f33610t);
                break;
            default:
                this.f33516v = eVar;
                break;
        }
    }
}
