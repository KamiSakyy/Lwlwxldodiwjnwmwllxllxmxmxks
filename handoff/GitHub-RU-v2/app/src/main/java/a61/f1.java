package a61;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f1 implements Application.ActivityLifecycleCallbacks {
    public static final f1 r = new f1();
    public static boolean s;
    public static w51.r t;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        k71.k.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        k71.k.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k71.k.g(activity, "activity");
        w51.r rVar = t;
        if (rVar != null) {
            rVar.P(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        w61.a0 a0Var;
        k71.k.g(activity, "activity");
        w51.r rVar = t;
        if (rVar != null) {
            rVar.P(1);
            a0Var = w61.a0.a;
        } else {
            a0Var = null;
        }
        if (a0Var == null) {
            s = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        k71.k.g(activity, "activity");
        k71.k.g(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k71.k.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        k71.k.g(activity, "activity");
    }





}
