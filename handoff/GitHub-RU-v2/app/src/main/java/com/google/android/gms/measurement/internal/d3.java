package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d3 implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ f3 s;

    public d3(f3 f3Var, int i) {
        this.r = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(f3Var);
                this.s = f3Var;
                break;
            default:
                Objects.requireNonNull(f3Var);
                this.s = f3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                f3 f3Var = this.s;
                f3Var.w = f3Var.B;
                break;
            default:
                this.s.B = null;
                break;
        }
    }
}
