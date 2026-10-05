package ml;

import com.github.rudroid.repository.n2;
import sy.y;
import z01.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final oa.g a;

    public g(oa.g gVar) {
        k71.k.g(gVar, "repositoryService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, String str3, n2 n2Var, c71.c cVar) {
        f fVar;
        int i;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i2 = fVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.y = i2 - Integer.MIN_VALUE;
                Object obj = fVar.w;
                b71.a aVar = b71.a.r;
                i = fVar.y;
                if (i != 0) {
                    y.j(obj);
                    g1 g1Var = (g1) this.a.a(jVar);
                    fVar.u = jVar;
                    fVar.v = n2Var;
                    fVar.y = 1;
                    obj = g1Var.s(str, str2, str3);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n2Var = fVar.v;
                    jVar = fVar.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, n2Var);
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.w;
        b71.a aVar2 = b71.a.r;
        i = fVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, n2Var);
    }

}
