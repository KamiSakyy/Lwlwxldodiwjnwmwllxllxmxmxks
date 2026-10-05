package com.github.rudroid.actions.workflowruns;

import com.github.rudroid.utilities.w0;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class a0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h0 f5319r;

    public a0(h0 h0Var) {
        this.f5319r = h0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final Object c(Object obj, a71.c cVar) {
        w61.k kVar = (w61.k) obj;
        mn.w wVar = (mn.w) kVar.r;
        boolean booleanValue = ((Boolean) kVar.s).booleanValue();
        h0 h0Var = this.f5319r;
        h0Var.E = booleanValue;
        y1 y1Var = h0Var.C;
        if (wVar.d.isEmpty()) {
            w0.l(y1Var, wVar);
        } else {
            w0.p(y1Var, wVar);
        }
        return w61.a0.a;
    }
}
