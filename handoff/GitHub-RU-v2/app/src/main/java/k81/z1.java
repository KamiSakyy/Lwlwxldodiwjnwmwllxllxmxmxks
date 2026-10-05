package k81;

import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes5.dex */
public final class z1 extends h1 {
    public static final z1 c = new z1(a2.a);

    @Override // k81.a
    public final int d(Object obj) {
        long[] jArr = ((w61.w) obj).r;
        k71.k.g(jArr, "$this$collectionSize");
        return jArr.length;
    }

    @Override // k81.s, k81.a
    public final void f(j81.a aVar, int i, Object obj) {
        y1 y1Var = (y1) obj;
        k71.k.g(y1Var, "builder");
        long o = aVar.q(this.b, i).o();
        y1Var.b(y1Var.d() + 1);
        long[] jArr = y1Var.a;
        int i2 = y1Var.b;
        y1Var.b = i2 + 1;
        jArr[i2] = o;
    }

    @Override // k81.a
    public final Object g(Object obj) {
        long[] jArr = ((w61.w) obj).r;
        k71.k.g(jArr, "$this$toBuilder");
        y1 y1Var = new y1();
        y1Var.a = jArr;
        y1Var.b = jArr.length;
        y1Var.b(10);
        return y1Var;
    }

    @Override // k81.h1
    public final Object j() {
        return new w61.w(new long[0]);
    }

    @Override // k81.h1
    public final void k(d5 d5Var, Object obj, int i) {
        long[] jArr = ((w61.w) obj).r;
        k71.k.g(d5Var, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            d5Var.E(this.b, i2).o(jArr[i2]);
        }
    }
}
