package com.github.rudroid.deploymentreview;

/* loaded from: /home/user/work/p/classes.dex */
public final class c0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f10844r;

    public c0(y71.j jVar) {
        this.f10844r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        b0 b0Var;
        int i;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i10 = b0Var.f10839v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                b0Var.f10839v = i10 - Integer.MIN_VALUE;
                Object obj2 = b0Var.f10838u;
                b71.a aVar = b71.a.r;
                i = b0Var.f10839v;
                if (i != 0) {
                    sy.y.j(obj2);
                    String str = ((a01.d) obj).e;
                    b0Var.f10839v = 1;
                    if (this.f10844r.c(str, b0Var) == aVar) {
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
        b0Var = new b0(this, cVar);
        Object obj22 = b0Var.f10838u;
        b71.a aVar2 = b71.a.r;
        i = b0Var.f10839v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
