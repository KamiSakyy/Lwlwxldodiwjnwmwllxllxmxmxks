package t5;

import android.animation.ValueAnimator;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public a f32061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f32062b;

    public b(c cVar) {
        this.f32062b = cVar;
    }

    public final boolean a() {
        boolean unregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f32061a);
        this.f32061a = null;
        return unregisterDurationScaleChangeListener;
    }



}
