package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class h0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public float f97a;

    /* renamed from: b, reason: collision with root package name */
    public e1 f98b;

    public h0(float f6, float f10, float f11) {
        this.f97a = f11;
        e1 e1Var = new e1();
        e1Var.f58a = 1.0f;
        e1Var.f59b = Math.sqrt(50.0d);
        e1Var.f60c = 1.0f;
        if (f6 < 0.0f) {
            a1.a("Damping ratio must be non-negative");
        }
        e1Var.f60c = f6;
        double d10 = e1Var.f59b;
        if (((float) (d10 * d10)) <= 0.0f) {
            a1.a("Spring stiffness constant must be positive.");
        }
        e1Var.f59b = Math.sqrt(f10);
        this.f98b = e1Var;
    }

    @Override // a0.e0
    public final long b(float f6, float f10, float f11) {
        double d10;
        int i;
        long j10;
        e1 e1Var = this.f98b;
        double d11 = e1Var.f59b;
        float f12 = (float) (d11 * d11);
        float f13 = e1Var.f60c;
        float f14 = this.f97a;
        float f15 = (f6 - f10) / f14;
        float f16 = f11 / f14;
        if (f13 == 0.0f) {
            j10 = 9223372036854L;
        } else {
            double d12 = f12;
            double d13 = f13;
            double d14 = f16;
            double d15 = f15;
            double d16 = 1.0f;
            double sqrt = d13 * 2.0d * Math.sqrt(d12);
            double d17 = (sqrt * sqrt) - (d12 * 4.0d);
            double sqrt2 = d17 < 0.0d ? 0.0d : Math.sqrt(d17);
            double d18 = -sqrt;
            double d19 = (d18 + sqrt2) * 0.5d;
            double sqrt3 = (d17 < 0.0d ? Math.sqrt(Math.abs(d17)) : 0.0d) * 0.5d;
            double d20 = (d18 - sqrt2) * 0.5d;
            if (d15 == 0.0d && d14 == 0.0d) {
                j10 = 0;
            } else {
                if (d15 < 0.0d) {
                    d14 = -d14;
                }
                double abs = Math.abs(d15);
                double d21 = Double.MAX_VALUE;
                if (d13 > 1.0d) {
                    double d22 = (d19 * abs) - d14;
                    double d23 = d19 - d20;
                    double d24 = d22 / d23;
                    double d25 = abs - d24;
                    d10 = Math.log(Math.abs(d16 / d25)) / d19;
                    double log = Math.log(Math.abs(d16 / d24)) / d20;
                    if ((Double.doubleToRawLongBits(d10) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        d10 = log;
                    } else if ((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) < 9218868437227405312L) {
                        d10 = Math.max(d10, log);
                    }
                    double d26 = d25 * d19;
                    double log2 = Math.log(d26 / ((-d24) * d20)) / (d20 - d19);
                    if (Double.isNaN(log2) || log2 <= 0.0d) {
                        d16 = -d16;
                    } else {
                        if (log2 > 0.0d) {
                            if ((-((Math.exp(log2 * d20) * d24) + (Math.exp(d19 * log2) * d25))) < d16) {
                                d16 = -d16;
                                d10 = (d24 <= 0.0d || d25 >= 0.0d) ? d10 : 0.0d;
                            }
                        }
                        d10 = Math.log((-((d24 * d20) * d20)) / (d26 * d19)) / d23;
                    }
                    double d27 = d24 * d20;
                    if (Math.abs((Math.exp(d20 * d10) * d27) + (Math.exp(d19 * d10) * d26)) >= 1.0E-4d) {
                        int i10 = 0;
                        while (d21 > 0.001d && i10 < 100) {
                            i10++;
                            double d28 = d19 * d10;
                            double d29 = d20 * d10;
                            double exp = d10 - ((((Math.exp(d29) * d24) + (Math.exp(d28) * d25)) + d16) / ((Math.exp(d29) * d27) + (Math.exp(d28) * d26)));
                            d21 = Math.abs(d10 - exp);
                            d10 = exp;
                        }
                    }
                } else if (d13 < 1.0d) {
                    double d30 = (d14 - (d19 * abs)) / sqrt3;
                    d10 = Math.log(d16 / Math.sqrt((d30 * d30) + (abs * abs))) / d19;
                } else {
                    double d31 = d19 * abs;
                    double d32 = d14 - d31;
                    double log3 = Math.log(Math.abs(d16 / abs)) / d19;
                    double log4 = Math.log(Math.abs(d16 / d32));
                    double d33 = log4;
                    for (int i11 = 0; i11 < 6; i11++) {
                        d33 = log4 - Math.log(Math.abs(d33 / d19));
                    }
                    double d34 = d33 / d19;
                    if ((Double.doubleToRawLongBits(log3) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        log3 = d34;
                    } else if ((Double.doubleToRawLongBits(d34) & Long.MAX_VALUE) < 9218868437227405312L) {
                        log3 = Math.max(log3, d34);
                    }
                    double d35 = (-(d31 + d32)) / (d19 * d32);
                    double d36 = d19 * d35;
                    double exp2 = (Math.exp(d36) * d32 * d35) + (Math.exp(d36) * abs);
                    if (!Double.isNaN(d35) && d35 > 0.0d) {
                        if (d35 <= 0.0d || (-exp2) >= d16) {
                            log3 = (-(2.0d / d19)) - (abs / d32);
                            d10 = log3;
                            i = 0;
                            while (d21 > 0.001d && i < 100) {
                                i++;
                                double d37 = d19 * d10;
                                double exp3 = d10 - (((Math.exp(d37) * ((d32 * d10) + abs)) + d16) / (Math.exp(d37) * (((1 + d37) * d32) + d31)));
                                d21 = Math.abs(d10 - exp3);
                                d10 = exp3;
                            }
                        } else if (d32 < 0.0d && abs > 0.0d) {
                            log3 = 0.0d;
                        }
                    }
                    d16 = -d16;
                    d10 = log3;
                    i = 0;
                    while (d21 > 0.001d) {
                        i++;
                        double d372 = d19 * d10;
                        double exp32 = d10 - (((Math.exp(d372) * ((d32 * d10) + abs)) + d16) / (Math.exp(d372) * (((1 + d372) * d32) + d31)));
                        d21 = Math.abs(d10 - exp32);
                        d10 = exp32;
                    }
                }
                j10 = (long) (d10 * 1000.0d);
            }
        }
        return j10 * 1000000;
    }

    @Override // a0.e0
    public final float c(float f6, float f10, float f11, long j10) {
        e1 e1Var = this.f98b;
        e1Var.f58a = f10;
        return Float.intBitsToFloat((int) (e1Var.a(f6, f11, j10 / 1000000) & 4294967295L));
    }

    @Override // a0.e0
    public final float d(float f6, float f10, float f11) {
        return 0.0f;
    }

    @Override // a0.e0
    public final float e(float f6, float f10, float f11, long j10) {
        e1 e1Var = this.f98b;
        e1Var.f58a = f10;
        return Float.intBitsToFloat((int) (e1Var.a(f6, f11, j10 / 1000000) >> 32));
    }
}
