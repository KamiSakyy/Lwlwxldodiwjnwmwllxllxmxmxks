package com.github.rudroid.projects.table;

/* loaded from: /home/user/work/p/classes.dex */
public final class r0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f17936r;

    public r0(y71.j jVar) {
        this.f17936r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        q0 q0Var;
        int i;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i10 = q0Var.f17934v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                q0Var.f17934v = i10 - Integer.MIN_VALUE;
                Object obj2 = q0Var.f17933u;
                b71.a aVar = b71.a.r;
                i = q0Var.f17934v;
                if (i != 0) {
                    sy.y.j(obj2);
                    jl.a aVar2 = (jl.a) ((com.github.rudroid.utilities.ui.g1) obj).getData();
                    String str = aVar2 != null ? aVar2.d.r : null;
                    if (str != null) {
                        q0Var.f17934v = 1;
                        if (this.f17936r.c(str, q0Var) == aVar) {
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
        q0Var = new q0(this, cVar);
        Object obj22 = q0Var.f17933u;
        b71.a aVar3 = b71.a.r;
        i = q0Var.f17934v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
