package com.github.rudroid.settings.applock;

import android.content.Intent;
import android.os.Build;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class x implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ x(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object a() {
        Intent intent;
        switch (this.r) {
            case 0:
                v71.b0.i((x71.t) this.s, (CancellationException) null);
                break;
            case 1:
                v71.b0.i((x71.t) this.s, (CancellationException) null);
                break;
            default:
                AppLockFragment appLockFragment = (AppLockFragment) this.s;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    intent = new Intent("android.settings.BIOMETRIC_ENROLL");
                    intent.putExtra("android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED", 32783);
                } else {
                    intent = i >= 28 ? new Intent("android.settings.FINGERPRINT_ENROLL") : new Intent("android.settings.SECURITY_SETTINGS");
                }
                appLockFragment.G0.a(intent);
                break;
        }
        return w61.a0.a;
    }
}
