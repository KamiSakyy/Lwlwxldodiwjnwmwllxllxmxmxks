package gn;

import sy.y;
import z01.r1;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public oa.g a;

    public b(oa.g gVar) {
        k71.k.g(gVar, "userService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, j71.c cVar, c71.c cVar2) {
        a aVar;
        int i;
        if (cVar2 instanceof a) {
            aVar = (a) cVar2;
            int i2 = aVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.y = i2 - Integer.MIN_VALUE;
                Object obj = aVar.w;
                b71.a aVar2 = b71.a.r;
                i = aVar.y;
                if (i != 0) {
                    y.j(obj);
                    r1 r1Var = (r1) this.a.a(jVar);
                    aVar.u = jVar;
                    aVar.v = cVar;
                    aVar.y = 1;
                    obj = r1Var.x(str, str2, aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = aVar.v;
                    jVar = aVar.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        aVar = new a(this, cVar2);
        Object obj2 = aVar.w;
        b71.a aVar22 = b71.a.r;
        i = aVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
