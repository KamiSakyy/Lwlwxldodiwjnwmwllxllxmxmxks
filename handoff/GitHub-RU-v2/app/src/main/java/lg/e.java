package lg;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e extends j {
    @Override // lg.j
    public final void a(Canvas canvas, Layout layout, int i, int i2, int i3, int i4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        k.g(drawable, "drawableLeft");
        k.g(drawable2, "drawableMid");
        k.g(drawable3, "drawableRight");
        k.g(drawable4, "drawable");
        int paragraphDirection = layout.getParagraphDirection(i);
        int lineLeft = (int) (paragraphDirection == -1 ? layout.getLineLeft(i) - 0 : layout.getLineRight(i) + 0);
        int b = b(layout, i);
        int c = c(layout, i);
        if (i3 > lineLeft) {
            drawable3.setBounds(lineLeft, c, i3, b);
            drawable3.draw(canvas);
        } else {
            drawable.setBounds(i3, c, lineLeft, b);
            drawable.draw(canvas);
        }
        for (int i5 = i + 1; i5 < i2; i5++) {
            drawable2.setBounds((int) layout.getLineLeft(i5), c(layout, i5), (int) layout.getLineRight(i5), b(layout, i5));
            drawable2.draw(canvas);
        }
        int lineRight = (int) (paragraphDirection == -1 ? layout.getLineRight(i) + 0 : layout.getLineLeft(i) - 0);
        int b2 = b(layout, i2);
        int c2 = c(layout, i2);
        if (lineRight > i4) {
            drawable.setBounds(i4, c2, lineRight, b2);
            drawable.draw(canvas);
        } else {
            drawable3.setBounds(lineRight, c2, i4, b2);
            drawable3.draw(canvas);
        }
    }
}
