package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    public final float f22631a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22632b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22633c;

    public cb(float f6, float f10, float f11) {
        this.f22631a = f6;
        this.f22632b = f10;
        this.f22633c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return s3.f.b(this.f22631a, cbVar.f22631a) && s3.f.b(this.f22632b, cbVar.f22632b) && s3.f.b(this.f22633c, cbVar.f22633c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f22633c) + x.i.b(Float.hashCode(this.f22631a) * 31, this.f22632b, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabPosition(left=");
        float f6 = this.f22631a;
        com.github.rudroid.copilot.h1.x(f6, sb2, ", right=");
        float f10 = this.f22632b;
        sb2.append((Object) s3.f.c(f6 + f10));
        sb2.append(", width=");
        sb2.append((Object) s3.f.c(f10));
        sb2.append(", contentWidth=");
        sb2.append((Object) s3.f.c(this.f22633c));
        sb2.append(')');
        return sb2.toString();
    }
}
