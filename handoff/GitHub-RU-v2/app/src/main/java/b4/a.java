package b4;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: s, reason: collision with root package name */
    public static final double[] f3386s = new double[91];

    /* renamed from: a, reason: collision with root package name */
    public double[] f3387a;

    /* renamed from: b, reason: collision with root package name */
    public double f3388b;

    /* renamed from: c, reason: collision with root package name */
    public double f3389c;

    /* renamed from: d, reason: collision with root package name */
    public double f3390d;

    /* renamed from: e, reason: collision with root package name */
    public double f3391e;

    /* renamed from: f, reason: collision with root package name */
    public double f3392f;

    /* renamed from: g, reason: collision with root package name */
    public double f3393g;

    /* renamed from: h, reason: collision with root package name */
    public double f3394h;
    public double i;

    /* renamed from: j, reason: collision with root package name */
    public double f3395j;

    /* renamed from: k, reason: collision with root package name */
    public double f3396k;
    public double l;
    public double m;

    /* renamed from: n, reason: collision with root package name */
    public double f3397n;

    /* renamed from: o, reason: collision with root package name */
    public double f3398o;

    /* renamed from: p, reason: collision with root package name */
    public double f3399p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3400q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3401r;

    public final double a() {
        double d10 = this.f3395j * this.f3399p;
        double hypot = this.f3397n / Math.hypot(d10, (-this.f3396k) * this.f3398o);
        return this.f3400q ? (-d10) * hypot : d10 * hypot;
    }

    public final double b() {
        double d10 = this.f3395j * this.f3399p;
        double d11 = (-this.f3396k) * this.f3398o;
        double hypot = this.f3397n / Math.hypot(d10, d11);
        return this.f3400q ? (-d11) * hypot : d11 * hypot;
    }

    public final double c(double d10) {
        double d11 = (d10 - this.f3389c) * this.i;
        double d12 = this.f3391e;
        return ((this.f3392f - d12) * d11) + d12;
    }

    public final double d(double d10) {
        double d11 = (d10 - this.f3389c) * this.i;
        double d12 = this.f3393g;
        return ((this.f3394h - d12) * d11) + d12;
    }

    public final double e() {
        return (this.f3395j * this.f3398o) + this.l;
    }

    public final double f() {
        return (this.f3396k * this.f3399p) + this.m;
    }

    public final void g(double d10) {
        double d11 = (this.f3400q ? this.f3390d - d10 : d10 - this.f3389c) * this.i;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            d12 = 1.0d;
            if (d11 < 1.0d) {
                double[] dArr = this.f3387a;
                double length = d11 * (dArr.length - 1);
                int i = (int) length;
                double d13 = dArr[i];
                d12 = ((dArr[i + 1] - d13) * (length - i)) + d13;
            }
        }
        double d14 = d12 * 1.5707963267948966d;
        this.f3398o = Math.sin(d14);
        this.f3399p = Math.cos(d14);
    }
}
