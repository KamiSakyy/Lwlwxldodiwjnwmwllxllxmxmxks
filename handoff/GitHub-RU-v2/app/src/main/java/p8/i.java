package p8;

import android.graphics.Rect;

/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public n8.b f30434a;

    /* renamed from: b, reason: collision with root package name */
    public float f30435b;

    public i(n8.b bVar, float f6) {
        this.f30434a = bVar;
        this.f30435b = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k71.k.e(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        i iVar = (i) obj;
        return k71.k.b(this.f30434a, iVar.f30434a) && this.f30435b == iVar.f30435b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f30435b) + (this.f30434a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WindowMetrics(_bounds=");
        sb2.append(this.f30434a);
        sb2.append(", density=");
        return x.i.i(sb2, this.f30435b, ')');
    }

    public i(Rect rect, float f6) {
        this.f30434a = new n8.b(rect);
        this.f30435b = f6;
    }
}
