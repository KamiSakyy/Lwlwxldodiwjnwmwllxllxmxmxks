package w81;

import h91.e0;
import h91.h;
import h91.k0;
import h91.m0;
import h91.r;
import java.io.IOException;
import k71.k;
import q81.n;
import q81.o;
import q81.u;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class a implements k0 {
    public o r;
    public r s;
    public boolean t;
    public final /* synthetic */ f u;

    public a(f fVar, o oVar) {
        k.g(oVar, "url");
        this.u = fVar;
        this.r = oVar;
        this.s = new r(((e0) fVar.c.t).r.b());
    }

    @Override // h91.k0
    public long U(h hVar, long j) {
        f fVar = this.u;
        k.g(hVar, "sink");
        try {
            return ((e0) fVar.c.t).U(hVar, j);
        } catch (IOException e) {
            fVar.b.f();
            f(f.f);
            throw e;
        }
    }

    @Override // h91.k0
    public final m0 b() {
        return this.s;
    }

    public final void f(n nVar) {
        u uVar;
        q81.b bVar;
        k.g(nVar, "trailers");
        f fVar = this.u;
        int i = fVar.d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + fVar.d);
        }
        r rVar = this.s;
        m0 m0Var = rVar.e;
        rVar.e = m0.d;
        m0Var.a();
        m0Var.b();
        fVar.d = 6;
        if (nVar.size() <= 0 || (uVar = fVar.a) == null || (bVar = uVar.j) == null) {
            return;
        }
        v81.f.b(bVar, this.r, nVar);
    }
}
