package androidx.lifecycle;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends o0 {
    public b m;

    @Override // androidx.lifecycle.o0, androidx.lifecycle.l0
    public final void g() {
        super.g();
        b bVar = this.m;
        if (bVar != null) {
            v71.q1 q1Var = (v71.q1) bVar.f2828g;
            if (q1Var != null) {
                q1Var.m((CancellationException) null);
            }
            bVar.f2828g = null;
            if (((v71.q1) bVar.f2827f) != null) {
                return;
            }
            bVar.f2827f = v71.b0.z((a81.d) bVar.f2825d, (a71.h) null, (v71.a0) null, new a61.n0(bVar, (a71.c) null, 3), 3);
        }
    }

    @Override // androidx.lifecycle.o0, androidx.lifecycle.l0
    public final void h() {
        super.h();
        b bVar = this.m;
        if (bVar != null) {
            if (((v71.q1) bVar.f2828g) != null) {
                throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
            }
            a81.d dVar = (a81.d) bVar.f2825d;
            c81.e eVar = v71.l0.a;
            bVar.f2828g = v71.b0.z(dVar, a81.n.a.w, (v71.a0) null, new a61.g0(bVar, (a71.c) null, 4), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(c71.c cVar) {
        g gVar;
        int i;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f2862w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f2862w = i10 - Integer.MIN_VALUE;
                Object obj = gVar.f2860u;
                b71.a aVar = b71.a.r;
                i = gVar.f2862w;
                if (i != 0) {
                    sy.y.j(obj);
                    return;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return;
                }
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f2860u;
        b71.a aVar2 = b71.a.r;
        i = gVar.f2862w;
        if (i != 0) {
        }
    }

}
