package k81;

import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes5.dex */
public final class t1 extends h1Shadow {
    public static final t1 c = new t1(u1.a);

    @Override // k81.a
    public final int d(Object obj) {
        byte[] bArr = ((w61.s) obj).r;
        k71.k.g(bArr, "$this$collectionSize");
        return bArr.length;
    }

    @Override // k81.s, k81.a
    public final void f(j81.a aVar, int i, Object obj) {
        s1 s1Var = (s1) obj;
        k71.k.g(s1Var, "builder");
        byte B = aVar.q(this.b, i).B();
        s1Var.b(s1Var.d() + 1);
        byte[] bArr = s1Var.a;
        int i2 = s1Var.b;
        s1Var.b = i2 + 1;
        bArr[i2] = B;
    }

    @Override // k81.a
    public final Object g(Object obj) {
        byte[] bArr = ((w61.s) obj).r;
        k71.k.g(bArr, "$this$toBuilder");
        s1 s1Var = new s1();
        s1Var.a = bArr;
        s1Var.b = bArr.length;
        s1Var.b(10);
        return s1Var;
    }

    @Override // k81.h1
    public final Object j() {
        return new w61.s(new byte[0]);
    }

    @Override // k81.h1
    public final void k(d5 d5Var, Object obj, int i) {
        byte[] bArr = ((w61.s) obj).r;
        k71.k.g(d5Var, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            d5Var.E(this.b, i2).f(bArr[i2]);
        }
    }
}
