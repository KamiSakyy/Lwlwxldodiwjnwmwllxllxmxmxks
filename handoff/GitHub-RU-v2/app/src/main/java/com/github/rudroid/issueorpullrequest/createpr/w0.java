package com.github.rudroid.issueorpullrequest.createpr;

import com.github.rudroid.utilities.ui.g1;
import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class w0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r0 f15400r;

    public w0(r0 r0Var) {
        this.f15400r = r0Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        q0 q0Var;
        List list = (List) obj;
        y1 y1Var = this.f15400r.B;
        int size = list.size();
        w61.a0 a0Var = w61.a0.a;
        if (size <= 1 && !list.isEmpty() && (q0Var = (q0) ((g1) y1Var.getValue()).getData()) != null) {
            com.github.rudroid.utilities.w0.p(y1Var, q0.a(q0Var, ((p01.o) x61.m.U(list)).a, null, null, false, 29));
        }
        return a0Var;
    }
}
