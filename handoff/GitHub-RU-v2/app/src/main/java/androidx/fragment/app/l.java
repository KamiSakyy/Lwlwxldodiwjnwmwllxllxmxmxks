package androidx.fragment.app;

import android.animation.AnimatorSet;

/* loaded from: /home/user/work/p/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f2595a = new l();

    public final void a(AnimatorSet animatorSet) {
        k71.k.g(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j10) {
        k71.k.g(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j10);
    }
}
