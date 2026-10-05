package com.github.rudroid.agents.sessionevents;

/* loaded from: /home/user/work/p/classes.dex */
public final class m1<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f7718r;

    public m1(y71.j jVar) {
        this.f7718r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        l1 l1Var;
        int i;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i10 = l1Var.f7712v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                l1Var.f7712v = i10 - Integer.MIN_VALUE;
                Object obj2 = l1Var.f7711u;
                b71.a aVar = b71.a.r;
                i = l1Var.f7712v;
                if (i != 0) {
                    sy.y.j(obj2);
                    b1 b1Var = (b1) ((com.github.rudroid.utilities.ui.g1) obj).getData();
                    String str = b1Var != null ? b1Var.f7500c : null;
                    if (str != null) {
                        l1Var.f7712v = 1;
                        if (this.f7718r.c(str, l1Var) == aVar) {
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
        l1Var = new l1(this, cVar);
        Object obj22 = l1Var.f7711u;
        b71.a aVar2 = b71.a.r;
        i = l1Var.f7712v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
