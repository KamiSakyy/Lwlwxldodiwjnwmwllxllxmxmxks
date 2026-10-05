package y71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class u implements i {
    public final /* synthetic */ i r;
    public final /* synthetic */ c71.j s;

    public u(j71.e eVar, i iVar) {
        this.r = iVar;
        this.s = (c71.j) eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (r8.s(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // y71.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(j jVar, a71.c cVar) {
        t tVar;
        int i;
        u uVar;
        j jVar2;
        k71.s sVar;
        try {
            if (cVar instanceof t) {
                tVar = (t) cVar;
                int i2 = tVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    tVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = tVar.u;
                    b71.a aVar = b71.a.r;
                    i = tVar.v;
                    if (i != 0) {
                        sy.y.j(obj);
                        k71.s sVar2 = new k71.s();
                        sVar2.r = true;
                        w wVar = new w(sVar2, jVar, 0);
                        tVar.x = this;
                        tVar.y = jVar;
                        tVar.z = sVar2;
                        tVar.v = 1;
                        if (this.r.b(wVar, tVar) != aVar) {
                            uVar = this;
                            jVar2 = jVar;
                            sVar = sVar2;
                        }
                        return aVar;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jVar = (z71.u) tVar.x;
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    sVar = tVar.z;
                    jVar2 = tVar.y;
                    uVar = (u) tVar.x;
                    sy.y.j(obj);
                    if (sVar.r) {
                        a71.h hVar = ((c71.c) tVar).s;
                        k71.k.d(hVar);
                        jVar = new z71.u(jVar2, hVar);
                        c71.j jVar3 = uVar.s;
                        tVar.x = jVar;
                        tVar.y = null;
                        tVar.z = null;
                        tVar.v = 2;
                    }
                    return w61.a0.a;
                }
            }
            if (i != 0) {
            }
            if (sVar.r) {
            }
            return w61.a0.a;
        } finally {
            jVar.w();
        }
        tVar = new t(this, cVar);
        Object obj2 = tVar.u;
        b71.a aVar2 = b71.a.r;
        i = tVar.v;
    }
}
