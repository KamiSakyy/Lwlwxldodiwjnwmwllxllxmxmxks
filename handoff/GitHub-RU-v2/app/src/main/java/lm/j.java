package lm;

import sy.y;
import z01.r1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public final oa.g a;

    public j(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, j71.c cVar, c71.c cVar2) {
        i iVar;
        int i;
        if (cVar2 instanceof i) {
            iVar = (i) cVar2;
            int i2 = iVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.y = i2 - Integer.MIN_VALUE;
                Object obj = iVar.w;
                b71.a aVar = b71.a.r;
                i = iVar.y;
                if (i != 0) {
                    y.j(obj);
                    r1 r1Var = (r1) this.a.a(jVar);
                    iVar.u = jVar;
                    iVar.v = cVar;
                    iVar.y = 1;
                    obj = r1Var.A(str, str2, iVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = iVar.v;
                    jVar = iVar.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        iVar = new i(this, cVar2);
        Object obj2 = iVar.w;
        b71.a aVar2 = b71.a.r;
        i = iVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
