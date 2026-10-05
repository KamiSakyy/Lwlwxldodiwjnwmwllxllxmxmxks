package b4;

/* loaded from: /home/user/work/p/classes.dex */
public final class j extends e {

    /* renamed from: e, reason: collision with root package name */
    public double f3434e;

    /* renamed from: f, reason: collision with root package name */
    public double f3435f;

    @Override // b4.e
    public final double a(double d10) {
        double d11 = this.f3434e;
        double d12 = this.f3435f;
        if (d10 < d12) {
            return (d12 * d10) / (((d12 - d10) * d11) + d10);
        }
        return ((d10 - 1.0d) * (1.0d - d12)) / ((1.0d - d10) - ((d12 - d10) * d11));
    }

    @Override // b4.e
    public final double b(double d10) {
        double d11 = this.f3434e;
        double d12 = this.f3435f;
        if (d10 < d12) {
            double d13 = d11 * d12 * d12;
            double d14 = ((d12 - d10) * d11) + d10;
            return d13 / (d14 * d14);
        }
        double d15 = d12 - 1.0d;
        double d16 = (((d12 - d10) * (-d11)) - d10) + 1.0d;
        return ((d15 * d11) * d15) / (d16 * d16);
    }
}
