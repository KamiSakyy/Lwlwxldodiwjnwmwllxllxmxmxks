package com.github.rudroid.commit;

/* loaded from: /home/user/work/p/classes.dex */
public final class j0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9100r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c0 f9101s;

    public j0(y71.j jVar, c0 c0Var) {
        this.f9100r = jVar;
        this.f9101s = c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        i0 i0Var;
        int i;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i10 = i0Var.f9096v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i0Var.f9096v = i10 - Integer.MIN_VALUE;
                Object obj2 = i0Var.f9095u;
                b71.a aVar = b71.a.r;
                i = i0Var.f9096v;
                if (i != 0) {
                    sy.y.j(obj2);
                    fl.f A = i21.a.A((fl.f) obj, new d0(this.f9101s));
                    i0Var.f9096v = 1;
                    if (this.f9100r.c(A, i0Var) == aVar) {
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
        i0Var = new i0(this, cVar);
        Object obj22 = i0Var.f9095u;
        b71.a aVar2 = b71.a.r;
        i = i0Var.f9096v;
        if (i != 0) {
        }
        return w61.a0.a;
    }


}
