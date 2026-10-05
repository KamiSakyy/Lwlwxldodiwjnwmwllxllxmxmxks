package com.github.rudroid.actions.workflowruns;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import com.github.rudroid.utilities.w0;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class d0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h0 f5329r;

    public d0(h0 h0Var) {
        this.f5329r = h0Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        y1 y1Var = this.f5329r.C;
        if (h1.e((g1) y1Var.getValue())) {
            g1.a aVar = g1.Companion;
            Object data = ((g1) y1Var.getValue()).getData();
            aVar.getClass();
            y1Var.k((Object) null, new com.github.rudroid.utilities.ui.h0(data));
        } else {
            w0.j(y1Var);
        }
        return w61.a0.a;
    }
}
