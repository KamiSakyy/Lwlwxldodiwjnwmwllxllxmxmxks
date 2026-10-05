package com.github.rudroid.checks;

import com.github.rudroid.utilities.ui.g1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class r implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8778r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b0 f8779s;

    public /* synthetic */ r(b0 b0Var, int i) {
        this.f8778r = i;
        this.f8779s = b0Var;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.f8778r) {
            case k5.f.J:
                b0 b0Var = this.f8779s;
                y1 y1Var = b0Var.f8755v;
                b0Var.P(y1Var, bVar, ((g1) y1Var.getValue()).getData() == null);
                break;
            default:
                b0 b0Var2 = this.f8779s;
                y1 y1Var2 = b0Var2.f8755v;
                b0Var2.P(y1Var2, bVar, ((g1) y1Var2.getValue()).getData() == null);
                break;
        }
        return w61.a0.a;
    }
}
