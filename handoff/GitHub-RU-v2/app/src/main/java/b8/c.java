package b8;

import android.animation.Animator;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f3791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3792b;

    public c(e eVar, d dVar) {
        this.f3792b = eVar;
        this.f3791a = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        e eVar = this.f3792b;
        d dVar = this.f3791a;
        eVar.a(1.0f, dVar, true);
        dVar.f3802k = dVar.f3797e;
        dVar.l = dVar.f3798f;
        dVar.m = dVar.f3799g;
        dVar.a((dVar.f3801j + 1) % dVar.i.length);
        if (!eVar.f3819w) {
            eVar.f3818v += 1.0f;
            return;
        }
        eVar.f3819w = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (dVar.f3803n) {
            dVar.f3803n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3792b.f3818v = 0.0f;
    }
}
