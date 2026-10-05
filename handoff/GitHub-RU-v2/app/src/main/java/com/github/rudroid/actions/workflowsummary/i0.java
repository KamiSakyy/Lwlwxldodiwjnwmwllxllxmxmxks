package com.github.rudroid.actions.workflowsummary;

/* loaded from: /home/user/work/p/classes.dex */
public final class i0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f5571r;

    public i0(y71.j jVar) {
        this.f5571r = jVar;
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
            int i10 = h0Var.f5564v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h0Var.f5564v = i10 - Integer.MIN_VALUE;
                Object obj2 = h0Var.f5563u;
                b71.a aVar = b71.a.r;
                i = h0Var.f5564v;
                if (i != 0) {
                    sy.y.j(obj2);
                    String str = ((qn.c) obj).b;
                    if (str != null) {
                        h0Var.f5564v = 1;
                        if (this.f5571r.c(str, h0Var) == aVar) {
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
        h0Var = new h0(this, cVar);
        Object obj22 = h0Var.f5563u;
        b71.a aVar2 = b71.a.r;
        i = h0Var.f5564v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
