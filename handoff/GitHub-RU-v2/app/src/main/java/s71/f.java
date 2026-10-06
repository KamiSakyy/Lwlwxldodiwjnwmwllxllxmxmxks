package s71;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements Iterator, l71.a {

    /* renamed from: s, reason: collision with root package name */
    public final Iterator f31732s;

    /* renamed from: u, reason: collision with root package name */
    public Object f31734u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f31735v;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f31731r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f31733t = -1;

    public f(g gVar) {
        this.f31735v = gVar;
        this.f31732s = gVar.f31736a.iterator();
    }

    public void a() {
        Object next;
        g gVar = (g) this.f31735v;
        do {
            Iterator it = this.f31732s;
            if (!it.hasNext()) {
                this.f31733t = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) gVar.f31738c.k(next)).booleanValue() != gVar.f31737b);
        this.f31734u = next;
        this.f31733t = 1;
    }

    public void b() {
        Iterator it = this.f31732s;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((l) this.f31735v).f31748c.k(next)).booleanValue()) {
                this.f31733t = 1;
                this.f31734u = next;
                return;
            }
        }
        this.f31733t = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f31731r) {
            case k5.f.J:
                if (this.f31733t == -1) {
                    a();
                }
                if (this.f31733t == 1) {
                }
                break;
            default:
                if (this.f31733t == -1) {
                    b();
                }
                if (this.f31733t == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f31731r) {
            case k5.f.J:
                if (this.f31733t == -1) {
                    a();
                }
                if (this.f31733t == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f31734u;
                this.f31734u = null;
                this.f31733t = -1;
                return obj;
            default:
                if (this.f31733t == -1) {
                    b();
                }
                if (this.f31733t == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f31734u;
                this.f31734u = null;
                this.f31733t = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f31731r) {
            case k5.f.J:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(l lVar) {
        this.f31735v = lVar;
        this.f31732s = lVar.f31747b.iterator();
    }
    public static final Object J = null;
}
