package b4;

import java.lang.reflect.Array;

/* loaded from: /home/user/work/p/classes.dex */
public final class i extends com.google.common.util.concurrent.a {

    /* renamed from: a, reason: collision with root package name */
    public double[] f3430a;

    /* renamed from: b, reason: collision with root package name */
    public double[][] f3431b;

    /* renamed from: c, reason: collision with root package name */
    public double[][] f3432c;

    /* renamed from: d, reason: collision with root package name */
    public double[] f3433d;

    public i(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f3433d = new double[length2];
        int i = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i10 = 0; i10 < length2; i10++) {
            int i11 = 0;
            while (i11 < i) {
                int i12 = i11 + 1;
                double d10 = dArr[i12] - dArr[i11];
                double[] dArr5 = dArr3[i11];
                double d11 = (dArr2[i12][i10] - dArr2[i11][i10]) / d10;
                dArr5[i10] = d11;
                if (i11 == 0) {
                    dArr4[i11][i10] = d11;
                } else {
                    dArr4[i11][i10] = (dArr3[i11 - 1][i10] + d11) * 0.5d;
                }
                i11 = i12;
            }
            dArr4[i][i10] = dArr3[length - 2][i10];
        }
        for (int i13 = 0; i13 < i; i13++) {
            for (int i14 = 0; i14 < length2; i14++) {
                double d12 = dArr3[i13][i14];
                if (d12 == 0.0d) {
                    dArr4[i13][i14] = 0.0d;
                    dArr4[i13 + 1][i14] = 0.0d;
                } else {
                    double d13 = dArr4[i13][i14] / d12;
                    int i15 = i13 + 1;
                    double d14 = dArr4[i15][i14] / d12;
                    double hypot = Math.hypot(d13, d14);
                    if (hypot > 9.0d) {
                        double d15 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i13];
                        double[] dArr7 = dArr3[i13];
                        dArr6[i14] = d13 * d15 * dArr7[i14];
                        dArr4[i15][i14] = d15 * d14 * dArr7[i14];
                    }
                }
            }
        }
        this.f3430a = dArr;
        this.f3431b = dArr2;
        this.f3432c = dArr4;
    }

    public static double c0(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d11 * 6.0d;
        double d18 = 6.0d * d16 * d12;
        double d19 = (d18 + ((d17 * d13) + (((-6.0d) * d16) * d13))) - (d17 * d12);
        double d20 = 3.0d * d10;
        return (d10 * d14) + (((((d20 * d14) * d16) + (((d20 * d15) * d16) + d19)) - (((2.0d * d10) * d15) * d11)) - (((4.0d * d10) * d14) * d11));
    }

    public static double e0(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d16 * d11;
        double d18 = 3.0d * d16;
        double d19 = d17 * 2.0d * d12;
        double d20 = ((d19 + ((d18 * d13) + (((-2.0d) * d17) * d13))) - (d18 * d12)) + d12;
        double d21 = d10 * d15;
        double d22 = (d21 * d17) + d20;
        double d23 = d10 * d14;
        return (d23 * d11) + ((((d17 * d23) + d22) - (d21 * d16)) - (((d10 * 2.0d) * d14) * d16));
    }

    public final void A(double d10, double[] dArr) {
        double[] dArr2 = this.f3430a;
        int length = dArr2.length;
        double[][] dArr3 = this.f3431b;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        if (d10 > d11) {
            d11 = dArr2[length - 1];
            if (d10 < d11) {
                d11 = d10;
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i10 = i + 1;
            double d12 = dArr2[i10];
            if (d11 <= d12) {
                double d13 = dArr2[i];
                double d14 = d12 - d13;
                double d15 = (d11 - d13) / d14;
                for (int i11 = 0; i11 < length2; i11++) {
                    double d16 = dArr3[i][i11];
                    double d17 = dArr3[i10][i11];
                    double[][] dArr4 = this.f3432c;
                    dArr[i11] = c0(d14, d15, d16, d17, dArr4[i][i11], dArr4[i10][i11]) / d14;
                }
                return;
            }
            i = i10;
        }
    }

    public final double[] B() {
        return this.f3430a;
    }

    public final double d0(double d10) {
        double[] dArr = this.f3430a;
        int length = dArr.length;
        double d11 = dArr[0];
        if (d10 >= d11) {
            d11 = dArr[length - 1];
            if (d10 < d11) {
                d11 = d10;
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i10 = i + 1;
            double d12 = dArr[i10];
            if (d11 <= d12) {
                double d13 = dArr[i];
                double d14 = d12 - d13;
                double[][] dArr2 = this.f3431b;
                double d15 = dArr2[i][0];
                double d16 = dArr2[i10][0];
                double[][] dArr3 = this.f3432c;
                return c0(d14, (d11 - d13) / d14, d15, d16, dArr3[i][0], dArr3[i10][0]) / d14;
            }
            i = i10;
        }
        return 0.0d;
    }

    public final double x(double d10) {
        double d11;
        double d12;
        double d02;
        double[] dArr = this.f3430a;
        int length = dArr.length;
        double d13 = dArr[0];
        double[][] dArr2 = this.f3431b;
        if (d10 <= d13) {
            d11 = dArr2[0][0];
            d12 = d10 - d13;
            d02 = d0(d13);
        } else {
            int i = length - 1;
            double d14 = dArr[i];
            if (d10 < d14) {
                int i10 = 0;
                while (i10 < i) {
                    double d15 = dArr[i10];
                    if (d10 == d15) {
                        return dArr2[i10][0];
                    }
                    int i11 = i10 + 1;
                    double d16 = dArr[i11];
                    if (d10 < d16) {
                        double d17 = d16 - d15;
                        double d18 = (d10 - d15) / d17;
                        double d19 = dArr2[i10][0];
                        double d20 = dArr2[i11][0];
                        double[][] dArr3 = this.f3432c;
                        return e0(d17, d18, d19, d20, dArr3[i10][0], dArr3[i11][0]);
                    }
                    i10 = i11;
                }
                return 0.0d;
            }
            d11 = dArr2[i][0];
            d12 = d10 - d14;
            d02 = d0(d14);
        }
        return (d02 * d12) + d11;
    }

    public final void y(double d10, double[] dArr) {
        double[] dArr2 = this.f3430a;
        int length = dArr2.length;
        double[][] dArr3 = this.f3431b;
        int i = 0;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        double[] dArr4 = this.f3433d;
        if (d10 <= d11) {
            A(d11, dArr4);
            for (int i10 = 0; i10 < length2; i10++) {
                dArr[i10] = ((d10 - dArr2[0]) * dArr4[i10]) + dArr3[0][i10];
            }
            return;
        }
        int i11 = length - 1;
        double d12 = dArr2[i11];
        if (d10 >= d12) {
            A(d12, dArr4);
            while (i < length2) {
                dArr[i] = ((d10 - dArr2[i11]) * dArr4[i]) + dArr3[i11][i];
                i++;
            }
            return;
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d10 == dArr2[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = dArr3[i12][i13];
                }
            }
            int i14 = i12 + 1;
            double d13 = dArr2[i14];
            if (d10 < d13) {
                double d14 = dArr2[i12];
                double d15 = d13 - d14;
                double d16 = (d10 - d14) / d15;
                while (i < length2) {
                    double d17 = dArr3[i12][i];
                    double d18 = dArr3[i14][i];
                    double[][] dArr5 = this.f3432c;
                    dArr[i] = e0(d15, d16, d17, d18, dArr5[i12][i], dArr5[i14][i]);
                    i++;
                }
                return;
            }
            i12 = i14;
        }
    }

    public final void z(double d10, float[] fArr) {
        double[] dArr = this.f3430a;
        int length = dArr.length;
        double[][] dArr2 = this.f3431b;
        int i = 0;
        int length2 = dArr2[0].length;
        double d11 = dArr[0];
        double[] dArr3 = this.f3433d;
        if (d10 <= d11) {
            A(d11, dArr3);
            for (int i10 = 0; i10 < length2; i10++) {
                fArr[i10] = (float) (((d10 - dArr[0]) * dArr3[i10]) + dArr2[0][i10]);
            }
            return;
        }
        int i11 = length - 1;
        double d12 = dArr[i11];
        if (d10 >= d12) {
            A(d12, dArr3);
            while (i < length2) {
                fArr[i] = (float) (((d10 - dArr[i11]) * dArr3[i]) + dArr2[i11][i]);
                i++;
            }
            return;
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d10 == dArr[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) dArr2[i12][i13];
                }
            }
            int i14 = i12 + 1;
            double d13 = dArr[i14];
            if (d10 < d13) {
                double d14 = dArr[i12];
                double d15 = d13 - d14;
                double d16 = (d10 - d14) / d15;
                while (i < length2) {
                    double d17 = dArr2[i12][i];
                    double d18 = dArr2[i14][i];
                    double[][] dArr4 = this.f3432c;
                    fArr[i] = (float) e0(d15, d16, d17, d18, dArr4[i12][i], dArr4[i14][i]);
                    i++;
                }
                return;
            }
            i12 = i14;
        }
    }
}
