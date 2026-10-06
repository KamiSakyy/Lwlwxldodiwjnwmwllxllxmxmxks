package u31;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r extends w {
    public final t c;

    public r(t tVar) {
        this.c = tVar;
    }

    @Override // u31.w
    public final void a(Matrix matrix, t31.a aVar, int i, Canvas canvas) {
        float f;
        t tVar = this.c;
        float f2 = tVar.f;
        float f3 = tVar.g;
        RectF rectF = new RectF(tVar.b, tVar.c, tVar.d, tVar.e);
        Paint paint = aVar.b;
        boolean z = f3 < 0.0f;
        Path path = aVar.g;
        int[] iArr = t31.a.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = aVar.f;
            iArr[2] = aVar.e;
            iArr[3] = aVar.d;
            f = 0.0f;
        } else {
            path.rewind();
            f = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = aVar.d;
            iArr[2] = aVar.e;
            iArr[3] = aVar.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= f) {
            return;
        }
        float f5 = 1.0f - (i / width);
        float[] fArr = t31.a.l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
