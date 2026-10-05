package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: /home/user/work/p/classes.dex */
public class z0 extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f2955s = 0;

    /* renamed from: r, reason: collision with root package name */
    public s1 f2956r;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final y0 Companion = new y0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            y0.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            k71.k.g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            k71.k.g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            k71.k.g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            k71.k.g(activity, "activity");
            int i = z0.f2955s;
            x0.a(activity, v.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            k71.k.g(activity, "activity");
            int i = z0.f2955s;
            x0.a(activity, v.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            k71.k.g(activity, "activity");
            int i = z0.f2955s;
            x0.a(activity, v.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            k71.k.g(activity, "activity");
            int i = z0.f2955s;
            x0.a(activity, v.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            k71.k.g(activity, "activity");
            int i = z0.f2955s;
            x0.a(activity, v.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            k71.k.g(activity, "activity");
            int i = z0.f2955s;
            x0.a(activity, v.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            k71.k.g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            k71.k.g(activity, "activity");
            k71.k.g(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            k71.k.g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            k71.k.g(activity, "activity");
        }
    }

    public final void a(v vVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            k71.k.f(activity, "getActivity(...)");
            x0.a(activity, vVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(v.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(v.ON_DESTROY);
        this.f2956r = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(v.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        s1 s1Var = this.f2956r;
        if (s1Var != null) {
            ((u0) s1Var.f2923a).a();
        }
        a(v.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        s1 s1Var = this.f2956r;
        if (s1Var != null) {
            u0 u0Var = (u0) s1Var.f2923a;
            int i = u0Var.f2927r + 1;
            u0Var.f2927r = i;
            if (i == 1 && u0Var.f2930u) {
                u0Var.f2932w.C(v.ON_START);
                u0Var.f2930u = false;
            }
        }
        a(v.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(v.ON_STOP);
    }

}
