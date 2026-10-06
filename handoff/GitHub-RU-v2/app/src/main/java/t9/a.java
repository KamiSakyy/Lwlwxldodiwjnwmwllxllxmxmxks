package t9;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.c0;
import androidx.lifecycle.i;
import k71.k;
import v9.g;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements g, i, b {

    /* renamed from: r, reason: collision with root package name */
    public boolean f32159r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView f32160s;

    public a(ImageView imageView) {
        this.f32160s = imageView;
    }

    @Override // androidx.lifecycle.i
    public final void A(c0 c0Var) {
        this.f32159r = false;
        d();
    }

    @Override // androidx.lifecycle.i
    public final void M(c0 c0Var) {
        this.f32159r = true;
        d();
    }

    @Override // t9.b
    public final void a(Drawable drawable) {
        g(drawable);
    }

    @Override // t9.b
    public final void b(Drawable drawable) {
        g(drawable);
    }

    @Override // t9.b
    public final void c(Drawable drawable) {
        g(drawable);
    }

    public final void d() {
        Object drawable = this.f32160s.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f32159r) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    @Override // v9.g
    public final Drawable e() {
        return this.f32160s.getDrawable();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return k.b(this.f32160s, ((a) obj).f32160s);
        }
        return false;
    }

    public final void g(Drawable drawable) {
        ImageView imageView = this.f32160s;
        Object drawable2 = imageView.getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        d();
    }

    public final int hashCode() {
        return this.f32160s.hashCode();
    }
    public Object s = null;
}
