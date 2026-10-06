package f2;

import a0.s0;
import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends e {

    /* renamed from: a, reason: collision with root package name */
    public float f24214a;

    /* renamed from: b, reason: collision with root package name */
    public float f24215b;

    /* renamed from: c, reason: collision with root package name */
    public int f24216c;

    /* renamed from: d, reason: collision with root package name */
    public int f24217d;

    public h(float f6, float f10, int i, int i10, int i11) {
        f10 = (i11 & 2) != 0 ? 4.0f : f10;
        i = (i11 & 4) != 0 ? 0 : i;
        i10 = (i11 & 8) != 0 ? 0 : i10;
        this.f24214a = f6;
        this.f24215b = f10;
        this.f24216c = i;
        this.f24217d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f24214a == hVar.f24214a && this.f24215b == hVar.f24215b && this.f24216c == hVar.f24216c && this.f24217d == hVar.f24217d;
    }

    public final int hashCode() {
        return s0.b(this.f24217d, s0.b(this.f24216c, i.b(Float.hashCode(this.f24214a) * 31, this.f24215b, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f24214a);
        sb2.append(", miter=");
        sb2.append(this.f24215b);
        sb2.append(", cap=");
        String str = "Unknown";
        int i = this.f24216c;
        sb2.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb2.append(", join=");
        int i10 = this.f24217d;
        if (i10 == 0) {
            str = "Miter";
        } else if (i10 == 1) {
            str = "Round";
        } else if (i10 == 2) {
            str = "Bevel";
        }
        sb2.append((Object) str);
        sb2.append(", pathEffect=null)");
        return sb2.toString();
    }
}
