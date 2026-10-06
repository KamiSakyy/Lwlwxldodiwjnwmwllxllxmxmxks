package com.github.rudroid.fragments.onboarding.notifications.usecase;

import android.content.Context;
import android.os.Build;

/* loaded from: /home/user/work/p/classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public Context f14203a;

    public d0(Context context) {
        this.f14203a = context;
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT < 33 || o4.b.a(this.f14203a, "android.permission.POST_NOTIFICATIONS") == 0;
    }
}
