package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: /home/user/work/p/classes.dex */
public final class t0 extends l {
    final /* synthetic */ u0 this$0;

    public static final class a extends l {
        final /* synthetic */ u0 this$0;

        public a(u0 u0Var) {
            this.this$0 = u0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            k71.k.g(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            k71.k.g(activity, "activity");
            u0 u0Var = this.this$0;
            int i = u0Var.f2927r + 1;
            u0Var.f2927r = i;
            if (i == 1 && u0Var.f2930u) {
                u0Var.f2932w.C(v.ON_START);
                u0Var.f2930u = false;
            }
        }
    }

    public t0(u0 u0Var) {
        this.this$0 = u0Var;
    }

    @Override // androidx.lifecycle.l, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        k71.k.g(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = z0.f2955s;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            k71.k.e(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((z0) findFragmentByTag).f2956r = this.this$0.f2934y;
        }
    }

    @Override // androidx.lifecycle.l, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        k71.k.g(activity, "activity");
        u0 u0Var = this.this$0;
        int i = u0Var.f2928s - 1;
        u0Var.f2928s = i;
        if (i == 0) {
            Handler handler = u0Var.f2931v;
            k71.k.d(handler);
            handler.postDelayed(u0Var.f2933x, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        k71.k.g(activity, "activity");
        s0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.l, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        k71.k.g(activity, "activity");
        u0 u0Var = this.this$0;
        int i = u0Var.f2927r - 1;
        u0Var.f2927r = i;
        if (i == 0 && u0Var.f2929t) {
            u0Var.f2932w.C(v.ON_STOP);
            u0Var.f2930u = true;
        }
    }


}
