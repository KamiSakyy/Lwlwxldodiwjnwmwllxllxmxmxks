package com.github.rudroid.copilot;

/* loaded from: /home/user/work/p/classes.dex */
public final class d2<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9526r;

    public d2(y71.j jVar) {
        this.f9526r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        c2 c2Var;
        int i;
        if (cVar instanceof c2) {
            c2Var = (c2) cVar;
            int i10 = c2Var.f9517v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2Var.f9517v = i10 - Integer.MIN_VALUE;
                Object obj2 = c2Var.f9516u;
                b71.a aVar = b71.a.r;
                i = c2Var.f9517v;
                if (i != 0) {
                    sy.y.j(obj2);
                    xn.b1 b1Var = ((l) obj).f9875d;
                    if (b1Var != null) {
                        c2Var.f9517v = 1;
                        if (this.f9526r.c(b1Var, c2Var) == aVar) {
                            return aVar;
                        }
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
        c2Var = new c2(this, cVar);
        Object obj22 = c2Var.f9516u;
        b71.a aVar2 = b71.a.r;
        i = c2Var.f9517v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
