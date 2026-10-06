package u31;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements d {
    public d a;
    public float b;

    public b(float f, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).a;
            f += ((b) dVar).b;
        }
        this.a = dVar;
        this.b = f;
    }

    @Override // u31.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b == bVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
