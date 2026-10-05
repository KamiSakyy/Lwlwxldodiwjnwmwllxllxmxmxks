package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class w implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f281a;

    /* renamed from: b, reason: collision with root package name */
    public final float f282b;

    /* renamed from: c, reason: collision with root package name */
    public final float f283c;

    /* renamed from: d, reason: collision with root package name */
    public final float f284d;

    /* renamed from: e, reason: collision with root package name */
    public final float f285e;

    /* renamed from: f, reason: collision with root package name */
    public final float f286f;

    public w(float f6, float f10, float f11, float f12) {
        int i;
        this.f281a = f6;
        this.f282b = f10;
        this.f283c = f11;
        this.f284d = f12;
        if (!((Float.isNaN(f6) || Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12)) ? false : true)) {
            a1.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f6 + ", " + f10 + ", " + f11 + ", " + f12 + '.');
        }
        float[] fArr = new float[5];
        float f13 = (f10 - 0.0f) * 3.0f;
        float f14 = (f12 - f10) * 3.0f;
        float f15 = (1.0f - f12) * 3.0f;
        double d10 = f13;
        double d11 = f14;
        double d12 = f15;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            i = d11 == d12 ? 0 : d2.a0.D((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, 0);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
            double d16 = (-d10) + d11;
            int D = d2.a0.D((float) ((-(d15 + d16)) / d14), fArr, 0);
            int D2 = d2.a0.D((float) ((d15 - d16) / d14), fArr, D) + D;
            if (D2 > 1) {
                float f16 = fArr[0];
                float f17 = fArr[1];
                if (f16 > f17) {
                    fArr[0] = f17;
                    fArr[1] = f16;
                } else if (f16 == f17) {
                    i = D2 - 1;
                }
            }
            i = D2;
        }
        float f18 = (f14 - f13) * 2.0f;
        int D3 = d2.a0.D((-f18) / (((f15 - f14) * 2.0f) - f18), fArr, i) + i;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i10 = 0; i10 < D3; i10++) {
            float f19 = fArr[i10];
            float f20 = (((((((((f10 - f12) * 3.0f) + 1.0f) - 0.0f) * f19) + (((f12 - (f10 * 2.0f)) + 0.0f) * 3.0f)) * f19) + f13) * f19) + 0.0f;
            min = Math.min(min, f20);
            max = Math.max(max, f20);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f285e = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f286f = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0206, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0236, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bb, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0261  */
    @Override // a0.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f6) {
        float f10;
        boolean isNaN;
        if (f6 <= 0.0f || f6 >= 1.0f) {
            return f6;
        }
        float max = Math.max(f6, 1.1920929E-7f);
        float f11 = this.f281a;
        float f12 = this.f283c;
        float f13 = f12 - max;
        double d10 = 0.0f - max;
        float f14 = 0.0f;
        double d11 = ((d10 - ((f11 - max) * 2.0d)) + f13) * 3.0d;
        double d12 = (r7 - r5) * 3.0d;
        double d13 = ((r7 - f13) * 3.0d) + (-r5) + (1.0f - max);
        float f15 = Float.NaN;
        if (Math.abs(d13 - 0.0d) >= 1.0E-7d) {
            double d14 = d11 / d13;
            double d15 = d12 / d13;
            double d16 = d10 / d13;
            double d17 = ((d15 * 3.0d) - (d14 * d14)) / 9.0d;
            double d18 = ((d16 * 27.0d) + ((((2.0d * d14) * d14) * d14) - ((9.0d * d14) * d15))) / 54.0d;
            double d19 = d17 * d17 * d17;
            double d20 = (d18 * d18) + d19;
            double d21 = d14 / 3.0d;
            if (d20 < 0.0d) {
                double sqrt = Math.sqrt(-d19);
                double d22 = (-d18) / sqrt;
                if (d22 < -1.0d) {
                    d22 = -1.0d;
                }
                if (d22 > 1.0d) {
                    d22 = 1.0d;
                }
                double acos = Math.acos(d22);
                double h10 = sy.t.h((float) sqrt) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * h10) - d21);
                float f16 = cos < 0.0f ? 0.0f : cos;
                if (f16 > 1.0f) {
                    f16 = 1.0f;
                }
                if (Math.abs(f16 - cos) > 1.05E-6f) {
                    f16 = Float.NaN;
                }
                if (Float.isNaN(f16)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * h10) - d21);
                    f16 = cos2 < 0.0f ? 0.0f : cos2;
                    if (f16 > 1.0f) {
                        f16 = 1.0f;
                    }
                    if (Math.abs(f16 - cos2) > 1.05E-6f) {
                        f16 = Float.NaN;
                    }
                    if (Float.isNaN(f16)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * h10) - d21);
                        if (cos3 >= 0.0f) {
                            f14 = cos3;
                        }
                        f10 = f14 > 1.0f ? 1.0f : f14;
                    }
                }
                f15 = f16;
                isNaN = Float.isNaN(f15);
                float f17 = this.f284d;
                float f18 = this.f282b;
                if (isNaN) {
                }
            } else if (d20 == 0.0d) {
                float f19 = -sy.t.h((float) d18);
                float f20 = (float) d21;
                float f21 = (f19 * 2.0f) - f20;
                float f22 = f21 < 0.0f ? 0.0f : f21;
                if (f22 > 1.0f) {
                    f22 = 1.0f;
                }
                if (Math.abs(f22 - f21) > 1.05E-6f) {
                    f22 = Float.NaN;
                }
                if (Float.isNaN(f22)) {
                    float f23 = (-f19) - f20;
                    if (f23 >= 0.0f) {
                        f14 = f23;
                    }
                    f10 = f14 > 1.0f ? 1.0f : f14;
                } else {
                    f15 = f22;
                }
                isNaN = Float.isNaN(f15);
                float f172 = this.f284d;
                float f182 = this.f282b;
                if (isNaN) {
                }
            } else {
                double sqrt2 = Math.sqrt(d20);
                float h11 = (float) ((sy.t.h((float) ((-d18) + sqrt2)) - sy.t.h((float) (d18 + sqrt2))) - d21);
                if (h11 >= 0.0f) {
                    f14 = h11;
                }
                f10 = f14 > 1.0f ? 1.0f : f14;
            }
        } else {
            if (Math.abs(d11 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d12 - 0.0d) >= 1.0E-7d) {
                    float f24 = (float) ((-d10) / d12);
                    if (f24 >= 0.0f) {
                        f14 = f24;
                    }
                    f10 = f14 > 1.0f ? 1.0f : f14;
                }
                isNaN = Float.isNaN(f15);
                float f1722 = this.f284d;
                float f1822 = this.f282b;
                if (isNaN) {
                    float f25 = ((((((f1822 - f1722) + 0.33333334f) * f15) + (f1722 - (2.0f * f1822))) * f15) + f1822) * 3.0f * f15;
                    float f26 = this.f285e;
                    if (f25 < f26) {
                        f25 = f26;
                    }
                    float f27 = this.f286f;
                    return f25 > f27 ? f27 : f25;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f11 + ", " + f1822 + ", " + f12 + ", " + f1722 + ") has no solution at " + f6);
            }
            double sqrt3 = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d23 = d11 * 2.0d;
            float f28 = (float) ((sqrt3 - d12) / d23);
            float f29 = f28 < 0.0f ? 0.0f : f28;
            if (f29 > 1.0f) {
                f29 = 1.0f;
            }
            if (Math.abs(f29 - f28) > 1.05E-6f) {
                f29 = Float.NaN;
            }
            if (Float.isNaN(f29)) {
                float f30 = (float) (((-d12) - sqrt3) / d23);
                if (f30 >= 0.0f) {
                    f14 = f30;
                }
                f10 = f14 > 1.0f ? 1.0f : f14;
            } else {
                f15 = f29;
            }
            isNaN = Float.isNaN(f15);
            float f17222 = this.f284d;
            float f18222 = this.f282b;
            if (isNaN) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f281a == wVar.f281a && this.f282b == wVar.f282b && this.f283c == wVar.f283c && this.f284d == wVar.f284d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f284d) + x.i.b(x.i.b(Float.hashCode(this.f281a) * 31, this.f282b, 31), this.f283c, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CubicBezierEasing(a=");
        sb2.append(this.f281a);
        sb2.append(", b=");
        sb2.append(this.f282b);
        sb2.append(", c=");
        sb2.append(this.f283c);
        sb2.append(", d=");
        return x.i.i(sb2, this.f284d, ')');
    }
}
