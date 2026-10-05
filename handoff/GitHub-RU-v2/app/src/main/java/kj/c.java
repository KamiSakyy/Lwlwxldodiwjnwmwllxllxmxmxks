package kj;

import yz0.r3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ r3 t;

    public /* synthetic */ c(y71.j jVar, r3 r3Var, int i) {
        this.r = i;
        this.s = jVar;
        this.t = r3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        b bVar;
        int i;
        e0 e0Var;
        int i2;
        switch (this.r) {
            case 0:
                if (cVar instanceof b) {
                    bVar = (b) cVar;
                    int i3 = bVar.v;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        bVar.v = i3 - Integer.MIN_VALUE;
                        Object obj2 = bVar.u;
                        b71.a aVar = b71.a.r;
                        i = bVar.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            bVar.v = 1;
                            if (this.s.c(this.t, bVar) == aVar) {
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
                bVar = new b(this, cVar);
                Object obj22 = bVar.u;
                b71.a aVar2 = b71.a.r;
                i = bVar.v;
                if (i != 0) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof e0) {
                    e0Var = (e0) cVar;
                    int i4 = e0Var.v;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        e0Var.v = i4 - Integer.MIN_VALUE;
                        Object obj3 = e0Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = e0Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            e0Var.v = 1;
                            if (this.s.c(this.t, e0Var) == aVar3) {
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
                e0Var = new e0(this, cVar);
                Object obj32 = e0Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = e0Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
        }
    }
}
