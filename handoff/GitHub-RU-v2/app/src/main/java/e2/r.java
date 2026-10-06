package e2;

/* loaded from: /home/user/work/p/classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final double f21912a;

    /* renamed from: b, reason: collision with root package name */
    public final double f21913b;

    /* renamed from: c, reason: collision with root package name */
    public final double f21914c;

    /* renamed from: d, reason: collision with root package name */
    public final double f21915d;

    /* renamed from: e, reason: collision with root package name */
    public final double f21916e;

    /* renamed from: f, reason: collision with root package name */
    public final double f21917f;

    /* renamed from: g, reason: collision with root package name */
    public final double f21918g;

    public r(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f21912a = d10;
        this.f21913b = d11;
        this.f21914c = d12;
        this.f21915d = d13;
        this.f21916e = d14;
        this.f21917f = d15;
        this.f21918g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d10 == -2.0d || d10 == -3.0d) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f21912a, rVar.f21912a) == 0 && Double.compare(this.f21913b, rVar.f21913b) == 0 && Double.compare(this.f21914c, rVar.f21914c) == 0 && Double.compare(this.f21915d, rVar.f21915d) == 0 && Double.compare(this.f21916e, rVar.f21916e) == 0 && Double.compare(this.f21917f, rVar.f21917f) == 0 && Double.compare(this.f21918g, rVar.f21918g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f21918g) + ((Double.hashCode(this.f21917f) + ((Double.hashCode(this.f21916e) + ((Double.hashCode(this.f21915d) + ((Double.hashCode(this.f21914c) + ((Double.hashCode(this.f21913b) + (Double.hashCode(this.f21912a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f21912a + ", a=" + this.f21913b + ", b=" + this.f21914c + ", c=" + this.f21915d + ", d=" + this.f21916e + ", e=" + this.f21917f + ", f=" + this.f21918g + ')';
    }

    public /* synthetic */ r(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }
}
