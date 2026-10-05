package com.github.rudroid.releases;

/* loaded from: /home/user/work/p/classes.dex */
public final class i0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f18903r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k0 f18904s;

    public i0(y71.j jVar, k0 k0Var) {
        this.f18903r = jVar;
        this.f18904s = k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        h0 h0Var;
        int i;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i10 = h0Var.f18901v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h0Var.f18901v = i10 - Integer.MIN_VALUE;
                Object obj2 = h0Var.f18900u;
                b71.a aVar = b71.a.r;
                i = h0Var.f18901v;
                if (i != 0) {
                    sy.y.j(obj2);
                    fl.f A = i21.a.A((fl.f) obj, new a0(this.f18904s));
                    h0Var.f18901v = 1;
                    if (this.f18903r.c(A, h0Var) == aVar) {
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
        h0Var = new h0(this, cVar);
        Object obj22 = h0Var.f18900u;
        b71.a aVar2 = b71.a.r;
        i = h0Var.f18901v;
        if (i != 0) {
        }
        return w61.a0.a;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class k0<T1,T2,T3,T4> {
        public k0() {
        }
    }
}
