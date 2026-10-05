package h3;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class e {
    public static void a(Canvas canvas) {
        canvas.disableZ();
    }

    public static void b(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    public static void c(Canvas canvas, long j10) {
        canvas.drawColor(j10);
    }

    public static void d(Canvas canvas, long j10, BlendMode blendMode) {
        canvas.drawColor(j10, blendMode);
    }

    public static void e(Canvas canvas, RectF rectF, float f6, float f10, RectF rectF2, float f11, float f12, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f6, f10, rectF2, f11, f12, paint);
    }

    public static void f(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void g(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void h(Canvas canvas, MeasuredText measuredText, int i, int i10, int i11, int i12, float f6, float f10, boolean z10, Paint paint) {
        canvas.drawTextRun(measuredText, i, i10, i11, i12, f6, f10, z10, paint);
    }

    public static void i(Canvas canvas) {
        canvas.enableZ();
    }

    public static final void j(Paint paint, CharSequence charSequence, int i, int i10, Rect rect) {
        paint.getTextBounds(charSequence, i, i10, rect);
    }
}
