package androidx.compose.runtime;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1737a;

    /* renamed from: b, reason: collision with root package name */
    public int f1738b;

    public o0() {
        this.f1737a = new int[10];
    }

    public int a(int i) {
        int i10 = this.f1738b - 1;
        return i10 >= 0 ? this.f1737a[i10] : i;
    }

    public int b() {
        int[] iArr = this.f1737a;
        int i = this.f1738b - 1;
        this.f1738b = i;
        return iArr[i];
    }

    public void c(int i) {
        int[] iArr = this.f1737a;
        if (this.f1738b >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            k71.k.f(iArr, "copyOf(...)");
            this.f1737a = iArr;
        }
        int i10 = this.f1738b;
        this.f1738b = i10 + 1;
        iArr[i10] = i;
    }

    public void d(int i, int i10, int i11) {
        int i12 = this.f1738b;
        int[] iArr = this.f1737a;
        int i13 = i12 + 3;
        if (i13 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            k71.k.f(iArr, "copyOf(...)");
            this.f1737a = iArr;
        }
        iArr[i12] = i + i11;
        iArr[i12 + 1] = i10 + i11;
        iArr[i12 + 2] = i11;
        this.f1738b = i13;
    }

    public void e(int i, int i10, int i11, int i12) {
        int i13 = this.f1738b;
        int[] iArr = this.f1737a;
        int i14 = i13 + 4;
        if (i14 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            k71.k.f(iArr, "copyOf(...)");
            this.f1737a = iArr;
        }
        iArr[i13] = i;
        iArr[i13 + 1] = i10;
        iArr[i13 + 2] = i11;
        iArr[i13 + 3] = i12;
        this.f1738b = i14;
    }

    public void f(int i, int i10) {
        if (i < i10) {
            int i11 = i - 3;
            for (int i12 = i; i12 < i10; i12 += 3) {
                int[] iArr = this.f1737a;
                int i13 = iArr[i12];
                int i14 = iArr[i10];
                if (i13 < i14 || (i13 == i14 && iArr[i12 + 1] <= iArr[i10 + 1])) {
                    i11 += 3;
                    g(i11, i12);
                }
            }
            g(i11 + 3, i10);
            f(i, i11);
            f(i11 + 6, i10);
        }
    }

    public void g(int i, int i10) {
        int[] iArr = this.f1737a;
        int i11 = iArr[i];
        iArr[i] = iArr[i10];
        iArr[i10] = i11;
        int i12 = i + 1;
        int i13 = i10 + 1;
        int i14 = iArr[i12];
        iArr[i12] = iArr[i13];
        iArr[i13] = i14;
        int i15 = i + 2;
        int i16 = i10 + 2;
        int i17 = iArr[i15];
        iArr[i15] = iArr[i16];
        iArr[i16] = i17;
    }

    public o0(int i) {
        this.f1737a = new int[i];
    }
}
