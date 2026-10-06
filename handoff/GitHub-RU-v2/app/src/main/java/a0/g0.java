package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class g0 implements f0 {

    /* renamed from: r, reason: collision with root package name */
    public float f85r;

    /* renamed from: s, reason: collision with root package name */
    public float f86s;

    public g0(int i) {
        switch (i) {
            case 1:
                break;
            default:
                this.f85r = Math.max(1.0E-7f, Math.abs(0.1f));
                this.f86s = Math.max(1.0E-4f, 1.0f) * (-4.2f);
                break;
        }
    }

    @Override // a0.f0
    public float a() {
        return this.f85r;
    }

    public z.v0 b(float f6) {
        double c10 = c(f6);
        double d10 = z.w0.f34495a;
        double d11 = d10 - 1.0d;
        return new z.v0(f6, (float) (Math.exp((d10 / d11) * c10) * this.f85r * this.f86s), (long) (Math.exp(c10 / d11) * 1000.0d));
    }

    public double c(float f6) {
        float[] fArr = z.b.f34324a;
        return Math.log((Math.abs(f6) * 0.35f) / (this.f85r * this.f86s));
    }

    @Override // a0.f0
    public float e(float f6, long j10) {
        return f6 * ((float) Math.exp(((j10 / 1000000) / 1000.0f) * this.f86s));
    }

    @Override // a0.f0
    public float h(float f6, float f10, long j10) {
        float f11 = this.f86s;
        return ((f10 / f11) * ((float) Math.exp((f11 * (j10 / 1000000)) / 1000.0f))) + (f6 - (f10 / f11));
    }

    @Override // a0.f0
    public long k(float f6) {
        return ((long) ((((float) Math.log(this.f85r / Math.abs(f6))) * 1000.0f) / this.f86s)) * 1000000;
    }

    @Override // a0.f0
    public float m(float f6, float f10) {
        if (Math.abs(f10) <= this.f85r) {
            return f6;
        }
        double log = Math.log(Math.abs(r1 / f10));
        float f11 = this.f86s;
        return ((f10 / f11) * ((float) Math.exp((f11 * ((log / f11) * 1000)) / 1000.0f))) + (f6 - (f10 / f11));
    }
    public Object r = null;
    public Object s = null;
    public g0() {
    }
}
