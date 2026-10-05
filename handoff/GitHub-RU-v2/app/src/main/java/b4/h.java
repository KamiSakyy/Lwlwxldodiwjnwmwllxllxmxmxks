package b4;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends com.google.common.util.concurrent.a {

    /* renamed from: a, reason: collision with root package name */
    public double[] f3427a;

    /* renamed from: b, reason: collision with root package name */
    public double[][] f3428b;

    /* renamed from: c, reason: collision with root package name */
    public double[] f3429c;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0017, code lost:
    
        if (r12 >= r5) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(double d10, double[] dArr) {
        double[] dArr2 = this.f3427a;
        int length = dArr2.length;
        double[][] dArr3 = this.f3428b;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        if (d10 > d11) {
            d11 = dArr2[length - 1];
        }
        d10 = d11;
        int i = 0;
        while (i < length - 1) {
            int i10 = i + 1;
            double d12 = dArr2[i10];
            if (d10 <= d12) {
                double d13 = d12 - dArr2[i];
                for (int i11 = 0; i11 < length2; i11++) {
                    dArr[i11] = (dArr3[i10][i11] - dArr3[i][i11]) / d13;
                }
                return;
            }
            i = i10;
        }
    }

    public final double[] B() {
        return this.f3427a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0012, code lost:
    
        if (r9 >= r3) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double c0(double d10) {
        double[] dArr = this.f3427a;
        int length = dArr.length;
        double d11 = dArr[0];
        if (d10 >= d11) {
            d11 = dArr[length - 1];
        }
        d10 = d11;
        int i = 0;
        while (i < length - 1) {
            int i10 = i + 1;
            double d12 = dArr[i10];
            if (d10 <= d12) {
                double d13 = d12 - dArr[i];
                double[][] dArr2 = this.f3428b;
                return (dArr2[i10][0] - dArr2[i][0]) / d13;
            }
            i = i10;
        }
        return 0.0d;
    }

    public final double x(double d10) {
        double d11;
        double d12;
        double c02;
        double[][] dArr = this.f3428b;
        double[] dArr2 = this.f3427a;
        int length = dArr2.length;
        double d13 = dArr2[0];
        if (d10 <= d13) {
            d11 = dArr[0][0];
            d12 = d10 - d13;
            c02 = c0(d13);
        } else {
            int i = length - 1;
            double d14 = dArr2[i];
            if (d10 < d14) {
                int i10 = 0;
                while (i10 < i) {
                    double d15 = dArr2[i10];
                    if (d10 == d15) {
                        return dArr[i10][0];
                    }
                    int i11 = i10 + 1;
                    double d16 = dArr2[i11];
                    if (d10 < d16) {
                        double d17 = (d10 - d15) / (d16 - d15);
                        return (dArr[i11][0] * d17) + ((1.0d - d17) * dArr[i10][0]);
                    }
                    i10 = i11;
                }
                return 0.0d;
            }
            d11 = dArr[i][0];
            d12 = d10 - d14;
            c02 = c0(d14);
        }
        return (c02 * d12) + d11;
    }

    public final void y(double d10, double[] dArr) {
        double[] dArr2 = this.f3429c;
        double[] dArr3 = this.f3427a;
        int length = dArr3.length;
        double[][] dArr4 = this.f3428b;
        int i = 0;
        int length2 = dArr4[0].length;
        double d11 = dArr3[0];
        if (d10 <= d11) {
            A(d11, dArr2);
            for (int i10 = 0; i10 < length2; i10++) {
                dArr[i10] = ((d10 - dArr3[0]) * dArr2[i10]) + dArr4[0][i10];
            }
            return;
        }
        int i11 = length - 1;
        double d12 = dArr3[i11];
        if (d10 >= d12) {
            A(d12, dArr2);
            while (i < length2) {
                dArr[i] = ((d10 - dArr3[i11]) * dArr2[i]) + dArr4[i11][i];
                i++;
            }
            return;
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d10 == dArr3[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = dArr4[i12][i13];
                }
            }
            int i14 = i12 + 1;
            double d13 = dArr3[i14];
            if (d10 < d13) {
                double d14 = dArr3[i12];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i < length2) {
                    dArr[i] = (dArr4[i14][i] * d15) + ((1.0d - d15) * dArr4[i12][i]);
                    i++;
                }
                return;
            }
            i12 = i14;
        }
    }

    public final void z(double d10, float[] fArr) {
        double[] dArr = this.f3429c;
        double[] dArr2 = this.f3427a;
        int length = dArr2.length;
        double[][] dArr3 = this.f3428b;
        int i = 0;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        if (d10 <= d11) {
            A(d11, dArr);
            for (int i10 = 0; i10 < length2; i10++) {
                fArr[i10] = (float) (((d10 - dArr2[0]) * dArr[i10]) + dArr3[0][i10]);
            }
            return;
        }
        int i11 = length - 1;
        double d12 = dArr2[i11];
        if (d10 >= d12) {
            A(d12, dArr);
            while (i < length2) {
                fArr[i] = (float) (((d10 - dArr2[i11]) * dArr[i]) + dArr3[i11][i]);
                i++;
            }
            return;
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d10 == dArr2[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) dArr3[i12][i13];
                }
            }
            int i14 = i12 + 1;
            double d13 = dArr2[i14];
            if (d10 < d13) {
                double d14 = dArr2[i12];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i < length2) {
                    fArr[i] = (float) ((dArr3[i14][i] * d15) + ((1.0d - d15) * dArr3[i12][i]));
                    i++;
                }
                return;
            }
            i12 = i14;
        }
    }
}
