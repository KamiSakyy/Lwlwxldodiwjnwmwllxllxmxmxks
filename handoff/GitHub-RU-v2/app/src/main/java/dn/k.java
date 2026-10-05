package dn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public final en.c a;
    public final oa.g b;

    public k(en.c cVar, oa.g gVar) {
        k71.k.g(cVar, "factory");
        k71.k.g(gVar, "service");
        this.a = cVar;
        this.b = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r13 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, boolean z, c71.c cVar) {
        h hVar;
        b71.a aVar;
        int i;
        en.b b;
        int i2;
        Object b2;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i3 = hVar.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.A = i3 - Integer.MIN_VALUE;
                Object obj = hVar.y;
                aVar = b71.a.r;
                i = hVar.A;
                w61.a0 a0Var = w61.a0.a;
                if (i != 0) {
                    sy.y.j(obj);
                    this.a.getClass();
                    b = en.c.b(jVar);
                    if (jVar.e() > -1) {
                        e11.a aVar2 = (e11.a) this.b.a(jVar);
                        hVar.u = jVar;
                        hVar.v = b;
                        hVar.w = z;
                        i2 = 0;
                        hVar.x = 0;
                        hVar.A = 1;
                        obj = aVar2.e();
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                int i4 = hVar.x;
                z = hVar.w;
                b = hVar.v;
                oa.j jVar2 = hVar.u;
                sy.y.j(obj);
                i2 = i4;
                jVar = jVar2;
                y71.y yVar = new y71.y((y71.i) obj, new i(z, b, jVar, null));
                androidx.lifecycle.n nVar = new androidx.lifecycle.n(b, jVar, (a71.c) null, 8);
                hVar.u = null;
                hVar.v = null;
                hVar.w = z;
                hVar.x = i2;
                hVar.A = 2;
                b2 = yVar.b(new y71.k0(j.r, nVar, 2), hVar);
                if (b2 != aVar) {
                    b2 = a0Var;
                }
                return b2 != aVar ? aVar : a0Var;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.y;
        aVar = b71.a.r;
        i = hVar.A;
        w61.a0 a0Var2 = w61.a0.a;
        if (i != 0) {
        }
        y71.y yVar2 = new y71.y((y71.i) obj2, new i(z, b, jVar, null));
        androidx.lifecycle.n nVar2 = new androidx.lifecycle.n(b, jVar, (a71.c) null, 8);
        hVar.u = null;
        hVar.v = null;
        hVar.w = z;
        hVar.x = i2;
        hVar.A = 2;
        b2 = yVar2.b(new y71.k0(j.r, nVar2, 2), hVar);
        if (b2 != aVar) {
        }
        if (b2 != aVar) {
        }
    }
}
