package com.github.rudroid.fragments;

/* loaded from: /home/user/work/p/classes.dex */
public final class i2<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f13960r;

    public i2(y71.j jVar) {
        this.f13960r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        h2 h2Var;
        int i;
        if (cVar instanceof h2) {
            h2Var = (h2) cVar;
            int i10 = h2Var.f13930v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h2Var.f13930v = i10 - Integer.MIN_VALUE;
                Object obj2 = h2Var.f13929u;
                b71.a aVar = b71.a.r;
                i = h2Var.f13930v;
                if (i != 0) {
                    sy.y.j(obj2);
                    com.github.rudroid.utilities.ui.n0 n0Var = (com.github.rudroid.utilities.ui.g1) obj;
                    fl.b bVar = n0Var instanceof com.github.rudroid.utilities.ui.n0 ? n0Var.b : null;
                    if (bVar != null) {
                        h2Var.f13930v = 1;
                        if (this.f13960r.c(bVar, h2Var) == aVar) {
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
        h2Var = new h2(this, cVar);
        Object obj22 = h2Var.f13929u;
        b71.a aVar2 = b71.a.r;
        i = h2Var.f13930v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
