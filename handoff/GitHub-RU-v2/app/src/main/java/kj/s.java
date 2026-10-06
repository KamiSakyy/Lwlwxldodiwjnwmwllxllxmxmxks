package kj;

import z01.p1;

/* loaded from: /home/user/work/p/classes3.dex */
public class s {
    public oa.g a;

    public s(oa.g gVar) {
        k71.k.g(gVar, "userAccountInfoService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, com.github.rudroid.repositories.repositoryownerrepositories.d dVar, c71.c cVar) {
        r rVar;
        int i;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i2 = rVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.y = i2 - Integer.MIN_VALUE;
                Object obj = rVar.w;
                b71.a aVar = b71.a.r;
                i = rVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    p1 p1Var = (p1) this.a.a(jVar);
                    rVar.u = jVar;
                    rVar.v = dVar;
                    rVar.y = 1;
                    obj = p1Var.a();
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = rVar.v;
                    jVar = rVar.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, dVar);
            }
        }
        rVar = new r(this, cVar);
        Object obj2 = rVar.w;
        b71.a aVar2 = b71.a.r;
        i = rVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, dVar);
    }
}
