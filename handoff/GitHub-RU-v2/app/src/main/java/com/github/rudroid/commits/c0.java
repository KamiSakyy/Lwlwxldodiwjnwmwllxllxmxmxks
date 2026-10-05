package com.github.rudroid.commits;

/* loaded from: /home/user/work/p/classes.dex */
public final class c0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9176r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f9177s;

    public c0(y71.j jVar, h hVar) {
        this.f9176r = jVar;
        this.f9177s = hVar;
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
            int i10 = b0Var.f9172v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                b0Var.f9172v = i10 - Integer.MIN_VALUE;
                Object obj2 = b0Var.f9171u;
                b71.a aVar = b71.a.r;
                i = b0Var.f9172v;
                if (i != 0) {
                    sy.y.j(obj2);
                    fl.f A = i21.a.A((fl.f) obj, new i());
                    b0Var.f9172v = 1;
                    if (this.f9176r.c(A, b0Var) == aVar) {
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
        Object obj22 = b0Var.f9171u;
        b71.a aVar2 = b71.a.r;
        i = b0Var.f9172v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class h<T1,T2,T3,T4> {
        public h() {
        }
    }
}
