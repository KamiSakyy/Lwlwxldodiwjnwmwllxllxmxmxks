package lg;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j {
    public abstract void a(Canvas canvas, Layout layout, int i, int i2, int i3, int i4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4);

    public final int b(Layout layout, int i) {
        int lineBottom = layout.getLineBottom(i);
        boolean z = i == layout.getLineCount() - 1;
        float spacingAdd = layout.getSpacingAdd();
        float spacingMultiplier = layout.getSpacingMultiplier();
        if ((spacingAdd != 0.0f || spacingMultiplier != 1.0f) && !z) {
            if (Float.compare(spacingMultiplier, 1.0f) != 0) {
                float lineTop = layout.getLineTop(i + 1) - layout.getLineTop(i);
                spacingAdd = lineTop - ((lineTop - spacingAdd) / spacingMultiplier);
            }
            lineBottom = (int) (lineBottom - spacingAdd);
        }
        return i == layout.getLineCount() - 1 ? lineBottom - layout.getBottomPadding() : lineBottom;
    }

    public final int c(Layout layout, int i) {
        int lineTop = layout.getLineTop(i);
        return i == 0 ? lineTop - layout.getTopPadding() : lineTop;
    }
}
