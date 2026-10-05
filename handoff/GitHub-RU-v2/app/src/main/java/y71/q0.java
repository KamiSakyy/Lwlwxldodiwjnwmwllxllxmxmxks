package y71;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class q0 implements j {
    public final /* synthetic */ int r;
    public final /* synthetic */ j71.e s;
    public final /* synthetic */ k71.w t;

    public /* synthetic */ q0(j71.e eVar, k71.w wVar, int i) {
        this.r = i;
        this.s = eVar;
        this.t = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    @Override // y71.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        p0 p0Var;
        Object obj2;
        int i;
        q0 q0Var;
        t0 t0Var;
        Object obj3;
        int i2;
        q0 q0Var2;
        switch (this.r) {
            case 0:
                if (cVar instanceof p0) {
                    p0Var = (p0) cVar;
                    int i3 = p0Var.w;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        p0Var.w = i3 - Integer.MIN_VALUE;
                        obj2 = p0Var.v;
                        b71.a aVar = b71.a.r;
                        i = p0Var.w;
                        if (i != 0) {
                            sy.y.j(obj2);
                            p0Var.u = this;
                            p0Var.y = obj;
                            p0Var.w = 1;
                            obj2 = this.s.s(obj, p0Var);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            q0Var = this;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = p0Var.y;
                            q0Var = p0Var.u;
                            sy.y.j(obj2);
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return w61.a0.a;
                        }
                        q0Var.t.r = obj;
                        throw new AbortFlowException(q0Var);
                    }
                }
                p0Var = new p0(this, cVar);
                obj2 = p0Var.v;
                b71.a aVar2 = b71.a.r;
                i = p0Var.w;
                if (i != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            default:
                if (cVar instanceof t0) {
                    t0Var = (t0) cVar;
                    int i4 = t0Var.w;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        t0Var.w = i4 - Integer.MIN_VALUE;
                        obj3 = t0Var.v;
                        b71.a aVar3 = b71.a.r;
                        i2 = t0Var.w;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            t0Var.u = this;
                            t0Var.y = obj;
                            t0Var.w = 1;
                            obj3 = this.s.s(obj, t0Var);
                            if (obj3 == aVar3) {
                                return aVar3;
                            }
                            q0Var2 = this;
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = t0Var.y;
                            q0Var2 = t0Var.u;
                            sy.y.j(obj3);
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            return w61.a0.a;
                        }
                        q0Var2.t.r = obj;
                        throw new AbortFlowException(q0Var2);
                    }
                }
                t0Var = new t0(this, cVar);
                obj3 = t0Var.v;
                b71.a aVar32 = b71.a.r;
                i2 = t0Var.w;
                if (i2 != 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
        }
    }
}
