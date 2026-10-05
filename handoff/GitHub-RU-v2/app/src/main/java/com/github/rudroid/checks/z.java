package com.github.rudroid.checks;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;

/* loaded from: /home/user/work/p/classes.dex */
public final class z<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f8791r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b0 f8792s;

    public z(y71.j jVar, b0 b0Var) {
        this.f8791r = jVar;
        this.f8792s = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        y yVar;
        int i;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i10 = yVar.f8789v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.f8789v = i10 - Integer.MIN_VALUE;
                Object obj2 = yVar.f8788u;
                b71.a aVar = b71.a.r;
                i = yVar.f8789v;
                if (i != 0) {
                    sy.y.j(obj2);
                    g1 h10 = h1.h((g1) obj, new q(this.f8792s));
                    yVar.f8789v = 1;
                    if (this.f8791r.c(h10, yVar) == aVar) {
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
        yVar = new y(this, cVar);
        Object obj22 = yVar.f8788u;
        b71.a aVar2 = b71.a.r;
        i = yVar.f8789v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
