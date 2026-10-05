package jj;

import k71.k;
import oa.g;
import oa.j;
import sy.y;
import y71.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final g a;

    public b(g gVar) {
        k.g(gVar, "commitService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, String str, String str2, String str3, com.github.rudroid.commits.j jVar2, c71.c cVar) {
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
                    z01.g gVar = (z01.g) this.a.a(jVar);
                    aVar.u = jVar;
                    aVar.v = jVar2;
                    aVar.y = 1;
                    obj = gVar.f(str, str3, str2);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar2 = aVar.v;
                    jVar = aVar.u;
                    y.j(obj);
                }
                return b31.b.J((i) obj, jVar, jVar2);
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.w;
        b71.a aVar22 = b71.a.r;
        i = aVar.y;
        if (i != 0) {
        }
        return b31.b.J((i) obj2, jVar, jVar2);
    }
}
