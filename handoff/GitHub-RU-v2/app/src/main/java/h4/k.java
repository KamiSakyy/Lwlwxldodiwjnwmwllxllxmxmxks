package h4;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public com.google.common.util.concurrent.a f25505a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f25506b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    public float[] f25507c = new float[10];

    /* renamed from: d, reason: collision with root package name */
    public int f25508d;

    /* renamed from: e, reason: collision with root package name */
    public String f25509e;

    public final float a(float f6) {
        return (float) this.f25505a.x(f6);
    }

    public void b(int i, float f6) {
        int[] iArr = this.f25506b;
        if (iArr.length < this.f25508d + 1) {
            this.f25506b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f25507c;
            this.f25507c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f25506b;
        int i10 = this.f25508d;
        iArr2[i10] = i;
        this.f25507c[i10] = f6;
        this.f25508d = i10 + 1;
    }

    public abstract void c(View view, float f6);

    public void d(int i) {
        int i10;
        int i11 = this.f25508d;
        if (i11 == 0) {
            return;
        }
        int[] iArr = this.f25506b;
        float[] fArr = this.f25507c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i11 - 1;
        iArr2[1] = 0;
        int i12 = 2;
        while (i12 > 0) {
            int i13 = i12 - 1;
            int i14 = iArr2[i13];
            int i15 = i12 - 2;
            int i16 = iArr2[i15];
            if (i14 < i16) {
                int i17 = iArr[i16];
                int i18 = i14;
                int i19 = i18;
                while (i18 < i16) {
                    int i20 = iArr[i18];
                    if (i20 <= i17) {
                        int i21 = iArr[i19];
                        iArr[i19] = i20;
                        iArr[i18] = i21;
                        float f6 = fArr[i19];
                        fArr[i19] = fArr[i18];
                        fArr[i18] = f6;
                        i19++;
                    }
                    i18++;
                }
                int i22 = iArr[i19];
                iArr[i19] = iArr[i16];
                iArr[i16] = i22;
                float f10 = fArr[i19];
                fArr[i19] = fArr[i16];
                fArr[i16] = f10;
                iArr2[i15] = i19 - 1;
                iArr2[i13] = i14;
                int i23 = i12 + 1;
                iArr2[i12] = i16;
                i12 += 2;
                iArr2[i23] = i19 + 1;
            } else {
                i12 = i15;
            }
        }
        int i24 = 1;
        for (int i25 = 1; i25 < this.f25508d; i25++) {
            int[] iArr3 = this.f25506b;
            if (iArr3[i25 - 1] != iArr3[i25]) {
                i24++;
            }
        }
        double[] dArr = new double[i24];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i24, 1);
        int i26 = 0;
        for (i10 = 0; i10 < this.f25508d; i10++) {
            if (i10 > 0) {
                int[] iArr4 = this.f25506b;
                i10 = iArr4[i10] == iArr4[i10 - 1] ? i10 + 1 : 0;
            }
            dArr[i26] = this.f25506b[i10] * 0.01d;
            dArr2[i26][0] = this.f25507c[i10];
            i26++;
        }
        this.f25505a = com.google.common.util.concurrent.a.r(i, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f25509e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f25508d; i++) {
            str = str + "[" + this.f25506b[i] + " , " + decimalFormat.format(this.f25507c[i]) + "] ";
        }
        return str;
    }
}
