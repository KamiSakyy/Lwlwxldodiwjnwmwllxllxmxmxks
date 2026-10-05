package b8;

import android.animation.ValueAnimator;

/* loaded from: /home/user/work/p/classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f3789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3790b;

    public b(e eVar, d dVar) {
        this.f3790b = eVar;
        this.f3789a = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d dVar = this.f3789a;
        e.d(floatValue, dVar);
        e eVar = this.f3790b;
        eVar.a(floatValue, dVar, false);
        eVar.invalidateSelf();
    }
}
