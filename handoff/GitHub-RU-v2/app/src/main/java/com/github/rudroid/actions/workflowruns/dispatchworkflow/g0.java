package com.github.rudroid.actions.workflowruns.dispatchworkflow;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.w0;
import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class g0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0 f5360r;

    public g0(i0 i0Var) {
        this.f5360r = i0Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        w61.k kVar = (w61.k) obj;
        boolean booleanValue = ((Boolean) kVar.r).booleanValue();
        List list = (List) kVar.s;
        y1 y1Var = this.f5360r.B;
        y yVar = (y) ((g1) y1Var.getValue()).getData();
        w61.a0 a0Var = w61.a0.a;
        if (yVar != null) {
            w0.p(y1Var, y.a(yVar, list, null, false, booleanValue, 6));
        }
        return a0Var;
    }
}
