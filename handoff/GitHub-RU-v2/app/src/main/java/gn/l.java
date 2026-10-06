package gn;

import sy.y;
import z01.r1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public oa.g a;

    public l(oa.g gVar) {
        k71.k.g(gVar, "userService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, j71.c cVar, c71.c cVar2) {
        k kVar;
        int i;
        if (cVar2 instanceof k) {
            kVar = (k) cVar2;
            int i2 = kVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.y = i2 - Integer.MIN_VALUE;
                Object obj = kVar.w;
                b71.a aVar = b71.a.r;
                i = kVar.y;
                if (i != 0) {
                    y.j(obj);
                    r1 r1Var = (r1) this.a.a(jVar);
                    kVar.u = jVar;
                    kVar.v = cVar;
                    kVar.y = 1;
                    obj = r1Var.f(str, str2, kVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = kVar.v;
                    jVar = kVar.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        kVar = new k(this, cVar2);
        Object obj2 = kVar.w;
        b71.a aVar2 = b71.a.r;
        i = kVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
