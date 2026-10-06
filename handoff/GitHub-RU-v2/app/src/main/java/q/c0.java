package q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: /home/user/work/p/classes.dex */
public final class c0 extends SeekBar {

    /* renamed from: r, reason: collision with root package name */
    public final d0 f30556r;

    public c0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969717);
        v2.a(getContext(), this);
        d0 d0Var = new d0(this);
        this.f30556r = d0Var;
        d0Var.b(attributeSet, 2130969717);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d0 d0Var = this.f30556r;
        c0 c0Var = d0Var.f30560e;
        Drawable drawable = d0Var.f30561f;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0Var.getDrawableState())) {
            c0Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f30556r.f30561f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f30556r.g(canvas);
    }
}
