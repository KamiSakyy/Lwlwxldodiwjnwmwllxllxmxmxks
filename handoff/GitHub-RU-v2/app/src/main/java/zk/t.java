package zk;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public final oa.g a;

    public t(oa.g gVar) {
        k71.k.g(gVar, "assignableActorsService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, String str3, j71.c cVar, c71.c cVar2) {
        s sVar;
        int i;
        if (cVar2 instanceof s) {
            sVar = (s) cVar2;
            int i2 = sVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.y = i2 - Integer.MIN_VALUE;
                Object obj = sVar.w;
                b71.a aVar = b71.a.r;
                i = sVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.c cVar3 = (z01.c) this.a.a(jVar);
                    sVar.u = jVar;
                    sVar.v = cVar;
                    sVar.y = 1;
                    obj = cVar3.c(str, str2, str3);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = sVar.v;
                    jVar = sVar.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        sVar = new s(this, cVar2);
        Object obj2 = sVar.w;
        b71.a aVar2 = b71.a.r;
        i = sVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }

    public t(Object... a) {
    }
}
