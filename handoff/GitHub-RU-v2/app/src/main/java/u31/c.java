package u31;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements d {
    public float a;

    public c(float f) {
        this.a = f;
    }

    @Override // u31.d
    public final float a(RectF rectF) {
        float min = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f = this.a;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > min ? min : f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
