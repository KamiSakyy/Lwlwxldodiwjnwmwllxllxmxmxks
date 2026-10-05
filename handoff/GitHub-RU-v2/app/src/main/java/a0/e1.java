package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public float f58a;

    /* renamed from: b, reason: collision with root package name */
    public double f59b;

    /* renamed from: c, reason: collision with root package name */
    public float f60c;

    public final long a(float f6, float f10, long j10) {
        double sin;
        double cos;
        double exp;
        double exp2;
        float f11 = f6 - this.f58a;
        double d10 = j10 / 1000.0d;
        float f12 = this.f60c;
        double d11 = f12 * f12;
        double d12 = this.f59b;
        double d13 = (-f12) * d12;
        if (f12 > 1.0f) {
            double sqrt = Math.sqrt(d11 - 1) * d12;
            double d14 = d13 + sqrt;
            double d15 = d13 - sqrt;
            double d16 = f11;
            double d17 = ((d15 * d16) - f10) / (d15 - d14);
            double d18 = d16 - d17;
            double d19 = d15 * d10;
            double d20 = d10 * d14;
            sin = (Math.exp(d20) * d17) + (Math.exp(d19) * d18);
            exp = Math.exp(d19) * d18 * d15;
            exp2 = Math.exp(d20) * d17 * d14;
        } else {
            if (f12 != 1.0f) {
                double d21 = 1;
                double sqrt2 = Math.sqrt(d21 - d11) * d12;
                double d22 = f11;
                double d23 = (((-d13) * d22) + f10) * (d21 / sqrt2);
                double d24 = sqrt2 * d10;
                double d25 = d10 * d13;
                sin = ((Math.sin(d24) * d23) + (Math.cos(d24) * d22)) * Math.exp(d25);
                cos = (((Math.cos(d24) * sqrt2 * d23) + (Math.sin(d24) * (-sqrt2) * d22)) * Math.exp(d25)) + (d13 * sin);
                float f13 = (float) cos;
                return (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.f58a)) << 32);
            }
            double d26 = f11;
            double d27 = (d12 * d26) + f10;
            double d28 = (-d12) * d10;
            double d29 = (d10 * d27) + d26;
            sin = Math.exp(d28) * d29;
            exp = Math.exp(d28) * d29 * (-this.f59b);
            exp2 = Math.exp(d28) * d27;
        }
        cos = exp2 + exp;
        float f132 = (float) cos;
        return (Float.floatToRawIntBits(f132) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.f58a)) << 32);
    }
}
