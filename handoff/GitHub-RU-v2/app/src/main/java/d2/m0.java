package d2;

/* loaded from: /home/user/work/p/classes.dex */
public final class m0 implements s3.c {
    public float A;
    public float B;
    public float C;
    public float D;
    public long E;
    public p0 F;
    public boolean G;
    public int H;
    public long I;
    public s3.c J;
    public s3.m K;
    public int L;
    public a0 M;

    /* renamed from: r, reason: collision with root package name */
    public int f21359r;

    /* renamed from: s, reason: collision with root package name */
    public float f21360s = 1.0f;

    /* renamed from: t, reason: collision with root package name */
    public float f21361t = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public float f21362u = 1.0f;

    /* renamed from: v, reason: collision with root package name */
    public float f21363v;

    /* renamed from: w, reason: collision with root package name */
    public float f21364w;

    /* renamed from: x, reason: collision with root package name */
    public float f21365x;

    /* renamed from: y, reason: collision with root package name */
    public long f21366y;

    /* renamed from: z, reason: collision with root package name */
    public long f21367z;

    public m0() {
        long j10 = b0.f21322a;
        this.f21366y = j10;
        this.f21367z = j10;
        this.D = 8.0f;
        this.E = v0.f21394b;
        this.F = a0.f21318b;
        this.H = 0;
        this.I = 9205357640488583168L;
        this.J = k41.b.a();
        this.K = s3.m.f31704r;
        this.L = 3;
    }

    public final void B(float f6) {
        if (this.f21363v == f6) {
            return;
        }
        this.f21359r |= 8;
        this.f21363v = f6;
    }

    public final void C(float f6) {
        if (this.f21364w == f6) {
            return;
        }
        this.f21359r |= 16;
        this.f21364w = f6;
    }

    @Override // s3.c
    public final float Q() {
        return this.J.Q();
    }

    @Override // s3.c
    public final float b() {
        return this.J.b();
    }

    public final void c() {
        p(1.0f);
        q(1.0f);
        d(1.0f);
        B(0.0f);
        C(0.0f);
        r(0.0f);
        long j10 = b0.f21322a;
        f(j10);
        x(j10);
        j(0.0f);
        k(0.0f);
        o(0.0f);
        h(8.0f);
        y(v0.f21394b);
        t(a0.f21318b);
        i(false);
        if (this.L != 3) {
            this.f21359r |= 524288;
            this.L = 3;
        }
        if (this.H != 0) {
            this.f21359r |= 32768;
            this.H = 0;
        }
        this.I = 9205357640488583168L;
        this.M = null;
        this.f21359r = 0;
    }

    public final void d(float f6) {
        if (this.f21362u == f6) {
            return;
        }
        this.f21359r |= 4;
        this.f21362u = f6;
    }

    public final void f(long j10) {
        if (t.c(this.f21366y, j10)) {
            return;
        }
        this.f21359r |= 64;
        this.f21366y = j10;
    }

    public final void h(float f6) {
        if (this.D == f6) {
            return;
        }
        this.f21359r |= 2048;
        this.D = f6;
    }

    public final void i(boolean z10) {
        if (this.G != z10) {
            this.f21359r |= 16384;
            this.G = z10;
        }
    }

    public final void j(float f6) {
        if (this.A == f6) {
            return;
        }
        this.f21359r |= 256;
        this.A = f6;
    }

    public final void k(float f6) {
        if (this.B == f6) {
            return;
        }
        this.f21359r |= 512;
        this.B = f6;
    }

    public final void o(float f6) {
        if (this.C == f6) {
            return;
        }
        this.f21359r |= 1024;
        this.C = f6;
    }

    public final void p(float f6) {
        if (this.f21360s == f6) {
            return;
        }
        this.f21359r |= 1;
        this.f21360s = f6;
    }

    public final void q(float f6) {
        if (this.f21361t == f6) {
            return;
        }
        this.f21359r |= 2;
        this.f21361t = f6;
    }

    public final void r(float f6) {
        if (this.f21365x == f6) {
            return;
        }
        this.f21359r |= 32;
        this.f21365x = f6;
    }

    public final void t(p0 p0Var) {
        if (k71.k.b(this.F, p0Var)) {
            return;
        }
        this.f21359r |= 8192;
        this.F = p0Var;
    }

    public final void x(long j10) {
        if (t.c(this.f21367z, j10)) {
            return;
        }
        this.f21359r |= 128;
        this.f21367z = j10;
    }

    public final void y(long j10) {
        if (v0.a(this.E, j10)) {
            return;
        }
        this.f21359r |= 4096;
        this.E = j10;
    }
}
