package ml;

import com.github.rudroid.repository.b2;
import sy.y;
import z01.k1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public oa.g a;

    public s(oa.g gVar) {
        k71.k.g(gVar, "subscribeServiceFactory");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, ub.a aVar, b2 b2Var, c71.c cVar) {
        r rVar;
        int i;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i2 = rVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.y = i2 - Integer.MIN_VALUE;
                Object obj = rVar.w;
                b71.a aVar2 = b71.a.r;
                i = rVar.y;
                if (i != 0) {
                    y.j(obj);
                    k1 k1Var = (k1) this.a.a(jVar);
                    rVar.u = jVar;
                    rVar.v = b2Var;
                    rVar.y = 1;
                    obj = k1Var.a(str, aVar, rVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b2Var = rVar.v;
                    jVar = rVar.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, b2Var);
            }
        }
        rVar = new r(this, cVar);
        Object obj2 = rVar.w;
        b71.a aVar22 = b71.a.r;
        i = rVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, b2Var);
    }

}
