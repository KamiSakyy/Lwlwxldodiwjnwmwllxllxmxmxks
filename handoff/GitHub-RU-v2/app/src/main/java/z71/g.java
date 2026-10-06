package z71;

import rm0.v4;
import v71.b0;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class g extends d {
    public final y71.i u;

    public g(int i, a71.h hVar, x71.a aVar, y71.i iVar) {
        super(hVar, i, aVar);
        this.u = iVar;
    }

    @Override // z71.d, y71.i
    public final Object b(y71.j jVar, a71.c cVar) {
        if (this.s == -3) {
            a71.h q = cVar.q();
            Boolean bool = Boolean.FALSE;
            sw0.b bVar = new sw0.b(23);
            a71.h hVar = this.r;
            a71.h A = !((Boolean) hVar.x0(bVar, bool)).booleanValue() ? q.A(hVar) : b0.n(q, hVar, false);
            if (k71.k.b(A, q)) {
                Object h = h(jVar, cVar);
                if (h == b71.a.r) {
                    return h;
                }
            } else {
                a71.d dVar = a71.d.r;
                if (k71.k.b(A.w0(dVar), q.w0(dVar))) {
                    a71.h q2 = cVar.q();
                    if (!(jVar instanceof x) && !(jVar instanceof t)) {
                        jVar = new c00.f(jVar, q2);
                    }
                    Object c = b.c(A, jVar, a81.b.m(A), new v4(this, (a71.c) null, 26), cVar);
                    if (c == b71.a.r) {
                        return c;
                    }
                }
            }
            return a0.a;
        }
        Object b = super.b(jVar, cVar);
        if (b == b71.a.r) {
            return b;
        }
        return a0.a;
    }

    @Override // z71.d
    public final Object d(x71.t tVar, a71.c cVar) {
        Object h = h(new x(tVar), cVar);
        return h == b71.a.r ? h : a0.a;
    }

    public abstract Object h(y71.j jVar, a71.c cVar);

    @Override // z71.d
    public final String toString() {
        return this.u + " -> " + super.toString();
    }
}
