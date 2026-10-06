package m31;

import android.content.Context;
import android.graphics.Color;
import com.google.android.gms.internal.measurement.b4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public boolean a;
    public int b;
    public int c;
    public int d;
    public float e;

    public a(Context context) {
        boolean d0 = b4.d0(2130969061, context, false);
        int m = a.a.m(2130969060, 0, context);
        int m2 = a.a.m(2130969059, 0, context);
        int m3 = a.a.m(2130968896, 0, context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = d0;
        this.b = m;
        this.c = m2;
        this.d = m3;
        this.e = f2;
    }

    public final int a(int i, float f2) {
        int i2;
        if (!this.a || r4.a.f(i, 255) != this.d) {
            return i;
        }
        float min = (this.e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int q = a.a.q(r4.a.f(i, 255), min, this.b);
        if (min > 0.0f && (i2 = this.c) != 0) {
            q = r4.a.d(r4.a.f(i2, f), q);
        }
        return r4.a.f(q, alpha);
    }
}
