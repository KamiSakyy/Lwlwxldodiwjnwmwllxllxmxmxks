package a5;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: /home/user/work/p/classes.dex */
public final class b0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: r, reason: collision with root package name */
    public View f366r;

    /* renamed from: s, reason: collision with root package name */
    public ViewTreeObserver f367s;

    /* renamed from: t, reason: collision with root package name */
    public Runnable f368t;

    public b0(View view, Runnable runnable) {
        this.f366r = view;
        this.f367s = view.getViewTreeObserver();
        this.f368t = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        b0 b0Var = new b0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(b0Var);
        view.addOnAttachStateChangeListener(b0Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f367s.isAlive();
        View view = this.f366r;
        if (isAlive) {
            this.f367s.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f368t.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f367s = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f367s.isAlive();
        View view2 = this.f366r;
        if (isAlive) {
            this.f367s.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
