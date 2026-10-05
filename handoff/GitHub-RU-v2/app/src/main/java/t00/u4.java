package t00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u4 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ l01.p0 t;

    public /* synthetic */ u4(y71.j jVar, l01.p0 p0Var, int i) {
        this.r = i;
        this.s = jVar;
        this.t = p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        t4 t4Var;
        int i;
        x4 x4Var;
        int i2;
        wy0.e4 e4Var;
        int i3;
        wy0.h4 h4Var;
        int i4;
        switch (this.r) {
            case 0:
                if (cVar instanceof t4) {
                    t4Var = (t4) cVar;
                    int i5 = t4Var.v;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        t4Var.v = i5 - Integer.MIN_VALUE;
                        Object obj2 = t4Var.u;
                        b71.a aVar = b71.a.r;
                        i = t4Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            t4Var.v = 1;
                            if (this.s.c(this.t, t4Var) == aVar) {
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
                t4Var = new t4(this, cVar);
                Object obj22 = t4Var.u;
                b71.a aVar2 = b71.a.r;
                i = t4Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof x4) {
                    x4Var = (x4) cVar;
                    int i6 = x4Var.v;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        x4Var.v = i6 - Integer.MIN_VALUE;
                        Object obj3 = x4Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = x4Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            x4Var.v = 1;
                            if (this.s.c(this.t, x4Var) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                        }
                        return w61.a0.a;
                    }
                }
                x4Var = new x4(this, cVar);
                Object obj32 = x4Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = x4Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof wy0.e4) {
                    e4Var = (wy0.e4) cVar;
                    int i7 = e4Var.v;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        e4Var.v = i7 - Integer.MIN_VALUE;
                        Object obj4 = e4Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = e4Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            e4Var.v = 1;
                            if (this.s.c(this.t, e4Var) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                        }
                        return w61.a0.a;
                    }
                }
                e4Var = new wy0.e4(this, cVar);
                Object obj42 = e4Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = e4Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof wy0.h4) {
                    h4Var = (wy0.h4) cVar;
                    int i8 = h4Var.v;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        h4Var.v = i8 - Integer.MIN_VALUE;
                        Object obj5 = h4Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = h4Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            h4Var.v = 1;
                            if (this.s.c(this.t, h4Var) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                h4Var = new wy0.h4(this, cVar);
                Object obj52 = h4Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = h4Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
        }
    }
}
