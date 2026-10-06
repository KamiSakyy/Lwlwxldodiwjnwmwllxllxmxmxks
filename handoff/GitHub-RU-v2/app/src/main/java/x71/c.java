package x71;

import com.google.android.gms.internal.measurement.b4;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sy.y;
import v71.a2;
import v71.b0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c implements a2 {
    public Object r = j.p;
    public v71.l s;
    public final /* synthetic */ hShadow t;

    public c(hShadow hVar) {
        this.t = hVar;
    }

    @Override // v71.a2
    public final void a(a81.r rVar, int i) {
        v71.l lVar = this.s;
        if (lVar != null) {
            lVar.a(rVar, i);
        }
    }

    public final Object b(c71.c cVar) {
        p pVar;
        Object obj = this.r;
        boolean z = true;
        if (obj == j.p || obj == j.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.x;
            hShadow hVar = this.t;
            p pVar2 = (p) atomicReferenceFieldUpdater.get(hVar);
            while (true) {
                if (hVar.y()) {
                    this.r = j.l;
                    Throwable s = hVar.s();
                    if (s != null) {
                        int i = a81.s.a;
                        throw s;
                    }
                    z = false;
                } else {
                    long andIncrement = h.t.getAndIncrement(hVar);
                    long j = jShadow.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (pVar2.t != j2) {
                        pVar = hVar.r(j2, pVar2);
                        if (pVar == null) {
                            continue;
                        }
                    } else {
                        pVar = pVar2;
                    }
                    Object J = hVar.J(pVar, i2, andIncrement, null);
                    a81.t tVar = j.m;
                    if (J == tVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    a81.t tVar2 = j.o;
                    if (J == tVar2) {
                        if (andIncrement < hVar.v()) {
                            pVar.a();
                        }
                        pVar2 = pVar;
                    } else {
                        if (J == j.n) {
                            hShadow hVar2 = this.t;
                            v71.l s2 = b0.s(b4.T(cVar));
                            try {
                                this.s = s2;
                                Object J2 = hVar2.J(pVar, i2, andIncrement, this);
                                if (J2 == tVar) {
                                    a(pVar, i2);
                                } else {
                                    if (J2 == tVar2) {
                                        if (andIncrement < hVar2.v()) {
                                            pVar.a();
                                        }
                                        p pVar3 = (p) h.x.get(hVar2);
                                        while (true) {
                                            if (hVar2.y()) {
                                                v71.l lVar = this.s;
                                                k71.k.d(lVar);
                                                this.s = null;
                                                this.r = j.l;
                                                Throwable s3 = hVar.s();
                                                if (s3 == null) {
                                                    lVar.i(Boolean.FALSE);
                                                } else {
                                                    lVar.i(y.d(s3));
                                                }
                                            } else {
                                                long andIncrement2 = h.t.getAndIncrement(hVar2);
                                                long j3 = jShadow.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (pVar3.t != j4) {
                                                    p r = hVar2.r(j4, pVar3);
                                                    if (r != null) {
                                                        pVar3 = r;
                                                    }
                                                }
                                                Object J3 = hVar2.J(pVar3, i3, andIncrement2, this);
                                                if (J3 == j.m) {
                                                    a(pVar3, i3);
                                                    break;
                                                }
                                                if (J3 == j.o) {
                                                    if (andIncrement2 < hVar2.v()) {
                                                        pVar3.a();
                                                    }
                                                } else {
                                                    if (J3 == j.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    pVar3.a();
                                                    this.r = J3;
                                                    this.s = null;
                                                }
                                            }
                                        }
                                    } else {
                                        pVar.a();
                                        this.r = J2;
                                        this.s = null;
                                    }
                                    s2.h(Boolean.TRUE, null);
                                }
                                Object s4 = s2.s();
                                b71.a aVar = b71.a.r;
                                return s4;
                            } catch (Throwable th) {
                                s2.D();
                                throw th;
                            }
                        }
                        pVar.a();
                        this.r = J;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.r;
        a81.t tVar = j.p;
        if (obj == tVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.r = tVar;
        if (obj != j.l) {
            return obj;
        }
        Throwable t = this.t.t();
        int i = a81.s.a;
        throw t;
    }
}
