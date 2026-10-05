package ng;

import android.animation.Animator;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.view.View;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements Animator.AnimatorListener {
    public final /* synthetic */ View a;

    public c(View view) {
        this.a = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setRenderEffect(RenderEffect.createBlurEffect(25.0f, 25.0f, Shader.TileMode.MIRROR));
    }
}
