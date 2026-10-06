package k81;

import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes5.dex */
public final class q0 extends h1Shadow {
    public static final q0 c = new q0(r0.a);

    @Override // k81.a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        k71.k.g(jArr, "<this>");
        return jArr.length;
    }

    @Override // k81.s, k81.a
    public final void f(j81.a aVar, int i, Object obj) {
        p0 p0Var = (p0) obj;
        k71.k.g(p0Var, "builder");
        long f = aVar.f(this.b, i);
        p0Var.b(p0Var.d() + 1);
        long[] jArr = p0Var.a;
        int i2 = p0Var.b;
        p0Var.b = i2 + 1;
        jArr[i2] = f;
    }

    @Override // k81.a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        k71.k.g(jArr, "<this>");
        p0 p0Var = new p0();
        p0Var.a = jArr;
        p0Var.b = jArr.length;
        p0Var.b(10);
        return p0Var;
    }

    @Override // k81.h1
    public final Object j() {
        return new long[0];
    }

    @Override // k81.h1
    public final void k(d5 d5Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        k71.k.g(d5Var, "encoder");
        k71.k.g(jArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            d5Var.G(this.b, i2, jArr[i2]);
        }
    }
}
