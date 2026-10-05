package ng;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends Visibility {
    public static final C0027a Companion = new C0027a();

    /* renamed from: ng.a$a, reason: collision with other inner class name */
    public static final class C0027a {
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ObjectAnimator ofPropertyValuesHolder;
        k.g(viewGroup, "sceneRoot");
        k.g(view, "view");
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.5f, 1.0f);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.5f, 1.0f);
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f);
        if (Build.VERSION.SDK_INT > 31) {
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, ofFloat, ofFloat2);
            k.d(ofPropertyValuesHolder);
            ofPropertyValuesHolder.addListener(new c(view));
            ofPropertyValuesHolder.addListener(new b(view));
        } else {
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, ofFloat, ofFloat2, ofFloat3);
        }
        ofPropertyValuesHolder.setDuration(200L);
        return ofPropertyValuesHolder;
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        k.g(viewGroup, "sceneRoot");
        k.g(view, "view");
        if (Build.VERSION.SDK_INT >= 31) {
            view.setRenderEffect(RenderEffect.createBlurEffect(25.0f, 25.0f, Shader.TileMode.MIRROR));
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 1.5f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 1.5f));
        ofPropertyValuesHolder.setDuration(200L);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.setStartDelay(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofPropertyValuesHolder, ofFloat);
        return animatorSet;
    }
}
