package gn;

import sy.y;
import z01.r1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public oa.g a;

    public t(oa.g gVar) {
        k71.k.g(gVar, "userService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, j71.c cVar, a71.c cVar2) {
        s sVar;
        int i;
        if (cVar2 instanceof s) {
            sVar = (s) cVar2;
            int i2 = sVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.y = i2 - Integer.MIN_VALUE;
                Object obj = sVar.w;
                b71.a aVar = b71.a.r;
                i = sVar.y;
                if (i != 0) {
                    y.j(obj);
                    r1 r1Var = (r1) this.a.a(jVar);
                    sVar.u = jVar;
                    sVar.v = cVar;
                    sVar.y = 1;
                    obj = r1Var.y(str, sVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = sVar.v;
                    jVar = sVar.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        sVar = new s(this, cVar2);
        Object obj2 = sVar.w;
        b71.a aVar2 = b71.a.r;
        i = sVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
