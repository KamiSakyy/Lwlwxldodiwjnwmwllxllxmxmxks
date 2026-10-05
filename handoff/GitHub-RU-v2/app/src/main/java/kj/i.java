package kj;

import z01.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public final oa.g a;

    public i(oa.g gVar) {
        k71.k.g(gVar, "repositoryService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, j71.c cVar, c71.c cVar2) {
        h hVar;
        int i;
        if (cVar2 instanceof h) {
            hVar = (h) cVar2;
            int i2 = hVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.y = i2 - Integer.MIN_VALUE;
                Object obj = hVar.w;
                b71.a aVar = b71.a.r;
                i = hVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    g1 g1Var = (g1) this.a.a(jVar);
                    hVar.u = jVar;
                    hVar.v = cVar;
                    hVar.y = 1;
                    obj = g1Var.x(str, hVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = hVar.v;
                    jVar = hVar.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        hVar = new h(this, cVar2);
        Object obj2 = hVar.w;
        b71.a aVar2 = b71.a.r;
        i = hVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
