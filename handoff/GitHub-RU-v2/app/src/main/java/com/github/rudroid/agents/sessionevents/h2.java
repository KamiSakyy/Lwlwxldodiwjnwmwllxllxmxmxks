package com.github.rudroid.agents.sessionevents;

/* loaded from: /home/user/work/p/classes.dex */
public final class h2<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f7636r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f1 f7637s;

    public h2(y71.j jVar, f1 f1Var) {
        this.f7636r = jVar;
        this.f7637s = f1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        g2 g2Var;
        int i;
        if (cVar instanceof g2) {
            g2Var = (g2) cVar;
            int i10 = g2Var.f7630v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g2Var.f7630v = i10 - Integer.MIN_VALUE;
                Object obj2 = g2Var.f7629u;
                b71.a aVar = b71.a.r;
                i = g2Var.f7630v;
                if (i != 0) {
                    sy.y.j(obj2);
                    if (k71.k.b(((qn.c) obj).a.optString("task_id"), this.f7637s.U)) {
                        g2Var.f7630v = 1;
                        if (this.f7636r.c(obj, g2Var) == aVar) {
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
        g2Var = new g2(this, cVar);
        Object obj22 = g2Var.f7629u;
        b71.a aVar2 = b71.a.r;
        i = g2Var.f7630v;
        if (i != 0) {
        }
        return w61.a0.a;
    }





}
