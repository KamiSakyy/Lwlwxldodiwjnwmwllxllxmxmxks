package p9;

import android.graphics.Bitmap;
import java.util.Map;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Bitmap f30442a;

    /* renamed from: b, reason: collision with root package name */
    public Map f30443b;

    public b(Bitmap bitmap, Map map) {
        this.f30442a = bitmap;
        this.f30443b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.f30442a, bVar.f30442a) && k.b(this.f30443b, bVar.f30443b);
    }

    public final int hashCode() {
        return this.f30443b.hashCode() + (this.f30442a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f30442a + ", extras=" + this.f30443b + ')';
    }
    public Object a = null;
    public Object w = null;
    public Object y = null;
}
