package lm;

import sy.y;
import z01.o0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public final oa.g a;

    public d(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, j71.c cVar, c71.c cVar2) {
        c cVar3;
        int i;
        if (cVar2 instanceof c) {
            cVar3 = (c) cVar2;
            int i2 = cVar3.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar3.y = i2 - Integer.MIN_VALUE;
                Object obj = cVar3.w;
                b71.a aVar = b71.a.r;
                i = cVar3.y;
                if (i != 0) {
                    y.j(obj);
                    o0 o0Var = (o0) this.a.a(jVar);
                    cVar3.u = jVar;
                    cVar3.v = cVar;
                    cVar3.y = 1;
                    obj = o0Var.e(str);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = cVar3.v;
                    jVar = cVar3.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        cVar3 = new c(this, cVar2);
        Object obj2 = cVar3.w;
        b71.a aVar2 = b71.a.r;
        i = cVar3.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
