package com.github.rudroid.actions.workflowsummary.ui;

import androidx.compose.runtime.f1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class k implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5665r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f1 f5666s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j71.c f5667t;

    public /* synthetic */ k(f1 f1Var, j71.c cVar, int i) {
        this.f5665r = i;
        this.f5666s = f1Var;
        this.f5667t = cVar;
    }

    public final Object a() {
        switch (this.f5665r) {
            case k5.f.J /* 0 */:
                Boolean bool = (Boolean) this.f5666s.getValue();
                bool.booleanValue();
                this.f5667t.k(bool);
                break;
            case 1:
                f1 f1Var = this.f5666s;
                f1Var.setValue("");
                this.f5667t.k(f1Var.getValue());
                break;
            case 2:
                f1 f1Var2 = this.f5666s;
                f1Var2.setValue("");
                this.f5667t.k(f1Var2.getValue());
                break;
            case 3:
                f1 f1Var3 = this.f5666s;
                f1Var3.setValue("");
                this.f5667t.k(f1Var3.getValue());
                break;
            case 4:
                this.f5667t.k(this.f5666s.getValue());
                break;
            case 5:
                Boolean bool2 = (Boolean) this.f5666s.getValue();
                bool2.booleanValue();
                this.f5667t.k(bool2);
                break;
            default:
                this.f5667t.k(this.f5666s.getValue());
                break;
        }
        return w61.a0.a;
    }

    public /* synthetic */ k(j71.c cVar, f1 f1Var, int i) {
        this.f5665r = i;
        this.f5667t = cVar;
        this.f5666s = f1Var;
    }
}
