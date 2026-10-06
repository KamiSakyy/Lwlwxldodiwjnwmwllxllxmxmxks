package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class o8 {

    /* renamed from: a, reason: collision with root package name */
    public float f23472a;

    /* renamed from: b, reason: collision with root package name */
    public float f23473b;

    /* renamed from: c, reason: collision with root package name */
    public float f23474c;

    /* renamed from: d, reason: collision with root package name */
    public float f23475d;

    /* renamed from: e, reason: collision with root package name */
    public float f23476e;

    /* renamed from: f, reason: collision with root package name */
    public float f23477f;

    public o8(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f23472a = f6;
        this.f23473b = f10;
        this.f23474c = f11;
        this.f23475d = f12;
        this.f23476e = f13;
        this.f23477f = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o8)) {
            return false;
        }
        o8 o8Var = (o8) obj;
        return s3.f.b(this.f23472a, o8Var.f23472a) && s3.f.b(this.f23473b, o8Var.f23473b) && s3.f.b(this.f23474c, o8Var.f23474c) && s3.f.b(this.f23475d, o8Var.f23475d) && s3.f.b(this.f23477f, o8Var.f23477f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f23477f) + x.i.b(x.i.b(x.i.b(Float.hashCode(this.f23472a) * 31, this.f23473b, 31), this.f23474c, 31), this.f23475d, 31);
    }
}
