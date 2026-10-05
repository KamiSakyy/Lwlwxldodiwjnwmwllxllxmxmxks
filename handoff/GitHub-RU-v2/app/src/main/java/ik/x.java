package ik;

import com.github.rudroid.discussions.q5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x {
    public final oa.g a;
    public final e51.a b;

    public x(oa.g gVar, e51.a aVar) {
        k71.k.g(gVar, "discussionsService");
        this.a = gVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, q5 q5Var, c71.c cVar) {
        w wVar;
        int i;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i2 = wVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.y = i2 - Integer.MIN_VALUE;
                Object obj = wVar.w;
                b71.a aVar = b71.a.r;
                i = wVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.n nVar = (z01.n) this.a.a(jVar);
                    wVar.u = jVar;
                    wVar.v = q5Var;
                    wVar.y = 1;
                    obj = nVar.k(str, str2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q5Var = wVar.v;
                    jVar = wVar.u;
                    sy.y.j(obj);
                }
                return b31.b.J(new a61.l0((y71.i) obj, this, 13), jVar, q5Var);
            }
        }
        wVar = new w(this, cVar);
        Object obj2 = wVar.w;
        b71.a aVar2 = b71.a.r;
        i = wVar.y;
        if (i != 0) {
        }
        return b31.b.J(new a61.l0((y71.i) obj2, this, 13), jVar, q5Var);
    }
}
