package com.github.rudroid.settings.applock.settings;

import android.os.Bundle;
import androidx.fragment.app.f1;
import com.github.rudroid.settings.applock.settings.AppLockSettingsActivity;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements h.b, f1 {
    public final /* synthetic */ AppLockSettingsActivity r;

    public void d(Object obj) {
        AppLockSettingsActivity.a aVar = AppLockSettingsActivity.Companion;
        k71.k.g((h.a) obj, "result");
        this.r.recreate();
    }

    public void e(String str, Bundle bundle) {
        AppLockSettingsActivity.J0(this.r, str, bundle);
    }
}
