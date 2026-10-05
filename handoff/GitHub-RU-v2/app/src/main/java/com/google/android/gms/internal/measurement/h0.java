package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* loaded from: /home/user/work/p/classes4.dex */
public class h0 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Looper looper, int i) {
        super(looper);
        switch (i) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                break;
            case 2:
            default:
                Looper.getMainLooper();
                break;
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
        }
    }


}
