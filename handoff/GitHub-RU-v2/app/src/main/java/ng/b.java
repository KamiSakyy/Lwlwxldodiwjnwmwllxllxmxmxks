package ng;

import android.animation.Animator;
import android.view.View;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements Animator.AnimatorListener {
    public final /* synthetic */ View a;

    public b(View view) {
        this.a = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setRenderEffect(null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
