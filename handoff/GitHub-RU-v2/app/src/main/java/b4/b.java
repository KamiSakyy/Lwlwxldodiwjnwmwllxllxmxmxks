package b4;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes.dex */
public final class b extends com.google.common.util.concurrent.a {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f3402a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f3403b;

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0030, code lost:
    
        if (r5 == r3) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [b4.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(int[] iArr, double[] dArr, double[][] dArr2) {
        double d10;
        double d11;
        boolean z10;
        int i;
        double[] dArr3;
        double d12;
        double[] dArr4 = dArr;
        ?? obj = new Object();
        obj.f3402a = dArr4;
        int i10 = 1;
        obj.f3403b = new a[dArr4.length - 1];
        char c10 = 0;
        int i11 = 0;
        int i12 = 1;
        int i13 = 1;
        b bVar = obj;
        while (true) {
            a[] aVarArr = bVar.f3403b;
            if (i11 >= aVarArr.length) {
                return;
            }
            int i14 = iArr[i11];
            if (i14 != 0) {
                if (i14 != i10) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                i13 = 4;
                            } else if (i14 == 5) {
                                i13 = 5;
                            }
                        }
                    }
                    i12 = 2;
                    i13 = i12;
                }
                i12 = i10;
                i13 = i12;
            } else {
                i13 = 3;
            }
            double d13 = dArr4[i11];
            int i15 = i11 + 1;
            double d14 = dArr4[i15];
            double[] dArr5 = dArr2[i11];
            double d15 = dArr5[c10];
            int i16 = i10;
            int i17 = i11;
            double d16 = dArr5[i16];
            double[] dArr6 = dArr2[i15];
            boolean z11 = c10;
            double d17 = dArr6[z11 ? 1 : 0];
            double d18 = dArr6[i16];
            a aVar = new a();
            aVar.f3401r = z11;
            int i18 = i12;
            double d19 = d17 - d15;
            double d20 = d18 - d16;
            boolean z12 = i16;
            if (i13 != z12) {
                if (i13 == 4) {
                    aVar.f3400q = d20 > 0.0d;
                } else if (i13 != 5) {
                    aVar.f3400q = false;
                } else {
                    aVar.f3400q = d20 < 0.0d;
                }
                d10 = d19;
                d11 = d13;
                z10 = true;
            } else {
                aVar.f3400q = z12;
                d10 = d19;
                d11 = d13;
                z10 = z12;
            }
            aVar.f3389c = d11;
            aVar.f3390d = d14;
            double d21 = d14 - d11;
            double d22 = 1.0d / d21;
            aVar.i = d22;
            if (3 == i13) {
                aVar.f3401r = z10;
            }
            if (aVar.f3401r || Math.abs(d10) < 0.001d || Math.abs(d20) < 0.001d) {
                i = 1;
                aVar.f3401r = true;
                aVar.f3391e = d15;
                aVar.f3392f = d17;
                aVar.f3393g = d16;
                aVar.f3394h = d18;
                double d23 = d10;
                double hypot = Math.hypot(d20, d23);
                aVar.f3388b = hypot;
                aVar.f3397n = hypot * d22;
                aVar.l = d23 / d21;
                aVar.m = d20 / d21;
            } else {
                double[] dArr7 = new double[101];
                aVar.f3387a = dArr7;
                boolean z13 = aVar.f3400q;
                aVar.f3395j = (z13 ? -1 : 1) * d10;
                aVar.f3396k = (z13 ? 1 : -1) * d20;
                aVar.l = z13 ? d17 : d15;
                aVar.m = z13 ? d16 : d18;
                double d24 = d16 - d18;
                double d25 = 0.0d;
                double d26 = 0.0d;
                double d27 = 0.0d;
                int i19 = 0;
                while (true) {
                    dArr3 = a.f3386s;
                    if (i19 >= 91) {
                        break;
                    }
                    double[] dArr8 = dArr7;
                    double d28 = d24;
                    double radians = Math.toRadians((i19 * 90.0d) / 90);
                    double sin = d10 * Math.sin(radians);
                    double cos = Math.cos(radians) * d28;
                    if (i19 > 0) {
                        d12 = cos;
                        d25 += Math.hypot(sin - d26, d12 - d27);
                        dArr3[i19] = d25;
                    } else {
                        d12 = cos;
                    }
                    i19++;
                    d26 = sin;
                    d24 = d28;
                    d27 = d12;
                    dArr7 = dArr8;
                }
                double[] dArr9 = dArr7;
                aVar.f3388b = d25;
                for (int i20 = 0; i20 < 91; i20++) {
                    dArr3[i20] = dArr3[i20] / d25;
                }
                for (int i21 = 0; i21 < 101; i21++) {
                    double d29 = i21 / 100;
                    int binarySearch = Arrays.binarySearch(dArr3, d29);
                    if (binarySearch >= 0) {
                        dArr9[i21] = binarySearch / 90;
                    } else if (binarySearch == -1) {
                        dArr9[i21] = 0.0d;
                    } else {
                        int i22 = -binarySearch;
                        int i23 = i22 - 2;
                        double d30 = dArr3[i23];
                        dArr9[i21] = (((d29 - d30) / (dArr3[i22 - 1] - d30)) + i23) / 90;
                    }
                }
                aVar.f3397n = aVar.f3388b * aVar.i;
                i = 1;
            }
            aVarArr[i17] = aVar;
            bVar = this;
            dArr4 = dArr;
            i10 = i;
            i11 = i15;
            i12 = i18;
            c10 = 0;
        }
    }

    public final void A(double d10, double[] dArr) {
        a[] aVarArr = this.f3403b;
        double d11 = aVarArr[0].f3389c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > aVarArr[aVarArr.length - 1].f3390d) {
            d10 = aVarArr[aVarArr.length - 1].f3390d;
        }
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar = aVarArr[i];
            if (d10 <= aVar.f3390d) {
                if (aVar.f3401r) {
                    dArr[0] = aVar.l;
                    dArr[1] = aVar.m;
                    return;
                } else {
                    aVar.g(d10);
                    dArr[0] = aVarArr[i].a();
                    dArr[1] = aVarArr[i].b();
                    return;
                }
            }
        }
    }

    public final double[] B() {
        return this.f3402a;
    }

    public final double x(double d10) {
        a[] aVarArr = this.f3403b;
        a aVar = aVarArr[0];
        double d11 = aVar.f3389c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (aVar.f3401r) {
                return (d12 * aVarArr[0].l) + aVar.c(d11);
            }
            aVar.g(d11);
            return (aVarArr[0].a() * d12) + aVarArr[0].e();
        }
        if (d10 > aVarArr[aVarArr.length - 1].f3390d) {
            double d13 = aVarArr[aVarArr.length - 1].f3390d;
            double d14 = d10 - d13;
            int length = aVarArr.length - 1;
            return (d14 * aVarArr[length].l) + aVarArr[length].c(d13);
        }
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar2 = aVarArr[i];
            if (d10 <= aVar2.f3390d) {
                if (aVar2.f3401r) {
                    return aVar2.c(d10);
                }
                aVar2.g(d10);
                return aVarArr[i].e();
            }
        }
        return Double.NaN;
    }

    public final void y(double d10, double[] dArr) {
        a[] aVarArr = this.f3403b;
        a aVar = aVarArr[0];
        double d11 = aVar.f3389c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (aVar.f3401r) {
                double c10 = aVar.c(d11);
                a aVar2 = aVarArr[0];
                dArr[0] = (aVar2.l * d12) + c10;
                dArr[1] = (d12 * aVarArr[0].m) + aVar2.d(d11);
                return;
            }
            aVar.g(d11);
            dArr[0] = (aVarArr[0].a() * d12) + aVarArr[0].e();
            dArr[1] = (aVarArr[0].b() * d12) + aVarArr[0].f();
            return;
        }
        if (d10 <= aVarArr[aVarArr.length - 1].f3390d) {
            for (int i = 0; i < aVarArr.length; i++) {
                a aVar3 = aVarArr[i];
                if (d10 <= aVar3.f3390d) {
                    if (aVar3.f3401r) {
                        dArr[0] = aVar3.c(d10);
                        dArr[1] = aVarArr[i].d(d10);
                        return;
                    } else {
                        aVar3.g(d10);
                        dArr[0] = aVarArr[i].e();
                        dArr[1] = aVarArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d13 = aVarArr[aVarArr.length - 1].f3390d;
        double d14 = d10 - d13;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (aVar4.f3401r) {
            double c11 = aVar4.c(d13);
            a aVar5 = aVarArr[length];
            dArr[0] = (aVar5.l * d14) + c11;
            dArr[1] = (d14 * aVarArr[length].m) + aVar5.d(d13);
            return;
        }
        aVar4.g(d10);
        dArr[0] = (aVarArr[length].a() * d14) + aVarArr[length].e();
        dArr[1] = (aVarArr[length].b() * d14) + aVarArr[length].f();
    }

    public final void z(double d10, float[] fArr) {
        a[] aVarArr = this.f3403b;
        a aVar = aVarArr[0];
        double d11 = aVar.f3389c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (aVar.f3401r) {
                double c10 = aVar.c(d11);
                a aVar2 = aVarArr[0];
                fArr[0] = (float) ((aVar2.l * d12) + c10);
                fArr[1] = (float) ((d12 * aVarArr[0].m) + aVar2.d(d11));
                return;
            }
            aVar.g(d11);
            fArr[0] = (float) ((aVarArr[0].a() * d12) + aVarArr[0].e());
            fArr[1] = (float) ((aVarArr[0].b() * d12) + aVarArr[0].f());
            return;
        }
        if (d10 <= aVarArr[aVarArr.length - 1].f3390d) {
            for (int i = 0; i < aVarArr.length; i++) {
                a aVar3 = aVarArr[i];
                if (d10 <= aVar3.f3390d) {
                    if (aVar3.f3401r) {
                        fArr[0] = (float) aVar3.c(d10);
                        fArr[1] = (float) aVarArr[i].d(d10);
                        return;
                    } else {
                        aVar3.g(d10);
                        fArr[0] = (float) aVarArr[i].e();
                        fArr[1] = (float) aVarArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d13 = aVarArr[aVarArr.length - 1].f3390d;
        double d14 = d10 - d13;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (!aVar4.f3401r) {
            aVar4.g(d10);
            fArr[0] = (float) aVarArr[length].e();
            fArr[1] = (float) aVarArr[length].f();
        } else {
            double c11 = aVar4.c(d13);
            a aVar5 = aVarArr[length];
            fArr[0] = (float) ((aVar5.l * d14) + c11);
            fArr[1] = (float) ((d14 * aVarArr[length].m) + aVar5.d(d13));
        }
    }
}
