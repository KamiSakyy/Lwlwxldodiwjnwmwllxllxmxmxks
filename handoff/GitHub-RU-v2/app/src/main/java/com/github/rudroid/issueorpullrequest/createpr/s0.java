package com.github.rudroid.issueorpullrequest.createpr;

import com.github.rudroid.utilities.ui.g1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class s0 implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15382r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r0 f15383s;

    public /* synthetic */ s0(r0 r0Var, int i) {
        this.f15382r = i;
        this.f15383s = r0Var;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.f15382r) {
            case k5.f.J:
                r0 r0Var = this.f15383s;
                y1 y1Var = r0Var.B;
                r0Var.P(y1Var, bVar, ((g1) y1Var.getValue()).getData() == null);
                break;
            default:
                r0 r0Var2 = this.f15383s;
                y1 y1Var2 = r0Var2.B;
                r0Var2.P(y1Var2, bVar, ((g1) y1Var2.getValue()).getData() == null);
                break;
        }
        return w61.a0.a;
    }
}
