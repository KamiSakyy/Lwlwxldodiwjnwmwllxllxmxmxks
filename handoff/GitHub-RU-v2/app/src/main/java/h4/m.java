package h4;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* loaded from: /home/user/work/p/classes.dex */
public final class m extends p {

    /* renamed from: k, reason: collision with root package name */
    public String f25511k;
    public SparseArray l;
    public SparseArray m;

    /* renamed from: n, reason: collision with root package name */
    public float[] f25512n;

    @Override // h4.p
    public final void c(int i, float f6, float f10, int i10, float f11) {
        throw new RuntimeException("Wrong call for custom attribute");
    }

    @Override // h4.p
    public final boolean d(float f6, long j10, View view, b4.e eVar) {
        this.f25514a.z(f6, this.f25512n);
        float[] fArr = this.f25512n;
        float f10 = fArr[fArr.length - 2];
        float f11 = fArr[fArr.length - 1];
        long j11 = j10 - this.i;
        if (Float.isNaN(this.f25522j)) {
            float c10 = eVar.c(view, this.f25511k);
            this.f25522j = c10;
            if (Float.isNaN(c10)) {
                this.f25522j = 0.0f;
            }
        }
        float f12 = (float) ((((j11 * 1.0E-9d) * f10) + this.f25522j) % 1.0d);
        this.f25522j = f12;
        this.i = j10;
        float a10 = a(f12);
        this.f25521h = false;
        int i = 0;
        while (true) {
            float[] fArr2 = this.f25520g;
            if (i >= fArr2.length) {
                break;
            }
            boolean z10 = this.f25521h;
            float f13 = this.f25512n[i];
            this.f25521h = z10 | (((double) f13) != 0.0d);
            fArr2[i] = (f13 * a10) + f11;
            i++;
        }
        i21.a.E((j4.a) this.l.valueAt(0), view, this.f25520g);
        if (f10 != 0.0f) {
            this.f25521h = true;
        }
        return this.f25521h;
    }

    @Override // h4.p
    public final void e(int i) {
        SparseArray sparseArray = this.l;
        int size = sparseArray.size();
        int c10 = ((j4.a) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        int i10 = c10 + 2;
        this.f25512n = new float[i10];
        this.f25520g = new float[c10];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i10);
        for (int i11 = 0; i11 < size; i11++) {
            int keyAt = sparseArray.keyAt(i11);
            j4.a aVar = (j4.a) sparseArray.valueAt(i11);
            float[] fArr = (float[]) this.m.valueAt(i11);
            dArr[i11] = keyAt * 0.01d;
            aVar.b(this.f25512n);
            int i12 = 0;
            while (true) {
                if (i12 < this.f25512n.length) {
                    dArr2[i11][i12] = r10[i12];
                    i12++;
                }
            }
            double[] dArr3 = dArr2[i11];
            dArr3[c10] = fArr[0];
            dArr3[c10 + 1] = fArr[1];
        }
        this.f25514a = com.google.common.util.concurrent.a.r(i, dArr, dArr2);
    }
}
