package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: /home/user/work/p/classes.dex */
public final class f0 extends AnimationSet implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public ViewGroup f2541r;

    /* renamed from: s, reason: collision with root package name */
    public View f2542s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2543t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2544u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2545v;

    public f0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2545v = true;
        this.f2541r = viewGroup;
        this.f2542s = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation) {
        this.f2545v = true;
        if (this.f2543t) {
            return !this.f2544u;
        }
        if (!super.getTransformation(j10, transformation)) {
            this.f2543t = true;
            a5.b0.a(this.f2541r, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.f2543t;
        ViewGroup viewGroup = this.f2541r;
        if (z10 || !this.f2545v) {
            viewGroup.endViewTransition(this.f2542s);
            this.f2544u = true;
        } else {
            this.f2545v = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation, float f6) {
        this.f2545v = true;
        if (this.f2543t) {
            return !this.f2544u;
        }
        if (!super.getTransformation(j10, transformation, f6)) {
            this.f2543t = true;
            a5.b0.a(this.f2541r, this);
        }
        return true;
    }
}
