package f1;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: /home/user/work/p/classes.dex */
public final class c5 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: r, reason: collision with root package name */
    public boolean f22607r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f22608s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j71.a f22609t;

    public c5(View view, j71.a aVar) {
        this.f22608s = view;
        this.f22609t = aVar;
        view.addOnAttachStateChangeListener(this);
        if (this.f22607r || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f22607r = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f22609t.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f22607r) {
            return;
        }
        View view2 = this.f22608s;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f22607r = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f22607r) {
            this.f22608s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f22607r = false;
        }
    }
}
