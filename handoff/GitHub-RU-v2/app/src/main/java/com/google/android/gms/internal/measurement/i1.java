package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i1 extends g1 {
    public final /* synthetic */ int v;
    public final /* synthetic */ Activity w;
    public final /* synthetic */ j1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, Activity activity, int i) {
        super(j1Var.r, true);
        this.v = i;
        switch (i) {
            case 1:
                this.w = activity;
                this.x = j1Var;
                super(j1Var.r, true);
                break;
            case 2:
                this.w = activity;
                this.x = j1Var;
                super(j1Var.r, true);
                break;
            case 3:
                this.w = activity;
                this.x = j1Var;
                super(j1Var.r, true);
                break;
            case 4:
                this.w = activity;
                this.x = j1Var;
                super(j1Var.r, true);
                break;
            default:
                this.w = activity;
                this.x = j1Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.v) {
            case 0:
                l0 l0Var = this.x.r.f;
                c21.uShadow.g(l0Var);
                l0Var.onActivityStartedByScionActivityInfo(w0.j(this.w), this.s);
                break;
            case 1:
                l0 l0Var2 = this.x.r.f;
                c21.uShadow.g(l0Var2);
                l0Var2.onActivityResumedByScionActivityInfo(w0.j(this.w), this.s);
                break;
            case 2:
                l0 l0Var3 = this.x.r.f;
                c21.uShadow.g(l0Var3);
                l0Var3.onActivityPausedByScionActivityInfo(w0.j(this.w), this.s);
                break;
            case 3:
                l0 l0Var4 = this.x.r.f;
                c21.uShadow.g(l0Var4);
                l0Var4.onActivityStoppedByScionActivityInfo(w0.j(this.w), this.s);
                break;
            default:
                l0 l0Var5 = this.x.r.f;
                c21.uShadow.g(l0Var5);
                l0Var5.onActivityDestroyedByScionActivityInfo(w0.j(this.w), this.s);
                break;
        }
    }
}
