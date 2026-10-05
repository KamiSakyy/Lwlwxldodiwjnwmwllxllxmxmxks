package ik;

import com.github.rudroid.discussions.q5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public final oa.g a;
    public final kk.g b;

    public u(oa.g gVar, kk.g gVar2) {
        k71.k.g(gVar, "discussionsService");
        k71.k.g(gVar2, "dataMapper");
        this.a = gVar;
        this.b = gVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, q5 q5Var, c71.c cVar) {
        t tVar;
        int i;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i2 = tVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.y = i2 - Integer.MIN_VALUE;
                Object obj = tVar.w;
                b71.a aVar = b71.a.r;
                i = tVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.n nVar = (z01.n) this.a.a(jVar);
                    tVar.u = jVar;
                    tVar.v = q5Var;
                    tVar.y = 1;
                    obj = nVar.t(str);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q5Var = tVar.v;
                    jVar = tVar.u;
                    sy.y.j(obj);
                }
                return b31.b.J(new a61.l0((y71.i) obj, this, 12), jVar, q5Var);
            }
        }
        tVar = new t(this, cVar);
        Object obj2 = tVar.w;
        b71.a aVar2 = b71.a.r;
        i = tVar.y;
        if (i != 0) {
        }
        return b31.b.J(new a61.l0((y71.i) obj2, this, 12), jVar, q5Var);
    }
}
