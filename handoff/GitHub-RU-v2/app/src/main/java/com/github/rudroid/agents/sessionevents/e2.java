package com.github.rudroid.agents.sessionevents;

/* loaded from: /home/user/work/p/classes.dex */
public final class e2<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f7572r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f1 f7573s;

    public e2(y71.j jVar, f1 f1Var) {
        this.f7572r = jVar;
        this.f7573s = f1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        d2 d2Var;
        int i;
        if (cVar instanceof d2) {
            d2Var = (d2) cVar;
            int i10 = d2Var.f7564v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d2Var.f7564v = i10 - Integer.MIN_VALUE;
                Object obj2 = d2Var.f7563u;
                b71.a aVar = b71.a.r;
                i = d2Var.f7564v;
                if (i != 0) {
                    sy.y.j(obj2);
                    if (k71.k.b(((qn.c) obj).a.optString("task_id"), this.f7573s.U)) {
                        d2Var.f7564v = 1;
                        if (this.f7572r.c(obj, d2Var) == aVar) {
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
        d2Var = new d2(this, cVar);
        Object obj22 = d2Var.f7563u;
        b71.a aVar2 = b71.a.r;
        i = d2Var.f7564v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
