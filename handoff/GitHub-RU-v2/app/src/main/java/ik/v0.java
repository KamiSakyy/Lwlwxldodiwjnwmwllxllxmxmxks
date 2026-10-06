package ik;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 {
    public final oa.g a;

    public v0(oa.g gVar) {
        k71.k.g(gVar, "discussionsService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, com.github.rudroid.discussions.z zVar, c71.c cVar) {
        u0 u0Var;
        int i;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i2 = u0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = u0Var.w;
                b71.a aVar = b71.a.r;
                i = u0Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.n nVar = (z01.n) this.a.a(jVar);
                    u0Var.u = jVar;
                    u0Var.v = zVar;
                    u0Var.y = 1;
                    obj = nVar.C(str, str2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = u0Var.v;
                    jVar = u0Var.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, zVar);
            }
        }
        u0Var = new u0(this, cVar);
        Object obj2 = u0Var.w;
        b71.a aVar2 = b71.a.r;
        i = u0Var.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, zVar);
    }
}
