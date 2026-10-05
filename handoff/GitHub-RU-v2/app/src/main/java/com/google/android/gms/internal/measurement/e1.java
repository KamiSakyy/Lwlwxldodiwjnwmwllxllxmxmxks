package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e1 extends g1 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int v = 1;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ k1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(k1 k1Var, String str, String str2, Bundle bundle, boolean z) {
        super(k1Var, true);
        this.w = str;
        this.x = str2;
        this.A = bundle;
        this.y = z;
        this.z = k1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.v) {
            case 0:
                l0 l0Var = this.z.f;
                c21.u.g(l0Var);
                l0Var.getUserProperties(this.w, this.x, this.y, (i0) this.A);
                break;
            default:
                long j = this.r;
                l0 l0Var2 = this.z.f;
                c21.u.g(l0Var2);
                l0Var2.logEvent(this.w, this.x, (Bundle) this.A, this.y, true, j);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public void b() {
        switch (this.v) {
            case 0:
                ((i0) this.A).c(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(k1 k1Var, String str, String str2, boolean z, i0 i0Var) {
        super(k1Var, true);
        this.w = str;
        this.x = str2;
        this.y = z;
        this.A = i0Var;
        this.z = k1Var;
    }
}
