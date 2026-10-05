package k81;

import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes5.dex */
public final class k0 extends h1 {
    public static final k0 c = new k0(l0.a);

    @Override // k81.a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        k71.k.g(iArr, "<this>");
        return iArr.length;
    }

    @Override // k81.s, k81.a
    public final void f(j81.a aVar, int i, Object obj) {
        j0 j0Var = (j0) obj;
        k71.k.g(j0Var, "builder");
        int m = aVar.m(this.b, i);
        j0Var.b(j0Var.d() + 1);
        int[] iArr = j0Var.a;
        int i2 = j0Var.b;
        j0Var.b = i2 + 1;
        iArr[i2] = m;
    }

    @Override // k81.a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        k71.k.g(iArr, "<this>");
        j0 j0Var = new j0();
        j0Var.a = iArr;
        j0Var.b = iArr.length;
        j0Var.b(10);
        return j0Var;
    }

    @Override // k81.h1
    public final Object j() {
        return new int[0];
    }

    @Override // k81.h1
    public final void k(d5 d5Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        k71.k.g(d5Var, "encoder");
        k71.k.g(iArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            d5Var.F(i2, iArr[i2], this.b);
        }
    }
}
