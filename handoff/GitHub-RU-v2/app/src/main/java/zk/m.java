package zk;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public oa.g a;
    public cn.a b;

    public m(oa.g gVar, cn.a aVar) {
        k71.k.g(gVar, "pullRequestServiceFactory");
        k71.k.g(aVar, "timelineStore");
        this.a = gVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, String str3, j71.c cVar, c71.c cVar2) {
        l lVar;
        int i;
        if (cVar2 instanceof l) {
            lVar = (l) cVar2;
            int i2 = lVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.A = i2 - Integer.MIN_VALUE;
                Object obj = lVar.y;
                b71.a aVar = b71.a.r;
                i = lVar.A;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.t0 t0Var = (z01.t0) this.a.a(jVar);
                    lVar.u = jVar;
                    lVar.v = str;
                    lVar.w = str3;
                    lVar.x = cVar;
                    lVar.A = 1;
                    obj = t0Var.d(str, str2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = lVar.x;
                    str3 = lVar.w;
                    str = lVar.v;
                    jVar = lVar.u;
                    sy.y.j(obj);
                }
                oa.j jVar2 = jVar;
                return b31.b.J(new y71.y((y71.i) obj, new an.g(this, jVar2, str, str3, (a71.c) null, 14), 6), jVar2, cVar);
            }
        }
        lVar = new l(this, cVar2);
        Object obj2 = lVar.y;
        b71.a aVar2 = b71.a.r;
        i = lVar.A;
        if (i != 0) {
        }
        oa.j jVar22 = jVar;
        return b31.b.J(new y71.y((y71.i) obj2, new an.g(this, jVar22, str, str3, (a71.c) null, 14), 6), jVar22, cVar);
    }

    public m(Object... a) {
    }
}
