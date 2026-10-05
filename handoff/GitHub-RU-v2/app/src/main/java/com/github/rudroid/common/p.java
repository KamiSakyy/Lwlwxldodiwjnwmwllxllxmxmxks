package com.github.rudroid.common;

/* loaded from: /home/user/work/p/classes.dex */
public final class p<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9369r;

    public p(y71.j jVar) {
        this.f9369r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        o oVar;
        int i;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.f9367v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f9367v = i10 - Integer.MIN_VALUE;
                Object obj2 = oVar.f9366u;
                b71.a aVar = b71.a.r;
                i = oVar.f9367v;
                if (i != 0) {
                    sy.y.j(obj2);
                    n0 n0Var = new n0(obj);
                    oVar.f9367v = 1;
                    if (this.f9369r.c(n0Var, oVar) == aVar) {
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
        oVar = new o(this, cVar);
        Object obj22 = oVar.f9366u;
        b71.a aVar2 = b71.a.r;
        i = oVar.f9367v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
