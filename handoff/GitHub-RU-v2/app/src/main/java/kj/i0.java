package kj;

import z01.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 {
    public oa.g a;

    public i0(oa.g gVar) {
        k71.k.g(gVar, "repositoryService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, j71.c cVar, c71.c cVar2) {
        h0 h0Var;
        int i;
        if (cVar2 instanceof h0) {
            h0Var = (h0) cVar2;
            int i2 = h0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = h0Var.w;
                b71.a aVar = b71.a.r;
                i = h0Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    g1 g1Var = (g1) this.a.a(jVar);
                    h0Var.u = jVar;
                    h0Var.v = cVar;
                    h0Var.y = 1;
                    obj = g1Var.y(str, h0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = h0Var.v;
                    jVar = h0Var.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        h0Var = new h0(this, cVar2);
        Object obj2 = h0Var.w;
        b71.a aVar2 = b71.a.r;
        i = h0Var.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
