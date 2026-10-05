package com.github.rudroid.viewmodels.image;

import in.f0;
import java.util.Collection;
import w61.a0;
import x61.m;
import y71.j;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
final class b<T> implements j {
    public final /* synthetic */ a r;

    public b(a aVar) {
        this.r = aVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        f0 f0Var = (f0) obj;
        boolean z = f0Var.c;
        a aVar = this.r;
        if (z) {
            aVar.w.decrementAndGet();
        }
        y1 y1Var = aVar.x;
        y1Var.k((Object) null, m.m0((Collection) y1Var.getValue(), f0Var));
        return a0.a;
    }
}
