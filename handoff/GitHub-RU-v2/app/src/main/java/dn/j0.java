package dn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 {
    public final oa.g a;

    public j0(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, int i, com.github.rudroid.twofactor.i iVar, c71.c cVar) {
        i0 i0Var;
        int i2;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i3 = i0Var.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i0Var.y = i3 - Integer.MIN_VALUE;
                Object obj = i0Var.w;
                b71.a aVar = b71.a.r;
                i2 = i0Var.y;
                if (i2 != 0) {
                    sy.y.j(obj);
                    e11.a aVar2 = (e11.a) this.a.a(jVar);
                    i0Var.u = jVar;
                    i0Var.v = iVar;
                    i0Var.y = 1;
                    obj = aVar2.g(i);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = i0Var.v;
                    jVar = i0Var.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, iVar);
            }
        }
        i0Var = new i0(this, cVar);
        Object obj2 = i0Var.w;
        b71.a aVar3 = b71.a.r;
        i2 = i0Var.y;
        if (i2 != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, iVar);
    }
}
