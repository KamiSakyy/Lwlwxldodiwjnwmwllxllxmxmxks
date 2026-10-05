package com.github.rudroid.searchandfilter;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public s0(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        r0 r0Var;
        int i;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i2 = r0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = r0Var.u;
                b71.a aVar = b71.a.r;
                i = r0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    Boolean bool = Boolean.TRUE;
                    r0Var.v = 1;
                    if (this.r.c(bool, r0Var) == aVar) {
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
        r0Var = new r0(this, cVar);
        Object obj22 = r0Var.u;
        b71.a aVar2 = b71.a.r;
        i = r0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
