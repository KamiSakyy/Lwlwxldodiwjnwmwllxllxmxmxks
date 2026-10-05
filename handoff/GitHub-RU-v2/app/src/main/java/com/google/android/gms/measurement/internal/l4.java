package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l4 implements s4, u0 {
    public final /* synthetic */ o4 r;

    public /* synthetic */ l4(o4 o4Var) {
        this.r = o4Var;
    }

    @Override // com.google.android.gms.measurement.internal.s4
    public void a(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        o4 o4Var = this.r;
        if (!isEmpty) {
            o4Var.b().I(new a5.q1(this, str, str2, bundle, 9, false));
            return;
        }
        o1 o1Var = o4Var.C;
        if (o1Var != null) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.b(str2, "AppId not known when logging event");
        }
    }

    @Override // com.google.android.gms.measurement.internal.u0
    public /* synthetic */ void b(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.r.A(str, i, th, bArr, map);
    }
}
