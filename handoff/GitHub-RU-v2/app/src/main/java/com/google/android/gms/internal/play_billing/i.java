package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i extends a.a {
    public final /* synthetic */ int a;

    public final long F() {
        switch (this.a) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
