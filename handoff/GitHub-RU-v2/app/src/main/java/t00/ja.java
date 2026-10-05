package t00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ja implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ yz0.y7 t;

    public /* synthetic */ ja(y71.j jVar, yz0.y7 y7Var, int i) {
        this.r = i;
        this.s = jVar;
        this.t = y7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        ia iaVar;
        int i;
        wy0.h9 h9Var;
        int i2;
        switch (this.r) {
            case 0:
                if (cVar instanceof ia) {
                    iaVar = (ia) cVar;
                    int i3 = iaVar.v;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        iaVar.v = i3 - Integer.MIN_VALUE;
                        Object obj2 = iaVar.u;
                        b71.a aVar = b71.a.r;
                        i = iaVar.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            iaVar.v = 1;
                            if (this.s.c(this.t, iaVar) == aVar) {
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
                iaVar = new ia(this, cVar);
                Object obj22 = iaVar.u;
                b71.a aVar2 = b71.a.r;
                i = iaVar.v;
                if (i != 0) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof wy0.h9) {
                    h9Var = (wy0.h9) cVar;
                    int i4 = h9Var.v;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        h9Var.v = i4 - Integer.MIN_VALUE;
                        Object obj3 = h9Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = h9Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            h9Var.v = 1;
                            if (this.s.c(this.t, h9Var) == aVar3) {
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
                h9Var = new wy0.h9(this, cVar);
                Object obj32 = h9Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = h9Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
        }
    }
}
