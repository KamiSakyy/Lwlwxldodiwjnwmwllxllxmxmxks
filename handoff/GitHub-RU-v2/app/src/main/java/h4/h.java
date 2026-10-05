package h4;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends k {

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f25502f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f25503g;

    @Override // h4.k
    public final void b(int i, float f6) {
        throw new RuntimeException("call of custom attribute setPoint");
    }

    @Override // h4.k
    public final void c(View view, float f6) {
        this.f25505a.z(f6, this.f25503g);
        i21.a.E((j4.a) this.f25502f.valueAt(0), view, this.f25503g);
    }

    @Override // h4.k
    public final void d(int i) {
        SparseArray sparseArray = this.f25502f;
        int size = sparseArray.size();
        int c10 = ((j4.a) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        this.f25503g = new float[c10];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, c10);
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            j4.a aVar = (j4.a) sparseArray.valueAt(i10);
            dArr[i10] = keyAt * 0.01d;
            aVar.b(this.f25503g);
            int i11 = 0;
            while (true) {
                if (i11 < this.f25503g.length) {
                    dArr2[i10][i11] = r7[i11];
                    i11++;
                }
            }
        }
        this.f25505a = com.google.common.util.concurrent.a.r(i, dArr, dArr2);
    }
}
