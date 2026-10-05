package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j {
    public static final a.a a;

    static {
        i iVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            iVar = new i(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            iVar = new i(1);
        }
        a = iVar;
    }
}
