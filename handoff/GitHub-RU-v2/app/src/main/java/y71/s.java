package y71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class s implements i {
    public final /* synthetic */ i r;
    public final /* synthetic */ c71.j s;

    public s(i iVar, j71.f fVar) {
        this.r = iVar;
        this.s = (c71.j) fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // y71.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(j jVar, a71.c cVar) {
        r rVar;
        b71.a aVar;
        int i;
        s sVar;
        e2 e2Var;
        c71.j jVar2;
        z71.u uVar;
        Throwable th;
        z71.u uVar2;
        c71.j jVar3;
        try {
            if (cVar instanceof r) {
                rVar = (r) cVar;
                int i2 = rVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = rVar.u;
                    aVar = b71.a.r;
                    i = rVar.v;
                    if (i != 0) {
                        sy.y.j(obj);
                        try {
                            i iVar = this.r;
                            rVar.x = this;
                            rVar.y = jVar;
                            rVar.v = 1;
                            if (iVar.b(jVar, rVar) != aVar) {
                                sVar = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sVar = this;
                            e2Var = new e2(th);
                            jVar2 = sVar.s;
                            rVar.x = th;
                            rVar.y = null;
                            rVar.v = 2;
                            if (n1.e(e2Var, jVar2, th, rVar) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                        return aVar;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            Throwable th3 = (Throwable) rVar.x;
                            sy.y.j(obj);
                            throw th3;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uVar2 = (z71.u) rVar.x;
                        try {
                            sy.y.j(obj);
                            uVar2.w();
                            return w61.a0.a;
                        } catch (Throwable th4) {
                            th = th4;
                            uVar2.w();
                            throw th;
                        }
                    }
                    jVar = rVar.y;
                    sVar = (s) rVar.x;
                    try {
                        sy.y.j(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        e2Var = new e2(th);
                        jVar2 = sVar.s;
                        rVar.x = th;
                        rVar.y = null;
                        rVar.v = 2;
                        if (n1.e(e2Var, jVar2, th, rVar) != aVar) {
                        }
                    }
                    a71.h hVar = ((c71.c) rVar).s;
                    k71.k.d(hVar);
                    uVar = new z71.u(jVar, hVar);
                    jVar3 = sVar.s;
                    rVar.x = uVar;
                    rVar.y = null;
                    rVar.v = 3;
                    if (jVar3.f(uVar, (Object) null, rVar) != aVar) {
                        uVar2 = uVar;
                        uVar2.w();
                        return w61.a0.a;
                    }
                    return aVar;
                }
            }
            jVar3 = sVar.s;
            rVar.x = uVar;
            rVar.y = null;
            rVar.v = 3;
            if (jVar3.f(uVar, (Object) null, rVar) != aVar) {
            }
            return aVar;
        } catch (Throwable th6) {
            th = th6;
            uVar2 = uVar;
            uVar2.w();
            throw th;
        }
        rVar = new r(this, cVar);
        Object obj2 = rVar.u;
        aVar = b71.a.r;
        i = rVar.v;
        if (i != 0) {
        }
        a71.h hVar2 = ((c71.c) rVar).s;
        k71.k.d(hVar2);
        uVar = new z71.u(jVar, hVar2);
    }
}
