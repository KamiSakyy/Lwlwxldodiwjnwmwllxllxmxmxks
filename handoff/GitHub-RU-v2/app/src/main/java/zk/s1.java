package zk;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s1 {
    public final oa.g a;
    public final cn.a b;

    public s1(oa.g gVar, cn.a aVar) {
        k71.k.g(gVar, "service");
        k71.k.g(aVar, "timelineStore");
        this.a = gVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, String str3, j71.c cVar, c71.c cVar2) {
        r1 r1Var;
        int i;
        if (cVar2 instanceof r1) {
            r1Var = (r1) cVar2;
            int i2 = r1Var.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r1Var.z = i2 - Integer.MIN_VALUE;
                Object obj = r1Var.x;
                b71.a aVar = b71.a.r;
                i = r1Var.z;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.h0 h0Var = (z01.h0) this.a.a(jVar);
                    r1Var.u = jVar;
                    r1Var.v = str;
                    r1Var.w = cVar;
                    r1Var.z = 1;
                    obj = h0Var.k(str, str2, str3);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = r1Var.w;
                    str = r1Var.v;
                    jVar = r1Var.u;
                    sy.y.j(obj);
                }
                oa.j jVar2 = jVar;
                return b31.b.J(new y71.y((y71.i) obj, new an.i((Object) this, jVar2, str, (a71.c) null, 16), 6), jVar2, cVar);
            }
        }
        r1Var = new r1(this, cVar2);
        Object obj2 = r1Var.x;
        b71.a aVar2 = b71.a.r;
        i = r1Var.z;
        if (i != 0) {
        }
        oa.j jVar22 = jVar;
        return b31.b.J(new y71.y((y71.i) obj2, new an.i((Object) this, jVar22, str, (a71.c) null, 16), 6), jVar22, cVar);
    }
}
