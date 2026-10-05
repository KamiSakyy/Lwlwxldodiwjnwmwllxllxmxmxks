package com.github.rudroid.copilot.inapppurchase.usecases;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class y<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9828r;

    public y(y71.j jVar) {
        this.f9828r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        x xVar;
        int i;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i10 = xVar.f9823v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f9823v = i10 - Integer.MIN_VALUE;
                Object obj2 = xVar.f9822u;
                b71.a aVar = b71.a.r;
                i = xVar.f9823v;
                if (i != 0) {
                    sy.y.j(obj2);
                    List list = ((x9.n) obj).f34026b;
                    if (list != null) {
                        xVar.f9823v = 1;
                        if (this.f9828r.c(list, xVar) == aVar) {
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
        xVar = new x(this, cVar);
        Object obj22 = xVar.f9822u;
        b71.a aVar2 = b71.a.r;
        i = xVar.f9823v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
