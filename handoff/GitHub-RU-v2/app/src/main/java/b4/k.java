package b4;

/* loaded from: /home/user/work/p/classes.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public double f3436a;

    /* renamed from: b, reason: collision with root package name */
    public double f3437b;

    /* renamed from: c, reason: collision with root package name */
    public double f3438c;

    /* renamed from: d, reason: collision with root package name */
    public float f3439d;

    /* renamed from: e, reason: collision with root package name */
    public float f3440e;

    /* renamed from: f, reason: collision with root package name */
    public float f3441f;

    /* renamed from: g, reason: collision with root package name */
    public float f3442g;

    /* renamed from: h, reason: collision with root package name */
    public float f3443h;
    public int i;

    @Override // b4.m
    public final boolean a() {
        double d10 = this.f3440e - this.f3438c;
        double d11 = this.f3437b;
        double d12 = this.f3441f;
        return Math.sqrt((((d11 * d10) * d10) + ((d12 * d12) * ((double) this.f3442g))) / d11) <= ((double) this.f3443h);
    }

    @Override // b4.m
    public final float b() {
        return 0.0f;
    }

    @Override // b4.m
    public final float getInterpolation(float f6) {
        double d10 = f6 - this.f3439d;
        if (d10 > 0.0d) {
            double d11 = this.f3437b;
            double d12 = this.f3436a;
            int sqrt = (int) ((9.0d / ((Math.sqrt(d11 / this.f3442g) * d10) * 4.0d)) + 1.0d);
            double d13 = d10 / sqrt;
            int i = 0;
            while (i < sqrt) {
                float f10 = this.f3440e;
                double d14 = f10;
                double d15 = this.f3438c;
                double d16 = d13;
                float f11 = this.f3441f;
                double d17 = f11;
                double d18 = ((-d11) * (d14 - d15)) - (d12 * d17);
                double d19 = this.f3442g;
                double d20 = (((d18 / d19) * d16) / 2.0d) + d17;
                double d21 = ((((-((((d16 * d20) / 2.0d) + d14) - d15)) * d11) - (d20 * d12)) / d19) * d16;
                float f12 = f11 + ((float) d21);
                this.f3441f = f12;
                float f13 = f10 + ((float) (((d21 / 2.0d) + d17) * d16));
                this.f3440e = f13;
                int i10 = this.i;
                if (i10 > 0) {
                    if (f13 < 0.0f && (i10 & 1) == 1) {
                        this.f3440e = -f13;
                        this.f3441f = -f12;
                    }
                    float f14 = this.f3440e;
                    if (f14 > 1.0f && (i10 & 2) == 2) {
                        this.f3440e = 2.0f - f14;
                        this.f3441f = -this.f3441f;
                    }
                }
                i++;
                d13 = d16;
            }
        }
        this.f3439d = f6;
        if (a()) {
            this.f3440e = (float) this.f3438c;
        }
        return this.f3440e;
    }
}
