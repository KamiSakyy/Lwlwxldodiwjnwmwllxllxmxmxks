package u31;

import a0.s0;
import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements d {
    public final float a;

    public k(float f) {
        this.a = f;
    }

    @Override // u31.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.a == ((k) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return s0.l(new StringBuilder(), (int) (this.a * 100.0f), "%");
    }
}
