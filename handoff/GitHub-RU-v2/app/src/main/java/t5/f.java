package t5;

import a0.g0;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public double f32090a;

    /* renamed from: b, reason: collision with root package name */
    public double f32091b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32092c;

    /* renamed from: d, reason: collision with root package name */
    public double f32093d;

    /* renamed from: e, reason: collision with root package name */
    public double f32094e;

    /* renamed from: f, reason: collision with root package name */
    public double f32095f;

    /* renamed from: g, reason: collision with root package name */
    public double f32096g;

    /* renamed from: h, reason: collision with root package name */
    public double f32097h;
    public double i;

    /* renamed from: j, reason: collision with root package name */
    public final g0 f32098j;

    public f() {
        this.f32090a = Math.sqrt(1500.0d);
        this.f32091b = 0.5d;
        this.f32092c = false;
        this.i = Double.MAX_VALUE;
        this.f32098j = new g0();
    }

    public final void a(float f6) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f32091b = f6;
        this.f32092c = false;
    }

    public final void b(float f6) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f32090a = Math.sqrt(f6);
        this.f32092c = false;
    }

    public final g0 c(double d10, double d11, long j10) {
        double sin;
        double cos;
        if (!this.f32092c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d12 = this.f32091b;
            if (d12 > 1.0d) {
                double d13 = this.f32090a;
                this.f32095f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                double d14 = this.f32091b;
                double d15 = this.f32090a;
                this.f32096g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
            } else if (d12 >= 0.0d && d12 < 1.0d) {
                this.f32097h = Math.sqrt(1.0d - (d12 * d12)) * this.f32090a;
            }
            this.f32092c = true;
        }
        double d16 = j10 / 1000.0d;
        double d17 = d10 - this.i;
        double d18 = this.f32091b;
        if (d18 > 1.0d) {
            double d19 = this.f32096g;
            double d20 = ((d19 * d17) - d11) / (d19 - this.f32095f);
            double d21 = d17 - d20;
            sin = (Math.pow(2.718281828459045d, this.f32095f * d16) * d20) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d22 = this.f32096g;
            double pow = Math.pow(2.718281828459045d, d22 * d16) * d21 * d22;
            double d23 = this.f32095f;
            cos = (Math.pow(2.718281828459045d, d23 * d16) * d20 * d23) + pow;
        } else if (d18 == 1.0d) {
            double d24 = this.f32090a;
            double d25 = (d24 * d17) + d11;
            double d26 = (d25 * d16) + d17;
            double pow2 = Math.pow(2.718281828459045d, (-d24) * d16) * d26;
            double pow3 = Math.pow(2.718281828459045d, (-this.f32090a) * d16) * d26;
            double d27 = -this.f32090a;
            cos = (Math.pow(2.718281828459045d, d27 * d16) * d25) + (pow3 * d27);
            sin = pow2;
        } else {
            double d28 = 1.0d / this.f32097h;
            double d29 = this.f32090a;
            double d30 = ((d18 * d29 * d17) + d11) * d28;
            sin = ((Math.sin(this.f32097h * d16) * d30) + (Math.cos(this.f32097h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d29 * d16);
            double d31 = this.f32090a;
            double d32 = this.f32091b;
            double d33 = (-d31) * sin * d32;
            double pow4 = Math.pow(2.718281828459045d, (-d32) * d31 * d16);
            double d34 = this.f32097h;
            double sin2 = Math.sin(d34 * d16) * (-d34) * d17;
            double d35 = this.f32097h;
            cos = (((Math.cos(d35 * d16) * d30 * d35) + sin2) * pow4) + d33;
        }
        float f6 = (float) (sin + this.i);
        g0 g0Var = this.f32098j;
        g0Var.f85r = f6;
        g0Var.f86s = (float) cos;
        return g0Var;
    }

    public f(float f6) {
        this.f32090a = Math.sqrt(1500.0d);
        this.f32091b = 0.5d;
        this.f32092c = false;
        this.f32098j = new g0();
        this.i = f6;
    }
    public static final Object J = null;
}
