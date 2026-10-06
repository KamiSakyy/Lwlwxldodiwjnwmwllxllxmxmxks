package k81;

import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes5.dex */
public final class o1 extends h1Shadow {
    public static final o1 c = new o1(p1.a);

    @Override // k81.a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        k71.k.g(sArr, "<this>");
        return sArr.length;
    }

    @Override // k81.s, k81.a
    public final void f(j81.a aVar, int i, Object obj) {
        n1 n1Var = (n1) obj;
        k71.k.g(n1Var, "builder");
        short j = aVar.j(this.b, i);
        n1Var.b(n1Var.d() + 1);
        short[] sArr = n1Var.a;
        int i2 = n1Var.b;
        n1Var.b = i2 + 1;
        sArr[i2] = j;
    }

    @Override // k81.a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        k71.k.g(sArr, "<this>");
        n1 n1Var = new n1();
        n1Var.a = sArr;
        n1Var.b = sArr.length;
        n1Var.b(10);
        return n1Var;
    }

    @Override // k81.h1
    public final Object j() {
        return new short[0];
    }

    @Override // k81.h1
    public final void k(d5 d5Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        k71.k.g(d5Var, "encoder");
        k71.k.g(sArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            g1 g1Var = this.b;
            k71.k.g(g1Var, "descriptor");
            d5Var.D(g1Var, i2);
            d5Var.e(s);
        }
    }
}
