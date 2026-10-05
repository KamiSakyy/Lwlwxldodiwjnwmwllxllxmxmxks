package u31;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements d {
    public final float a;

    public a(float f) {
        this.a = f;
    }

    @Override // u31.d
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a == ((a) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return this.a + "px";
    }
}
