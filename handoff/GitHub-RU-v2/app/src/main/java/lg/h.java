package lg;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h extends j {
    @Override // lg.j
    public final void a(Canvas canvas, Layout layout, int i, int i2, int i3, int i4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        k.g(drawable, "drawableLeft");
        k.g(drawable2, "drawableMid");
        k.g(drawable3, "drawableRight");
        k.g(drawable4, "drawable");
        drawable4.setBounds(Math.min(i3, i4), c(layout, i), Math.max(i3, i4), b(layout, i));
        drawable4.draw(canvas);
    }
}
