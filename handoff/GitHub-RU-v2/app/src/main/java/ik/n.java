package ik;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public oa.g a;
    public kk.c b;

    public n(oa.g gVar, kk.c cVar) {
        k71.k.g(gVar, "discussionsService");
        k71.k.g(cVar, "discussionCategoryDataMapper");
        this.a = gVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, boolean z, String str3, j71.c cVar, c71.c cVar2) {
        m mVar;
        int i;
        if (cVar2 instanceof m) {
            mVar = (m) cVar2;
            int i2 = mVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.y = i2 - Integer.MIN_VALUE;
                Object obj = mVar.w;
                b71.a aVar = b71.a.r;
                i = mVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.n nVar = (z01.n) this.a.a(jVar);
                    mVar.u = jVar;
                    mVar.v = cVar;
                    mVar.y = 1;
                    obj = nVar.D(str, str2, str3, z);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = mVar.v;
                    jVar = mVar.u;
                    sy.y.j(obj);
                }
                return b31.b.J(new a61.l0((y71.i) obj, this, 10), jVar, cVar);
            }
        }
        mVar = new m(this, cVar2);
        Object obj2 = mVar.w;
        b71.a aVar2 = b71.a.r;
        i = mVar.y;
        if (i != 0) {
        }
        return b31.b.J(new a61.l0((y71.i) obj2, this, 10), jVar, cVar);
    }
}
