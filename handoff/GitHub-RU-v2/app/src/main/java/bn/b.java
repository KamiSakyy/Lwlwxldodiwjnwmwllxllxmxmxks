package bn;

import c71.c;
import k71.k;
import oa.g;
import oa.j;
import sy.y;
import y71.i;
import z01.l1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final g a;

    public b(g gVar) {
        k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, String str, String str2, com.github.rudroid.templates.k kVar, c cVar) {
        a aVar;
        int i;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i2 = aVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.y = i2 - Integer.MIN_VALUE;
                Object obj = aVar.w;
                b71.a aVar2 = b71.a.r;
                i = aVar.y;
                if (i != 0) {
                    y.j(obj);
                    l1 l1Var = (l1) this.a.a(jVar);
                    aVar.u = jVar;
                    aVar.v = kVar;
                    aVar.y = 1;
                    obj = l1Var.a(str, str2);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = aVar.v;
                    jVar = aVar.u;
                    y.j(obj);
                }
                return b31.b.J((i) obj, jVar, kVar);
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.w;
        b71.a aVar22 = b71.a.r;
        i = aVar.y;
        if (i != 0) {
        }
        return b31.b.J((i) obj2, jVar, kVar);
    }
}
