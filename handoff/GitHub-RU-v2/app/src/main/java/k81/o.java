package k81;

import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes5.dex */
public final class o extends h1 {
    public static final o c = new o(p.a);

    @Override // k81.a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        k71.k.g(cArr, "<this>");
        return cArr.length;
    }

    @Override // k81.s, k81.a
    public final void f(j81.a aVar, int i, Object obj) {
        n nVar = (n) obj;
        k71.k.g(nVar, "builder");
        char i2 = aVar.i(this.b, i);
        nVar.b(nVar.d() + 1);
        char[] cArr = nVar.a;
        int i3 = nVar.b;
        nVar.b = i3 + 1;
        cArr[i3] = i2;
    }

    @Override // k81.a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        k71.k.g(cArr, "<this>");
        n nVar = new n();
        nVar.a = cArr;
        nVar.b = cArr.length;
        nVar.b(10);
        return nVar;
    }

    @Override // k81.h1
    public final Object j() {
        return new char[0];
    }

    @Override // k81.h1
    public final void k(d5 d5Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        k71.k.g(d5Var, "encoder");
        k71.k.g(cArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            char c2 = cArr[i2];
            g1 g1Var = this.b;
            k71.k.g(g1Var, "descriptor");
            d5Var.D(g1Var, i2);
            d5Var.i(c2);
        }
    }
}
