package zk;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x0 {
    public final oa.g a;

    public x0(oa.g gVar) {
        k71.k.g(gVar, "pullRequestService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, String str3, String str4, j71.c cVar, c71.c cVar2) {
        w0 w0Var;
        int i;
        if (cVar2 instanceof w0) {
            w0Var = (w0) cVar2;
            int i2 = w0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = w0Var.w;
                b71.a aVar = b71.a.r;
                i = w0Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.t0 t0Var = (z01.t0) this.a.a(jVar);
                    w0Var.u = jVar;
                    w0Var.v = cVar;
                    w0Var.y = 1;
                    obj = t0Var.b(str, str3, str4);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = w0Var.v;
                    jVar = w0Var.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        w0Var = new w0(this, cVar2);
        Object obj2 = w0Var.w;
        b71.a aVar2 = b71.a.r;
        i = w0Var.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }

    public x0(Object... a) {
    }
}
