package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 {
    public String a;
    public long b;
    public boolean c;
    public long d;
    public final /* synthetic */ c1 e;

    public a1(c1 c1Var, String str, long j) {
        Objects.requireNonNull(c1Var);
        this.e = c1Var;
        c21.uShadow.d(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.D().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.D().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
