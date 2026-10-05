package h3;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class g {
    public static void a(Canvas canvas, int[] iArr, int i, float[] fArr, int i10, int i11, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i10, i11, font, paint);
    }

    public static void b(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void c(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
