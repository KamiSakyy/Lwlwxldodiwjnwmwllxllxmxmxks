package kl;

import com.github.rudroid.releases.w0;
import k71.k;
import oa.g;
import oa.j;
import sy.y;
import y71.i;
import z01.b1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final g a;

    public e(g gVar) {
        k.g(gVar, "releaseService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, String str, String str2, String str3, w0 w0Var, c71.c cVar) {
        d dVar;
        int i;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i2 = dVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.y = i2 - Integer.MIN_VALUE;
                Object obj = dVar.w;
                b71.a aVar = b71.a.r;
                i = dVar.y;
                if (i != 0) {
                    y.j(obj);
                    b1 b1Var = (b1) this.a.a(jVar);
                    dVar.u = jVar;
                    dVar.v = w0Var;
                    dVar.y = 1;
                    obj = b1Var.b(str, str2, str3);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w0Var = dVar.v;
                    jVar = dVar.u;
                    y.j(obj);
                }
                return b31.b.J((i) obj, jVar, w0Var);
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.w;
        b71.a aVar2 = b71.a.r;
        i = dVar.y;
        if (i != 0) {
        }
        return b31.b.J((i) obj2, jVar, w0Var);
    }



}
