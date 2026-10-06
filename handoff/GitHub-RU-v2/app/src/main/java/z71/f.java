package z71;

import rm0.v4;
import t00.f8;
import v71.b0;
import v71.d1;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f extends d {
    public f8 u;
    public int v;

    public f(f8 f8Var, int i, a71.h hVar, int i2, x71.a aVar) {
        super(hVar, i2, aVar);
        this.u = f8Var;
        this.v = i;
    }

    @Override // z71.d
    public final String c() {
        return "concurrency=" + this.v;
    }

    @Override // z71.d
    public final Object d(x71.t tVar, a71.c cVar) {
        int i = e81.jShadow.a;
        e81.i iVar = new e81.i(this.v, 0);
        x xVar = new x(tVar);
        a71.h hVar = ((c71.c) cVar).s;
        k71.k.d(hVar);
        Object b = this.u.b(new do0.q((d1) hVar.w0(v71.w.s), iVar, tVar, xVar, 13), cVar);
        return b == b71.a.r ? b : a0.a;
    }

    @Override // z71.d
    public final d e(a71.h hVar, int i, x71.a aVar) {
        return new f(this.u, this.v, hVar, i, aVar);
    }

    @Override // z71.d
    public final x71.v g(v71.z zVar) {
        j71.e v4Var = new v4(this, (a71.c) null, 25);
        x71.a aVar = x71.a.r;
        v71.a0Shadow a0Var = v71.a0Shadow.r;
        x71.s sVar = new x71.s(b0.A(zVar, this.r), t.e.a(this.s, 4, aVar));
        sVar.q0(a0Var, sVar, v4Var);
        return sVar;
    }
}
