package h4;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public com.google.common.util.concurrent.a f25514a;

    /* renamed from: e, reason: collision with root package name */
    public int f25518e;

    /* renamed from: f, reason: collision with root package name */
    public String f25519f;
    public long i;

    /* renamed from: b, reason: collision with root package name */
    public int f25515b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int[] f25516c = new int[10];

    /* renamed from: d, reason: collision with root package name */
    public float[][] f25517d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* renamed from: g, reason: collision with root package name */
    public float[] f25520g = new float[3];

    /* renamed from: h, reason: collision with root package name */
    public boolean f25521h = false;

    /* renamed from: j, reason: collision with root package name */
    public float f25522j = Float.NaN;

    public final float a(float f6) {
        float abs;
        switch (this.f25515b) {
            case 1:
                return Math.signum(f6 * 6.2831855f);
            case 2:
                abs = Math.abs(f6);
                break;
            case 3:
                return (((f6 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f6 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f6 * 6.2831855f);
            case 6:
                float abs2 = 1.0f - Math.abs(((f6 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f6 * 6.2831855f);
        }
        return 1.0f - abs;
    }

    public final float b(float f6, long j10, View view, b4.e eVar) {
        this.f25514a.z(f6, this.f25520g);
        float[] fArr = this.f25520g;
        boolean z10 = true;
        float f10 = fArr[1];
        if (f10 == 0.0f) {
            this.f25521h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f25522j)) {
            float c10 = eVar.c(view, this.f25519f);
            this.f25522j = c10;
            if (Float.isNaN(c10)) {
                this.f25522j = 0.0f;
            }
        }
        float f11 = (float) (((((j10 - this.i) * 1.0E-9d) * f10) + this.f25522j) % 1.0d);
        this.f25522j = f11;
        String str = this.f25519f;
        HashMap hashMap = (HashMap) eVar.f3413b;
        if (hashMap.containsKey(view)) {
            HashMap hashMap2 = (HashMap) hashMap.get(view);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
            }
            if (hashMap2.containsKey(str)) {
                float[] fArr2 = (float[]) hashMap2.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f11;
                hashMap2.put(str, fArr2);
            } else {
                hashMap2.put(str, new float[]{f11});
                hashMap.put(view, hashMap2);
            }
        } else {
            HashMap hashMap3 = new HashMap();
            hashMap3.put(str, new float[]{f11});
            hashMap.put(view, hashMap3);
        }
        this.i = j10;
        float f12 = this.f25520g[0];
        float a10 = (a(this.f25522j) * f12) + this.f25520g[2];
        if (f12 == 0.0f && f10 == 0.0f) {
            z10 = false;
        }
        this.f25521h = z10;
        return a10;
    }

    public void c(int i, float f6, float f10, int i10, float f11) {
        int[] iArr = this.f25516c;
        int i11 = this.f25518e;
        iArr[i11] = i;
        float[] fArr = this.f25517d[i11];
        fArr[0] = f6;
        fArr[1] = f10;
        fArr[2] = f11;
        this.f25515b = Math.max(this.f25515b, i10);
        this.f25518e++;
    }

    public abstract boolean d(float f6, long j10, View view, b4.e eVar);

    public void e(int i) {
        float[][] fArr = this.f25517d;
        int[] iArr = this.f25516c;
        int i10 = this.f25518e;
        if (i10 == 0) {
            System.err.println("Error no points added to " + this.f25519f);
            return;
        }
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i10 - 1;
        iArr2[1] = 0;
        int i11 = 2;
        while (i11 > 0) {
            int i12 = i11 - 1;
            int i13 = iArr2[i12];
            int i14 = i11 - 2;
            int i15 = iArr2[i14];
            if (i13 < i15) {
                int i16 = iArr[i15];
                int i17 = i13;
                int i18 = i17;
                while (i17 < i15) {
                    int i19 = iArr[i17];
                    if (i19 <= i16) {
                        int i20 = iArr[i18];
                        iArr[i18] = i19;
                        iArr[i17] = i20;
                        float[] fArr2 = fArr[i18];
                        fArr[i18] = fArr[i17];
                        fArr[i17] = fArr2;
                        i18++;
                    }
                    i17++;
                }
                int i21 = iArr[i18];
                iArr[i18] = iArr[i15];
                iArr[i15] = i21;
                float[] fArr3 = fArr[i18];
                fArr[i18] = fArr[i15];
                fArr[i15] = fArr3;
                iArr2[i14] = i18 - 1;
                iArr2[i12] = i13;
                int i22 = i11 + 1;
                iArr2[i11] = i15;
                i11 += 2;
                iArr2[i22] = i18 + 1;
            } else {
                i11 = i14;
            }
        }
        int i23 = 0;
        for (int i24 = 1; i24 < iArr.length; i24++) {
            if (iArr[i24] != iArr[i24 - 1]) {
                i23++;
            }
        }
        if (i23 == 0) {
            i23 = 1;
        }
        double[] dArr = new double[i23];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i23, 3);
        int i25 = 0;
        for (int i26 = 0; i26 < this.f25518e; i26++) {
            if (i26 <= 0 || iArr[i26] != iArr[i26 - 1]) {
                dArr[i25] = iArr[i26] * 0.01d;
                double[] dArr3 = dArr2[i25];
                float[] fArr4 = fArr[i26];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i25++;
            }
        }
        this.f25514a = com.google.common.util.concurrent.a.r(i, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f25519f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f25518e; i++) {
            str = str + "[" + this.f25516c[i] + " , " + decimalFormat.format(this.f25517d[i]) + "] ";
        }
        return str;
    }
}
