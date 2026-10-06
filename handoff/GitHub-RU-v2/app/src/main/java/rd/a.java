package rd;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements t9.b, Drawable.Callback {

    /* renamed from: r, reason: collision with root package name */
    public WeakReference f31358r;

    /* renamed from: s, reason: collision with root package name */
    public WeakReference f31359s;

    public a(TextView textView, LevelListDrawable levelListDrawable) {
        this.f31358r = new WeakReference(textView);
        this.f31359s = new WeakReference(levelListDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t9.b
    public final void a(Drawable drawable) {
        k.g(drawable, "result");
        WeakReference weakReference = this.f31359s;
        LevelListDrawable levelListDrawable = (LevelListDrawable) weakReference.get();
        Drawable current = levelListDrawable != null ? levelListDrawable.getCurrent() : null;
        Animatable animatable = current instanceof Animatable ? (Animatable) current : null;
        if (animatable != null) {
            animatable.stop();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        LevelListDrawable levelListDrawable2 = (LevelListDrawable) weakReference.get();
        if (levelListDrawable2 != null) {
            levelListDrawable2.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            levelListDrawable2.addLevel(1, 1, drawable);
            levelListDrawable2.setLevel(1);
            levelListDrawable2.setCallback(this);
        }
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
        TextView textView = (TextView) this.f31358r.get();
        if (textView != null) {
            textView.setText(textView.getText());
            textView.invalidate();
        }
    }

    @Override // t9.b
    public final void b(Drawable drawable) {
        this.f31358r.clear();
        this.f31359s.clear();
    }

    @Override // t9.b
    public final void c(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        k.g(drawable, "who");
        TextView textView = (TextView) this.f31358r.get();
        if (textView != null) {
            textView.setText(textView.getText());
            textView.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        k.g(drawable, "who");
        k.g(runnable, "what");
        TextView textView = (TextView) this.f31358r.get();
        if (textView != null) {
            textView.postDelayed(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        k.g(drawable, "who");
        k.g(runnable, "what");
        TextView textView = (TextView) this.f31358r.get();
        if (textView != null) {
            textView.removeCallbacks(runnable);
        }
    }
}
