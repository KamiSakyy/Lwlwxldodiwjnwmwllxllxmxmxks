package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f23696a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23697b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23698c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23699d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23700e;

    public s0(float f6, float f10, float f11, float f12, float f13) {
        this.f23696a = f6;
        this.f23697b = f10;
        this.f23698c = f11;
        this.f23699d = f12;
        this.f23700e = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return s3.f.b(this.f23696a, s0Var.f23696a) && s3.f.b(this.f23697b, s0Var.f23697b) && s3.f.b(this.f23698c, s0Var.f23698c) && s3.f.b(this.f23699d, s0Var.f23699d) && s3.f.b(this.f23700e, s0Var.f23700e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f23700e) + x.i.b(x.i.b(x.i.b(Float.hashCode(this.f23696a) * 31, this.f23697b, 31), this.f23698c, 31), this.f23699d, 31);
    }
}
