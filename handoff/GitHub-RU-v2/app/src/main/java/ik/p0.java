package ik;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 {
    public final oa.g a;
    public final kk.h b;

    public p0(oa.g gVar, kk.h hVar) {
        k71.k.g(gVar, "discussionsService");
        k71.k.g(hVar, "discussionDetailDataMapper");
        this.a = gVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, j71.c cVar, c71.c cVar2) {
        o0 o0Var;
        int i;
        if (cVar2 instanceof o0) {
            o0Var = (o0) cVar2;
            int i2 = o0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = o0Var.w;
                b71.a aVar = b71.a.r;
                i = o0Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.n nVar = (z01.n) this.a.a(jVar);
                    o0Var.u = jVar;
                    o0Var.v = cVar;
                    o0Var.y = 1;
                    obj = nVar.i(str, str2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = o0Var.v;
                    jVar = o0Var.u;
                    sy.y.j(obj);
                }
                return b31.b.J(new a61.l0((y71.i) obj, this, 17), jVar, cVar);
            }
        }
        o0Var = new o0(this, cVar2);
        Object obj2 = o0Var.w;
        b71.a aVar2 = b71.a.r;
        i = o0Var.y;
        if (i != 0) {
        }
        return b31.b.J(new a61.l0((y71.i) obj2, this, 17), jVar, cVar);
    }
}
