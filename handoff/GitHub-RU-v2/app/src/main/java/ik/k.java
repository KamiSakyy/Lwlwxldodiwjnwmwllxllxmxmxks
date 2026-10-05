package ik;

import com.github.rudroid.discussions.m2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public final oa.g a;

    public k(oa.g gVar) {
        k71.k.g(gVar, "discussionsService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, m2 m2Var, c71.c cVar) {
        j jVar2;
        int i;
        if (cVar instanceof j) {
            jVar2 = (j) cVar;
            int i2 = jVar2.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar2.y = i2 - Integer.MIN_VALUE;
                Object obj = jVar2.w;
                b71.a aVar = b71.a.r;
                i = jVar2.y;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.n nVar = (z01.n) this.a.a(jVar);
                    jVar2.u = jVar;
                    jVar2.v = m2Var;
                    jVar2.y = 1;
                    obj = nVar.A(str);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m2Var = jVar2.v;
                    jVar = jVar2.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, m2Var);
            }
        }
        jVar2 = new j(this, cVar);
        Object obj2 = jVar2.w;
        b71.a aVar2 = b71.a.r;
        i = jVar2.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, m2Var);
    }
}
