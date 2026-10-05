package y71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class w implements j {
    public final /* synthetic */ int r;
    public final /* synthetic */ k71.s s;
    public final /* synthetic */ j t;

    public /* synthetic */ w(k71.s sVar, j jVar, int i) {
        this.r = i;
        this.s = sVar;
        this.t = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int i, a71.c cVar) {
        t1 t1Var;
        int i2;
        if (cVar instanceof t1) {
            t1Var = (t1) cVar;
            int i3 = t1Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t1Var.w = i3 - Integer.MIN_VALUE;
                Object obj = t1Var.u;
                b71.a aVar = b71.a.r;
                i2 = t1Var.w;
                w61.a0 a0Var = w61.a0.a;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                if (i > 0) {
                    k71.s sVar = this.s;
                    if (!sVar.r) {
                        sVar.r = true;
                        p1 p1Var = p1.r;
                        t1Var.w = 1;
                        if (this.t.c(p1Var, t1Var) == aVar) {
                            return aVar;
                        }
                    }
                }
                return a0Var;
            }
        }
        t1Var = new t1(this, cVar);
        Object obj2 = t1Var.u;
        b71.a aVar2 = b71.a.r;
        i2 = t1Var.w;
        w61.a0 a0Var2 = w61.a0.a;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    @Override // y71.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        v vVar;
        int i;
        switch (this.r) {
            case 0:
                if (cVar instanceof v) {
                    vVar = (v) cVar;
                    int i2 = vVar.w;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        vVar.w = i2 - Integer.MIN_VALUE;
                        Object obj2 = vVar.u;
                        b71.a aVar = b71.a.r;
                        i = vVar.w;
                        if (i != 0) {
                            sy.y.j(obj2);
                            this.s.r = false;
                            vVar.w = 1;
                            if (this.t.c(obj, vVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj2);
                        }
                        return w61.a0.a;
                    }
                }
                vVar = new v(this, cVar);
                Object obj22 = vVar.u;
                b71.a aVar2 = b71.a.r;
                i = vVar.w;
                if (i != 0) {
                }
                return w61.a0.a;
            default:
                return a(((Number) obj).intValue(), cVar);
        }
    }
}
