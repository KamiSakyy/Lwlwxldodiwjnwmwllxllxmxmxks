package com.github.rudroid.settings.applock.settings;

import android.content.Intent;
import android.os.Build;
import androidx.compose.foundation.layout.p2;
import com.github.rudroid.settings.applock.settings.AppLockSettingsActivity;
import com.github.rudroid.uitoolkit.utils.z;
import com.github.rudroid.utilities.c0;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class b implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ AppLockSettingsActivity s;

    public /* synthetic */ b(AppLockSettingsActivity appLockSettingsActivity, int i) {
        this.r = i;
        this.s = appLockSettingsActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r6 == androidx.compose.runtime.n.a) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj, Object obj2) {
        Object obj3;
        int i = this.r;
        a0 a0Var = a0.a;
        final AppLockSettingsActivity appLockSettingsActivity = this.s;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                AppLockSettingsActivity.a aVar = AppLockSettingsActivity.Companion;
                if (!sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    sVar.V();
                    break;
                } else {
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(-87588689, new b(appLockSettingsActivity, i3), sVar), sVar, 805306368, 511);
                    break;
                }
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                AppLockSettingsActivity.a aVar2 = AppLockSettingsActivity.Companion;
                if (!sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar2.V();
                    break;
                } else {
                    z.a(c0.a(ih.d.b(sVar2).b, p2.d(w1.o.a, 1.0f)), r1.i.d(-1952551261, new b(appLockSettingsActivity, i2), sVar2), null, null, null, 0, 0L, 0L, r1.i.d(-873969683, new b7.h(29, appLockSettingsActivity, androidx.compose.runtime.t.n(((o) appLockSettingsActivity.u0.getValue()).x, sVar2)), sVar2), sVar2, 100663344, 252);
                    break;
                }
            default:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                AppLockSettingsActivity.a aVar3 = AppLockSettingsActivity.Companion;
                if (!sVar3.S(1 & intValue3, (intValue3 & 3) != 2)) {
                    sVar3.V();
                    break;
                } else {
                    boolean h = sVar3.h(appLockSettingsActivity);
                    Object N = sVar3.N();
                    if (!h) {
                        obj3 = N;
                        break;
                    }
                    final int i4 = r4 ? 1 : 0;
                    j71.a aVar4 = new j71.a() { // from class: com.github.rudroid.settings.applock.settings.c
                        /* JADX WARN: Type inference failed for: r2v0, types: [android.app.Activity, android.content.Context, com.github.rudroid.settings.applock.settings.AppLockSettingsActivity] */
                        public final Object a() {
                            Intent intent;
                            int i5 = i4;
                            a0 a0Var2 = a0.a;
                            AppLockSettingsActivity r2 = appLockSettingsActivity;
                            switch (i5) {
                                case 0:
                                    AppLockSettingsActivity.a aVar5 = AppLockSettingsActivity.Companion;
                                    r2.finish();
                                    break;
                                default:
                                    h.g gVar = r2.v0;
                                    int i6 = Build.VERSION.SDK_INT;
                                    if (i6 >= 30) {
                                        intent = new Intent("android.settings.BIOMETRIC_ENROLL");
                                        intent.putExtra("android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED", 32783);
                                    } else {
                                        intent = i6 >= 28 ? new Intent("android.settings.FINGERPRINT_ENROLL") : new Intent("android.settings.SECURITY_SETTINGS");
                                    }
                                    if (intent.resolveActivity(r2.getPackageManager()) == null) {
                                        gVar.a(new Intent("android.settings.SETTINGS"));
                                        break;
                                    } else {
                                        gVar.a(intent);
                                        break;
                                    }
                            }
                            return a0Var2;
                        }
                    };
                    sVar3.n0(aVar4);
                    obj3 = aVar4;
                    qg.pShadow.b(null, 0L, (j71.a) obj3, 0, 0, 0.0f, 0.0f, null, u.a, sVar3, 100663296, 251);
                    break;
                }
        }
        return a0Var;
    }
}
