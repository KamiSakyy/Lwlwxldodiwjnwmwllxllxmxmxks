package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y0 extends g1 {
    public final /* synthetic */ int v;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ k1 y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(k1 k1Var, String str, String str2, Object obj, int i) {
        super(k1Var, true);
        this.v = i;
        this.w = str;
        this.x = str2;
        this.z = obj;
        this.y = k1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.v) {
            case 0:
                l0 l0Var = this.y.f;
                c21.uShadow.g(l0Var);
                l0Var.clearConditionalUserProperty(this.w, this.x, (Bundle) this.z);
                break;
            case 1:
                l0 l0Var2 = this.y.f;
                c21.uShadow.g(l0Var2);
                l0Var2.getConditionalUserProperties(this.w, this.x, (i0) this.z);
                break;
            default:
                l0 l0Var3 = this.y.f;
                c21.uShadow.g(l0Var3);
                l0Var3.setCurrentScreenByScionActivityInfo((w0) this.z, this.w, this.x, this.r);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public void b() {
        switch (this.v) {
            case 1:
                ((i0) this.z).c(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(k1 k1Var, w0 w0Var, String str, String str2) {
        super(k1Var, true);
        this.v = 2;
        this.z = w0Var;
        this.w = str;
        this.x = str2;
        Objects.requireNonNull(k1Var);
        this.y = k1Var;
    }
}
