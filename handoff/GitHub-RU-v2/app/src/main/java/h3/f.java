package h3;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class f {
    public static boolean a(Canvas canvas, float f6, float f10, float f11, float f12) {
        return canvas.quickReject(f6, f10, f11, f12);
    }

    public static boolean b(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean c(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
