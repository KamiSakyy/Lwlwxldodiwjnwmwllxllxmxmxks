package dn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public final oa.g a;
    public final u b;

    public s(oa.g gVar, u uVar) {
        k71.k.g(gVar, "service");
        k71.k.g(uVar, "handleInvalidSigningKeyUseCase");
        this.a = gVar;
        this.b = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, com.github.rudroid.pushnotifications.v vVar, c71.c cVar) {
        r rVar;
        int i;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i2 = rVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.y = i2 - Integer.MIN_VALUE;
                Object obj = rVar.w;
                b71.a aVar = b71.a.r;
                i = rVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    e11.a aVar2 = (e11.a) this.a.a(jVar);
                    rVar.u = jVar;
                    rVar.v = vVar;
                    rVar.y = 1;
                    obj = aVar2.f();
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = rVar.v;
                    jVar = rVar.u;
                    sy.y.j(obj);
                }
                return b31.b.J(new c00.g((y71.i) obj, this, jVar, 4), jVar, vVar);
            }
        }
        rVar = new r(this, cVar);
        Object obj2 = rVar.w;
        b71.a aVar3 = b71.a.r;
        i = rVar.y;
        if (i != 0) {
        }
        return b31.b.J(new c00.g((y71.i) obj2, this, jVar, 4), jVar, vVar);
    }
    public Object j(Object p1, Object p2, Object p3) { return null; }
}
