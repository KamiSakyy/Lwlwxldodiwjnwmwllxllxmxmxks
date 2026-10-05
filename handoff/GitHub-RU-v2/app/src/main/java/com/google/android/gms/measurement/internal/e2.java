package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e2 {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final com.google.android.gms.internal.measurement.u0 d;
    public final boolean e;
    public final Long f;
    public final String g;

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
