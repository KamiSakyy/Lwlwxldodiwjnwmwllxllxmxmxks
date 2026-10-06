package v91;

import b21.v;
import c21.h0;
import h0.q1;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i extends u91.b {
    public final q1 e;
    public final v f;
    public h0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t91.d dVar, q1 q1Var) {
        super(dVar, new v(q1Var));
        k.g(dVar, "myConstraints");
        this.e = q1Var;
        this.f = new v(q1Var);
        this.g = j91.a.w;
    }

    @Override // u91.b
    public final boolean b() {
        return false;
    }

    @Override // u91.b
    public final int c(s91.c cVar) {
        return cVar.d();
    }

    @Override // u91.b
    public final u91.a d(s91.c cVar, t91.d dVar) {
        h0 h0Var = j91.a.x;
        k.g(dVar, "currentConstraints");
        if (cVar.b != -1) {
            return u91.a.e;
        }
        Integer a = cVar.a();
        if (a == null) {
            return new u91.a(2, 2, 1);
        }
        s91.c f = cVar.f(a.intValue());
        if (f != null && ((CharSequence) f.e.s).charAt(f.c) == '-') {
            this.g = h0Var;
        }
        int i = f != null ? f.c : cVar.c;
        h0 h0Var2 = k.b(this.g, h0Var) ? j91.a.Y : j91.a.X;
        this.f.j(j91.a.Z);
        this.e.a(d0.n(new x91.e(new q71.g(i, cVar.d(), 1), h0Var2)));
        int d = cVar.d();
        u91.a aVar = u91.a.f;
        k.g(aVar, "result");
        this.c = d;
        this.d = aVar;
        return u91.a.e;
    }

    @Override // u91.b
    public final h0 e() {
        return this.g;
    }

    @Override // u91.b
    public final boolean f(s91.c cVar) {
        return cVar.b == -1;
    }
}
