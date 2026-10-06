package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e2 {
    public Context a;
    public Boolean b;
    public long c;
    public com.google.android.gms.internal.measurement.u0 d;
    public boolean e;
    public Long f;
    public String g;

    public e2(Context context, com.google.android.gms.internal.measurement.u0 u0Var, Long l) {
        this.e = true;
        c21.u.g(context);
        Context applicationContext = context.getApplicationContext();
        c21.u.g(applicationContext);
        this.a = applicationContext;
        this.f = l;
        if (u0Var != null) {
            this.d = u0Var;
            this.e = u0Var.t;
            this.c = u0Var.s;
            this.g = u0Var.v;
            Bundle bundle = u0Var.u;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
