package k81;

import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c2 extends h1 {
    public static final c2 c = new c2(d2.a);

    @Override // k81.a
    public final int d(Object obj) {
        short[] sArr = ((w61.z) obj).r;
        k71.k.g(sArr, "$this$collectionSize");
        return sArr.length;
    }

    @Override // k81.s, k81.a
    public final void f(j81.a aVar, int i, Object obj) {
        b2 b2Var = (b2) obj;
        k71.k.g(b2Var, "builder");
        short C = aVar.q(this.b, i).C();
        b2Var.b(b2Var.d() + 1);
        short[] sArr = b2Var.a;
        int i2 = b2Var.b;
        b2Var.b = i2 + 1;
        sArr[i2] = C;
    }

    @Override // k81.a
    public final Object g(Object obj) {
        short[] sArr = ((w61.z) obj).r;
        k71.k.g(sArr, "$this$toBuilder");
        b2 b2Var = new b2();
        b2Var.a = sArr;
        b2Var.b = sArr.length;
        b2Var.b(10);
        return b2Var;
    }

    @Override // k81.h1
    public final Object j() {
        return new w61.z(new short[0]);
    }

    @Override // k81.h1
    public final void k(d5 d5Var, Object obj, int i) {
        short[] sArr = ((w61.z) obj).r;
        k71.k.g(d5Var, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            d5Var.E(this.b, i2).e(sArr[i2]);
        }
    }
}
