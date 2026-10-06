package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 extends g1 {
    public final /* synthetic */ int v;
    public final /* synthetic */ k1 w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(k1 k1Var, Object obj, int i) {
        super(k1Var, true);
        this.v = i;
        this.x = obj;
        this.w = k1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.v) {
            case 0:
                l0 l0Var = this.w.f;
                c21.uShadow.g(l0Var);
                l0Var.setUserProperty("fcm", "_ln", new j21.b(this.x), true, this.r);
                break;
            case 1:
                l0 l0Var2 = this.w.f;
                c21.uShadow.g(l0Var2);
                l0Var2.setConditionalUserProperty((Bundle) this.x, this.r);
                break;
            case 2:
                l0 l0Var3 = this.w.f;
                c21.uShadow.g(l0Var3);
                l0Var3.retrieveAndUploadBatches(new b1(this, (com.google.common.util.concurrent.b) this.x));
                break;
            case 3:
                l0 l0Var4 = this.w.f;
                c21.uShadow.g(l0Var4);
                l0Var4.logHealthData(5, "Error with data collection. Data lost.", new j21.b((Exception) this.x), new j21.b(null), new j21.b(null));
                break;
            default:
                l0 l0Var5 = this.w.f;
                c21.uShadow.g(l0Var5);
                l0Var5.registerOnMeasurementEventListener((h1) this.x);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(k1 k1Var, Exception exc) {
        super(k1Var, false);
        this.v = 3;
        this.x = exc;
        this.w = k1Var;
    }
}
