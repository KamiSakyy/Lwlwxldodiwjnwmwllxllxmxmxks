package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ k1 r;

    public j1(k1 k1Var) {
        this.r = k1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.r.a(new z0(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.r.a(new i1(this, activity, 4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.r.a(new i1(this, activity, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.r.a(new i1(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        i0 i0Var = new i0();
        this.r.a(new z0(this, activity, i0Var));
        Bundle f = i0Var.f(50L);
        if (f != null) {
            bundle.putAll(f);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.r.a(new i1(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.r.a(new i1(this, activity, 3));
    }
    public Object b() { return null; }
}
