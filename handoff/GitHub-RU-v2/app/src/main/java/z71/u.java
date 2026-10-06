package z71;

import v71.b0;
import w61.a0;
import wy0.n6;

/* loaded from: /home/user/work/p/classes5.dex */
public final class u extends c71.c implements y71.j {
    public y71.j u;
    public a71.h v;
    public int w;
    public a71.h x;
    public a71.c y;

    public u(y71.j jVar, a71.h hVar) {
        super(s.r, a71.i.r);
        this.u = jVar;
        this.v = hVar;
        this.w = ((Number) hVar.x0(new n6(17), 0)).intValue();
    }

    @Override // y71.j
    public final Object c(Object obj, a71.c cVar) {
        try {
            Object z = z(cVar, obj);
            return z == b71.a.r ? z : a0.a;
        } catch (Throwable th) {
            this.x = new q(cVar.q(), th);
            throw th;
        }
    }

    public final c71.d g() {
        c71.d dVar = this.y;
        if (dVar instanceof c71.d) {
            return dVar;
        }
        return null;
    }

    public final a71.h q() {
        a71.h hVar = this.x;
        return hVar == null ? a71.i.r : hVar;
    }

    public final StackTraceElement u() {
        return null;
    }

    public final Object v(Object obj) {
        Throwable a = w61.n.a(obj);
        if (a != null) {
            this.x = new q(q(), a);
        }
        a71.c cVar = this.y;
        if (cVar != null) {
            cVar.i(obj);
        }
        return b71.a.r;
    }

    public final Object z(a71.c cVar, Object obj) {
        a71.h q = cVar.q();
        b0.m(q);
        a71.h hVar = this.x;
        if (hVar != q) {
            if (hVar instanceof q) {
                throw new IllegalStateException(t71.q.r("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((q) hVar).s + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) q.x0(new pc.j(17, this), 0)).intValue() != this.w) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.v + ",\n\t\tbut emission happened in " + q + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.x = q;
        }
        this.y = cVar;
        j71.f fVar = w.a;
        y71.j jVar = this.u;
        k71.k.e(jVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object f = fVar.f(jVar, obj, this);
        if (!k71.k.b(f, b71.a.r)) {
            this.y = null;
        }
        return f;
    }
}
