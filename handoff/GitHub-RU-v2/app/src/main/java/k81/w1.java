package k81;

import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes5.dex */
public final class w1 extends h1 {
    public static final w1 c = new w1(x1.a);

    @Override // k81.a
    public final int d(Object obj) {
        int[] iArr = ((w61.u) obj).r;
        k71.k.g(iArr, "$this$collectionSize");
        return iArr.length;
    }

    @Override // k81.s, k81.a
    public final void f(j81.a aVar, int i, Object obj) {
        v1 v1Var = (v1) obj;
        k71.k.g(v1Var, "builder");
        int l = aVar.q(this.b, i).l();
        v1Var.b(v1Var.d() + 1);
        int[] iArr = v1Var.a;
        int i2 = v1Var.b;
        v1Var.b = i2 + 1;
        iArr[i2] = l;
    }

    @Override // k81.a
    public final Object g(Object obj) {
        int[] iArr = ((w61.u) obj).r;
        k71.k.g(iArr, "$this$toBuilder");
        v1 v1Var = new v1();
        v1Var.a = iArr;
        v1Var.b = iArr.length;
        v1Var.b(10);
        return v1Var;
    }

    @Override // k81.h1
    public final Object j() {
        return new w61.u(new int[0]);
    }

    @Override // k81.h1
    public final void k(d5 d5Var, Object obj, int i) {
        int[] iArr = ((w61.u) obj).r;
        k71.k.g(d5Var, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            d5Var.E(this.b, i2).l(iArr[i2]);
        }
    }
}
