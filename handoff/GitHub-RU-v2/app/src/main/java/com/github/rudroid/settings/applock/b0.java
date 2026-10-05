package com.github.rudroid.settings.applock;

/* loaded from: /home/user/work/p/classes3.dex */
class b0 implements g.b {
    public final /* synthetic */ AppLockActivity a;

    public b0(AppLockActivity appLockActivity) {
        this.a = appLockActivity;
    }

    public final void a(d.j jVar) {
        AppLockActivity appLockActivity = this.a;
        if (appLockActivity.V) {
            return;
        }
        appLockActivity.V = true;
        ((b) appLockActivity.w()).getClass();
    }
}
