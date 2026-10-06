package kj;

import z01.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public oa.g a;

    public q(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, v01.d dVar, com.github.rudroid.common.i0 i0Var, j71.c cVar, c71.c cVar2) {
        p pVar;
        int i;
        if (cVar2 instanceof p) {
            pVar = (p) cVar2;
            int i2 = pVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.y = i2 - Integer.MIN_VALUE;
                Object obj = pVar.w;
                b71.a aVar = b71.a.r;
                i = pVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    g1 g1Var = (g1) this.a.a(jVar);
                    pVar.u = jVar;
                    pVar.v = cVar;
                    pVar.y = 1;
                    obj = g1Var.a(str, dVar, i0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = pVar.v;
                    jVar = pVar.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        pVar = new p(this, cVar2);
        Object obj2 = pVar.w;
        b71.a aVar2 = b71.a.r;
        i = pVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
