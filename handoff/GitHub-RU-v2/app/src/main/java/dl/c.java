package dl;

import com.github.rudroid.mergequeue.list.n;
import k71.k;
import oa.j;
import sy.y;
import y71.i;
import z01.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final oa.g a;

    public c(oa.g gVar) {
        k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, String str, String str2, String str3, n nVar, c71.c cVar) {
        b bVar;
        int i;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i2 = bVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.y = i2 - Integer.MIN_VALUE;
                Object obj = bVar.w;
                b71.a aVar = b71.a.r;
                i = bVar.y;
                if (i != 0) {
                    y.j(obj);
                    g1 g1Var = (g1) this.a.a(jVar);
                    bVar.u = jVar;
                    bVar.v = nVar;
                    bVar.y = 1;
                    obj = g1Var.m(str2, str, str3);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = bVar.v;
                    jVar = bVar.u;
                    y.j(obj);
                }
                return b31.b.J((i) obj, jVar, nVar);
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.w;
        b71.a aVar2 = b71.a.r;
        i = bVar.y;
        if (i != 0) {
        }
        return b31.b.J((i) obj2, jVar, nVar);
    }


}
