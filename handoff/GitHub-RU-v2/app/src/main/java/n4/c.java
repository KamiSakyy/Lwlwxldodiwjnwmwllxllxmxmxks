package n4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: r, reason: collision with root package name */
    public Object f29423r;

    /* renamed from: s, reason: collision with root package name */
    public Activity f29424s;

    /* renamed from: t, reason: collision with root package name */
    public final int f29425t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f29426u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f29427v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f29428w = false;

    public c(Activity activity) {
        this.f29424s = activity;
        this.f29425t = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f29424s == activity) {
            this.f29424s = null;
            this.f29427v = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f29427v || this.f29428w || this.f29426u) {
            return;
        }
        Object obj = this.f29423r;
        try {
            Object obj2 = d.f29432c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f29425t) {
                d.f29436g.postAtFrontOfQueue(new com.google.common.util.concurrent.b(22, d.f29431b.get(activity), obj2));
                this.f29428w = true;
                this.f29423r = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f29424s == activity) {
            this.f29426u = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c<T1,T2,T3,T4> {
        public c() {
        }
    }
}
