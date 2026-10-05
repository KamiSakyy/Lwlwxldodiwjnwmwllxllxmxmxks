package x71;

import a0.s0;
import v71.a2;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class q extends h {
    public final a B;

    public q(int i, a aVar) {
        super(i);
        this.B = aVar;
        if (aVar != a.r) {
            if (i < 1) {
                throw new IllegalArgumentException(s0.i("Buffered channel capacity must be at least 1, but ", i, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + k71.x.a(h.class).c() + " instead").toString());
        }
    }

    @Override // x71.h
    public final boolean A() {
        return this.B == a.s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(Object obj, boolean z) {
        a aVar = this.B;
        a aVar2 = a.t;
        a0 a0Var = a0.a;
        if (aVar == aVar2) {
            Object j = super.j(obj);
            return (!(j instanceof n) || (j instanceof m)) ? j : a0Var;
        }
        Object obj2 = j.d;
        p pVar = (p) h.w.get(this);
        while (true) {
            long andIncrement = h.s.getAndIncrement(this);
            long j2 = 1152921504606846975L & andIncrement;
            boolean x = x(false, andIncrement);
            int i = j.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (pVar.t != j4) {
                p f = h.f(this, j4, pVar);
                if (f != null) {
                    pVar = f;
                } else if (x) {
                    return new m(u());
                }
            }
            int h = h.h(this, pVar, i2, obj, j2, obj2, x);
            if (h == 0) {
                pVar.a();
                return a0Var;
            }
            if (h == 1) {
                break;
            }
            if (h != 2) {
                if (h == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (h == 4) {
                    if (j2 < h.t.get(this)) {
                        pVar.a();
                    }
                    return new m(u());
                }
                if (h == 5) {
                    pVar.a();
                }
            } else {
                if (x) {
                    pVar.i();
                    return new m(u());
                }
                a2 a2Var = obj2 instanceof a2 ? (a2) obj2 : null;
                if (a2Var != null) {
                    a2Var.a(pVar, i2 + i);
                }
                p((pVar.t * j3) + i2);
            }
        }
    }

    @Override // x71.h, x71.w
    public final Object j(Object obj) {
        return M(obj, false);
    }

    @Override // x71.h, x71.w
    public final Object l(a71.c cVar, Object obj) {
        if (M(obj, true) instanceof m) {
            throw u();
        }
        return a0.a;
    }
}
