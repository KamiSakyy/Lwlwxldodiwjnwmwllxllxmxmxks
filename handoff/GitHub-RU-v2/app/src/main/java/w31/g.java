package w31;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public WeakReference r;
    public WeakReference s;

    public g(l lVar, View view) {
        this.r = new WeakReference(lVar);
        this.s = new WeakReference(view);
    }

    public final void a() {
        WeakReference weakReference = this.s;
        if (weakReference.get() != null) {
            ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
            View view = (View) weakReference.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
        weakReference.clear();
        this.r.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WeakReference weakReference = this.r;
        if (weakReference.get() == null) {
            a();
            return;
        }
        i iVar = (i) weakReference.get();
        p6.a aVar = i.x;
        iVar.getClass();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.r.get() == null) {
            a();
        } else if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.r.get() == null) {
            a();
        } else if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public g(Object... a) {
    }
}
