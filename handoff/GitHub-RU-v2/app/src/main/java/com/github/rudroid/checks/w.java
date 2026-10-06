package com.github.rudroid.checks;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.w0;
import java.util.ArrayList;
import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class w<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b0 f8785r;

    public w(b0 b0Var) {
        this.f8785r = b0Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        h01.d dVar = (h01.d) obj;
        ArrayList arrayList = dVar.a;
        x01.i iVar = dVar.b;
        b0 b0Var = this.f8785r;
        b0Var.f8757x = iVar;
        y1 y1Var = b0Var.f8755v;
        x61.rShadow rVar = (List) ((g1) y1Var.getValue()).getData();
        if (rVar == null) {
            rVar = x61.rShadow.r;
        }
        w0.p(y1Var, x61.m.l0(rVar, arrayList));
        return w61.a0.a;
    }
}
