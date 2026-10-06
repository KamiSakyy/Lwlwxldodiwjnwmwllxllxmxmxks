package v2;

/* loaded from: /home/user/work/p/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public float f32551a;

    /* renamed from: b, reason: collision with root package name */
    public float f32552b;

    /* renamed from: c, reason: collision with root package name */
    public float f32553c;

    /* renamed from: d, reason: collision with root package name */
    public float f32554d;

    public m(float f6, float f10, float f11, float f12) {
        this.f32551a = f6;
        this.f32552b = f10;
        this.f32553c = f11;
        this.f32554d = f12;
        if (f6 < 0.0f) {
            t2.a.a("Left must be non-negative");
        }
        if (f10 < 0.0f) {
            t2.a.a("Top must be non-negative");
        }
        if (f11 < 0.0f) {
            t2.a.a("Right must be non-negative");
        }
        if (f12 >= 0.0f) {
            return;
        }
        t2.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return s3.f.b(this.f32551a, mVar.f32551a) && s3.f.b(this.f32552b, mVar.f32552b) && s3.f.b(this.f32553c, mVar.f32553c) && s3.f.b(this.f32554d, mVar.f32554d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + x.i.b(x.i.b(x.i.b(Float.hashCode(this.f32551a) * 31, this.f32552b, 31), this.f32553c, 31), this.f32554d, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DpTouchBoundsExpansion(start=");
        com.github.rudroid.copilot.h1.x(this.f32551a, sb2, ", top=");
        com.github.rudroid.copilot.h1.x(this.f32552b, sb2, ", end=");
        com.github.rudroid.copilot.h1.x(this.f32553c, sb2, ", bottom=");
        sb2.append((Object) s3.f.c(this.f32554d));
        sb2.append(", isLayoutDirectionAware=true)");
        return sb2.toString();
    }
}
