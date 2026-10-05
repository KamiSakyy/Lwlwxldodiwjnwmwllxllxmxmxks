package y00;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import rm0.u7;
import y71.g0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements y71.i {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.i s;

    public /* synthetic */ l(y71.i iVar, int i) {
        this.r = i;
        this.s = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(y71.j jVar, a71.c cVar) {
        g0 g0Var;
        int i;
        AbortFlowException e;
        Object obj;
        switch (this.r) {
            case 0:
                Object b = this.s.b(new xo0.b(jVar, 12), cVar);
                return b == b71.a.r ? b : w61.a0.a;
            case 1:
                Object b2 = this.s.b(new xo0.b(jVar, 13), cVar);
                return b2 == b71.a.r ? b2 : w61.a0.a;
            case 2:
                Object b3 = this.s.b(new xo0.b(jVar, 14), cVar);
                return b3 == b71.a.r ? b3 : w61.a0.a;
            case 3:
                Object b4 = this.s.b(new xo0.b(jVar, 15), cVar);
                return b4 == b71.a.r ? b4 : w61.a0.a;
            case 4:
                Object b5 = this.s.b(new xo0.b(jVar, 16), cVar);
                return b5 == b71.a.r ? b5 : w61.a0.a;
            case 5:
                Object b6 = this.s.b(new xo0.b(jVar, 17), cVar);
                return b6 == b71.a.r ? b6 : w61.a0.a;
            case 6:
                Object b7 = this.s.b(new xo0.b(jVar, 21), cVar);
                return b7 == b71.a.r ? b7 : w61.a0.a;
            case 7:
                Object b8 = this.s.b(new u7(new k71.u(), jVar), cVar);
                return b8 == b71.a.r ? b8 : w61.a0.a;
            case 8:
                if (cVar instanceof g0) {
                    g0Var = (g0) cVar;
                    int i2 = g0Var.v;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        g0Var.v = i2 - Integer.MIN_VALUE;
                        Object obj2 = g0Var.u;
                        b71.a aVar = b71.a.r;
                        i = g0Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            Object obj3 = new Object();
                            k71.u uVar = new k71.u();
                            try {
                                y71.i iVar = this.s;
                                c00.f fVar = new c00.f(uVar, jVar, obj3);
                                g0Var.x = obj3;
                                g0Var.v = 1;
                                if (iVar.b(fVar, g0Var) == aVar) {
                                    return aVar;
                                }
                            } catch (AbortFlowException e2) {
                                e = e2;
                                obj = obj3;
                                if (e.r != obj) {
                                    throw e;
                                }
                                return w61.a0.a;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = g0Var.x;
                            try {
                                sy.y.j(obj2);
                            } catch (AbortFlowException e3) {
                                e = e3;
                                if (e.r != obj) {
                                }
                                return w61.a0.a;
                            }
                        }
                        return w61.a0.a;
                    }
                }
                g0Var = new g0(this, cVar);
                Object obj22 = g0Var.u;
                b71.a aVar2 = b71.a.r;
                i = g0Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 9:
                Object b9 = this.s.b(new xo0.b(jVar, 22), cVar);
                return b9 == b71.a.r ? b9 : w61.a0.a;
            case 10:
                Object b11 = this.s.b(new xo0.b(jVar, 23), cVar);
                return b11 == b71.a.r ? b11 : w61.a0.a;
            case 11:
                Object b12 = this.s.b(new yo0.c(jVar, 1), cVar);
                return b12 == b71.a.r ? b12 : w61.a0.a;
            case 12:
                Object b13 = this.s.b(new yo0.c(jVar, 2), cVar);
                return b13 == b71.a.r ? b13 : w61.a0.a;
            case 13:
                Object b14 = this.s.b(new yo0.c(jVar, 3), cVar);
                return b14 == b71.a.r ? b14 : w61.a0.a;
            case 14:
                Object b15 = this.s.b(new yo0.c(jVar, 4), cVar);
                return b15 == b71.a.r ? b15 : w61.a0.a;
            case 15:
                Object b16 = this.s.b(new yo0.c(jVar, 5), cVar);
                return b16 == b71.a.r ? b16 : w61.a0.a;
            case 16:
                Object b17 = this.s.b(new yo0.c(jVar, 6), cVar);
                return b17 == b71.a.r ? b17 : w61.a0.a;
            case 17:
                Object b18 = this.s.b(new yo0.c(jVar, 7), cVar);
                return b18 == b71.a.r ? b18 : w61.a0.a;
            case 18:
                Object b19 = this.s.b(new yo0.c(jVar, 8), cVar);
                return b19 == b71.a.r ? b19 : w61.a0.a;
            case 19:
                Object b21 = this.s.b(new yo0.c(jVar, 9), cVar);
                return b21 == b71.a.r ? b21 : w61.a0.a;
            case 20:
                Object b22 = this.s.b(new yo0.c(jVar, 10), cVar);
                return b22 == b71.a.r ? b22 : w61.a0.a;
            case 21:
                Object b23 = this.s.b(new yo0.c(jVar, 11), cVar);
                return b23 == b71.a.r ? b23 : w61.a0.a;
            case 22:
                Object b24 = this.s.b(new yo0.c(jVar, 14), cVar);
                return b24 == b71.a.r ? b24 : w61.a0.a;
            case 23:
                Object b25 = this.s.b(new yo0.c(jVar, 15), cVar);
                return b25 == b71.a.r ? b25 : w61.a0.a;
            default:
                Object b26 = this.s.b(new yo0.c(jVar, 17), cVar);
                return b26 == b71.a.r ? b26 : w61.a0.a;
        }
    }
}
