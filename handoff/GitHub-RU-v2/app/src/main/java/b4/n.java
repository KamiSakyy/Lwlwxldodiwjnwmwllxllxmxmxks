package b4;

/* loaded from: /home/user/work/p/classes.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public float f3445a;

    /* renamed from: b, reason: collision with root package name */
    public float f3446b;

    /* renamed from: c, reason: collision with root package name */
    public float f3447c;

    /* renamed from: d, reason: collision with root package name */
    public float f3448d;

    /* renamed from: e, reason: collision with root package name */
    public float f3449e;

    /* renamed from: f, reason: collision with root package name */
    public float f3450f;

    /* renamed from: g, reason: collision with root package name */
    public float f3451g;

    /* renamed from: h, reason: collision with root package name */
    public float f3452h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public int f3453j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3454k;
    public float l;
    public float m;

    /* renamed from: n, reason: collision with root package name */
    public float f3455n;

    @Override // b4.m
    public final boolean a() {
        return b() < 1.0E-5f && Math.abs(this.i - this.m) < 1.0E-5f;
    }

    @Override // b4.m
    public final float b() {
        return this.f3454k ? -c(this.f3455n) : c(this.f3455n);
    }

    public final float c(float f6) {
        float f10;
        float f11;
        float f12 = this.f3448d;
        if (f6 <= f12) {
            f10 = this.f3445a;
            f11 = this.f3446b;
        } else {
            int i = this.f3453j;
            if (i == 1) {
                return 0.0f;
            }
            f6 -= f12;
            f12 = this.f3449e;
            if (f6 >= f12) {
                if (i == 2) {
                    return 0.0f;
                }
                float f13 = f6 - f12;
                float f14 = this.f3450f;
                if (f13 >= f14) {
                    return 0.0f;
                }
                float f15 = this.f3447c;
                return f15 - ((f13 * f15) / f14);
            }
            f10 = this.f3446b;
            f11 = this.f3447c;
        }
        return (((f11 - f10) * f6) / f12) + f10;
    }

    public final void d(float f6, float f10, float f11, float f12, float f13) {
        this.i = f10;
        if (f6 == 0.0f) {
            f6 = 1.0E-4f;
        }
        float f14 = f6 / f11;
        float f15 = (f14 * f6) / 2.0f;
        if (f6 < 0.0f) {
            float sqrt = (float) Math.sqrt((f10 - ((((-f6) / f11) * f6) / 2.0f)) * f11);
            if (sqrt < f12) {
                this.f3453j = 2;
                this.f3445a = f6;
                this.f3446b = sqrt;
                this.f3447c = 0.0f;
                float f16 = (sqrt - f6) / f11;
                this.f3448d = f16;
                this.f3449e = sqrt / f11;
                this.f3451g = ((f6 + sqrt) * f16) / 2.0f;
                this.f3452h = f10;
                this.i = f10;
                return;
            }
            this.f3453j = 3;
            this.f3445a = f6;
            this.f3446b = f12;
            this.f3447c = f12;
            float f17 = (f12 - f6) / f11;
            this.f3448d = f17;
            float f18 = f12 / f11;
            this.f3450f = f18;
            float f19 = ((f6 + f12) * f17) / 2.0f;
            float f20 = (f18 * f12) / 2.0f;
            this.f3449e = ((f10 - f19) - f20) / f12;
            this.f3451g = f19;
            this.f3452h = f10 - f20;
            this.i = f10;
            return;
        }
        if (f15 >= f10) {
            this.f3453j = 1;
            this.f3445a = f6;
            this.f3446b = 0.0f;
            this.f3451g = f10;
            this.f3448d = (2.0f * f10) / f6;
            return;
        }
        float f21 = f10 - f15;
        float f22 = f21 / f6;
        if (f22 + f14 < f13) {
            this.f3453j = 2;
            this.f3445a = f6;
            this.f3446b = f6;
            this.f3447c = 0.0f;
            this.f3451g = f21;
            this.f3452h = f10;
            this.f3448d = f22;
            this.f3449e = f14;
            return;
        }
        float sqrt2 = (float) Math.sqrt(((f6 * f6) / 2.0f) + (f11 * f10));
        float f23 = (sqrt2 - f6) / f11;
        this.f3448d = f23;
        float f24 = sqrt2 / f11;
        this.f3449e = f24;
        if (sqrt2 < f12) {
            this.f3453j = 2;
            this.f3445a = f6;
            this.f3446b = sqrt2;
            this.f3447c = 0.0f;
            this.f3448d = f23;
            this.f3449e = f24;
            this.f3451g = ((f6 + sqrt2) * f23) / 2.0f;
            this.f3452h = f10;
            return;
        }
        this.f3453j = 3;
        this.f3445a = f6;
        this.f3446b = f12;
        this.f3447c = f12;
        float f25 = (f12 - f6) / f11;
        this.f3448d = f25;
        float f26 = f12 / f11;
        this.f3450f = f26;
        float f27 = ((f6 + f12) * f25) / 2.0f;
        float f28 = (f26 * f12) / 2.0f;
        this.f3449e = ((f10 - f27) - f28) / f12;
        this.f3451g = f27;
        this.f3452h = f10 - f28;
        this.i = f10;
    }

    @Override // b4.m
    public final float getInterpolation(float f6) {
        float f10;
        float f11 = this.f3448d;
        if (f6 <= f11) {
            float f12 = this.f3445a;
            f10 = ((((this.f3446b - f12) * f6) * f6) / (f11 * 2.0f)) + (f12 * f6);
        } else {
            int i = this.f3453j;
            if (i == 1) {
                f10 = this.f3451g;
            } else {
                float f13 = f6 - f11;
                float f14 = this.f3449e;
                if (f13 < f14) {
                    float f15 = this.f3451g;
                    float f16 = this.f3446b;
                    f10 = ((((this.f3447c - f16) * f13) * f13) / (f14 * 2.0f)) + (f16 * f13) + f15;
                } else if (i == 2) {
                    f10 = this.f3452h;
                } else {
                    float f17 = f13 - f14;
                    float f18 = this.f3450f;
                    if (f17 <= f18) {
                        float f19 = this.f3452h;
                        float f20 = this.f3447c * f17;
                        f10 = (f19 + f20) - ((f20 * f17) / (f18 * 2.0f));
                    } else {
                        f10 = this.i;
                    }
                }
            }
        }
        this.m = f10;
        this.f3455n = f6;
        return this.f3454k ? this.l - f10 : this.l + f10;
    }
}
