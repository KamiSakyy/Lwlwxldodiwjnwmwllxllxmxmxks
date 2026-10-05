package y71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b2 implements j {
    public final j r;
    public final c71.j s;

    public b2(j71.e eVar, j jVar) {
        this.r = jVar;
        this.s = (c71.j) eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [c71.c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c71.c cVar) {
        a2 a2Var;
        boolean r2;
        z71.u uVar;
        b2 b2Var;
        try {
            if (cVar instanceof a2) {
                a2Var = (a2) cVar;
                int i = a2Var.y;
                if ((i & Integer.MIN_VALUE) != 0) {
                    a2Var.y = i - Integer.MIN_VALUE;
                    Object obj = a2Var.w;
                    b71.a aVar = b71.a.r;
                    r2 = a2Var.y;
                    w61.a0 a0Var = w61.a0.a;
                    if (r2 != 0) {
                        sy.y.j(obj);
                        a71.h hVar = ((c71.c) a2Var).s;
                        k71.k.d(hVar);
                        uVar = new z71.u(this.r, hVar);
                        c71.j jVar = this.s;
                        a2Var.u = this;
                        a2Var.v = uVar;
                        a2Var.y = 1;
                        if (jVar.s(uVar, a2Var) != aVar) {
                            b2Var = this;
                        }
                        return aVar;
                    }
                    if (r2 != 1) {
                        if (r2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    uVar = a2Var.v;
                    b2Var = a2Var.u;
                    sy.y.j(obj);
                    uVar.w();
                    j jVar2 = b2Var.r;
                    r2 = jVar2 instanceof b2;
                    if (r2 != 0) {
                        a2Var.u = null;
                        a2Var.v = null;
                        a2Var.y = 2;
                        if (((b2) jVar2).a(a2Var) == aVar) {
                            return aVar;
                        }
                    }
                    return a0Var;
                }
            }
            if (r2 != 0) {
            }
            uVar.w();
            j jVar22 = b2Var.r;
            r2 = jVar22 instanceof b2;
            if (r2 != 0) {
            }
            return a0Var;
        } catch (Throwable th) {
            r2.w();
            throw th;
        }
        a2Var = new a2(this, cVar);
        Object obj2 = a2Var.w;
        b71.a aVar2 = b71.a.r;
        r2 = a2Var.y;
        w61.a0 a0Var2 = w61.a0.a;
    }

    @Override // y71.j
    public final Object c(Object obj, a71.c cVar) {
        return this.r.c(obj, cVar);
    }
}
