package com.github.rudroid.issueorpullrequest.subissues.addexistingsubissues;

import com.github.rudroid.utilities.ui.g1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class o0 implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15978r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n0 f15979s;

    public /* synthetic */ o0(n0 n0Var, int i) {
        this.f15978r = i;
        this.f15979s = n0Var;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.f15978r) {
            case k5.f.J:
                n0 n0Var = this.f15979s;
                y1 y1Var = n0Var.f15974y;
                n0Var.P(y1Var, bVar, ((g1) y1Var.getValue()).getData() == null);
                break;
            default:
                n0 n0Var2 = this.f15979s;
                y1 y1Var2 = n0Var2.f15974y;
                n0Var2.P(y1Var2, bVar, ((g1) y1Var2.getValue()).getData() == null);
                break;
        }
        return w61.a0.a;
    }
}
