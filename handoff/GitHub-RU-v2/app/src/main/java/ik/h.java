package ik;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final oa.g a;
    public final kk.g b;

    public h(oa.g gVar, kk.g gVar2) {
        k71.k.g(gVar, "discussionsService");
        k71.k.g(gVar2, "discussionDataMapper");
        this.a = gVar;
        this.b = gVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, String str3, String str4, com.github.rudroid.discussions.z zVar, c71.c cVar) {
        g gVar;
        int i;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i2 = gVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.y = i2 - Integer.MIN_VALUE;
                Object obj = gVar.w;
                b71.a aVar = b71.a.r;
                i = gVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.n nVar = (z01.n) this.a.a(jVar);
                    gVar.u = jVar;
                    gVar.v = zVar;
                    gVar.y = 1;
                    obj = nVar.n(str, str2, str3, str4);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = gVar.v;
                    jVar = gVar.u;
                    sy.y.j(obj);
                }
                return b31.b.J(new a61.l0((y71.i) obj, this, 9), jVar, zVar);
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.w;
        b71.a aVar2 = b71.a.r;
        i = gVar.y;
        if (i != 0) {
        }
        return b31.b.J(new a61.l0((y71.i) obj2, this, 9), jVar, zVar);
    }
}
