package lm;

import com.github.rudroid.organizations.n;
import sy.y;
import z01.o0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public oa.g a;

    public h(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, n nVar, c71.c cVar) {
        g gVar;
        int i;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i2 = gVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.y = i2 - Integer.MIN_VALUE;
                Object obj = gVar.w;
                b71.a aVar = b71.a.r;
                i = gVar.y;
                if (i != 0) {
                    y.j(obj);
                    o0 o0Var = (o0) this.a.a(jVar);
                    gVar.u = jVar;
                    gVar.v = nVar;
                    gVar.y = 1;
                    obj = o0Var.f(str, str2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = gVar.v;
                    jVar = gVar.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, nVar);
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.w;
        b71.a aVar2 = b71.a.r;
        i = gVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, nVar);
    }

}
