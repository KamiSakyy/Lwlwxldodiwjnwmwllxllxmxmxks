package dl;

import com.github.rudroid.mergequeue.list.n;
import k71.k;
import oa.j;
import sy.y;
import y71.i;
import z01.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public final oa.g a;

    public f(oa.g gVar) {
        k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, String str, String str2, String str3, String str4, n nVar, c71.c cVar) {
        e eVar;
        int i;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i2 = eVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.y = i2 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.w;
                b71.a aVar = b71.a.r;
                i = eVar2.y;
                if (i != 0) {
                    y.j(obj);
                    g1 g1Var = (g1) this.a.a(jVar);
                    eVar2.u = jVar;
                    eVar2.v = nVar;
                    eVar2.y = 1;
                    obj = g1Var.c(str2, str, str3, str4, eVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = eVar2.v;
                    jVar = eVar2.u;
                    y.j(obj);
                }
                return b31.b.J((i) obj, jVar, nVar);
            }
        }
        eVar = new e(this, cVar);
        e eVar22 = eVar;
        Object obj2 = eVar22.w;
        b71.a aVar2 = b71.a.r;
        i = eVar22.y;
        if (i != 0) {
        }
        return b31.b.J((i) obj2, jVar, nVar);
    }


}
