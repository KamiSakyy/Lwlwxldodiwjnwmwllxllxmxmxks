package f0;

import android.content.Context;
import android.widget.EdgeEffect;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class m {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f6, float f10) {
        try {
            return edgeEffect.onPullDistance(f6, f10);
        } catch (Throwable unused) {
            edgeEffect.onPull(f6, f10);
            return 0.0f;
        }
    }
}
