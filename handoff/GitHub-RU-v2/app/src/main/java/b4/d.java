package b4;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends e {

    /* renamed from: e, reason: collision with root package name */
    public double f3406e;

    /* renamed from: f, reason: collision with root package name */
    public double f3407f;

    /* renamed from: g, reason: collision with root package name */
    public double f3408g;

    /* renamed from: h, reason: collision with root package name */
    public double f3409h;

    public d(String str) {
        super(0);
        this.f3413b = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f3406e = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        int indexOf3 = str.indexOf(44, i);
        this.f3407f = Double.parseDouble(str.substring(i, indexOf3).trim());
        int i10 = indexOf3 + 1;
        int indexOf4 = str.indexOf(44, i10);
        this.f3408g = Double.parseDouble(str.substring(i10, indexOf4).trim());
        int i11 = indexOf4 + 1;
        this.f3409h = Double.parseDouble(str.substring(i11, str.indexOf(41, i11)).trim());
    }

    @Override // b4.e
    public final double a(double d10) {
        if (d10 <= 0.0d) {
            return 0.0d;
        }
        if (d10 >= 1.0d) {
            return 1.0d;
        }
        double d11 = 0.5d;
        double d12 = 0.5d;
        while (d11 > 0.01d) {
            d11 *= 0.5d;
            d12 = e(d12) < d10 ? d12 + d11 : d12 - d11;
        }
        double d13 = d12 - d11;
        double e5 = e(d13);
        double d14 = d12 + d11;
        double e10 = e(d14);
        double f6 = f(d13);
        return (((d10 - e5) * (f(d14) - f6)) / (e10 - e5)) + f6;
    }

    @Override // b4.e
    public final double b(double d10) {
        double d11 = 0.5d;
        double d12 = 0.5d;
        while (d11 > 1.0E-4d) {
            d11 *= 0.5d;
            d12 = e(d12) < d10 ? d12 + d11 : d12 - d11;
        }
        double d13 = d12 - d11;
        double d14 = d12 + d11;
        return (f(d14) - f(d13)) / (e(d14) - e(d13));
    }

    public final double e(double d10) {
        double d11 = 1.0d - d10;
        double d12 = 3.0d * d11;
        double d13 = d11 * d12 * d10;
        double d14 = d12 * d10 * d10;
        return (this.f3408g * d14) + (this.f3406e * d13) + (d10 * d10 * d10);
    }

    public final double f(double d10) {
        double d11 = 1.0d - d10;
        double d12 = 3.0d * d11;
        double d13 = d11 * d12 * d10;
        double d14 = d12 * d10 * d10;
        return (this.f3409h * d14) + (this.f3407f * d13) + (d10 * d10 * d10);
    }
}
