package k81;

import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b0 extends h1Shadow {
    public static final b0 c = new b0(c0.a);

    @Override // k81.a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        k71.k.g(fArr, "<this>");
        return fArr.length;
    }

    @Override // k81.s, k81.a
    public final void f(j81.a aVar, int i, Object obj) {
        a0 a0Var = (a0) obj;
        k71.k.g(a0Var, "builder");
        float h = aVar.h(this.b, i);
        a0Var.b(a0Var.d() + 1);
        float[] fArr = a0Var.a;
        int i2 = a0Var.b;
        a0Var.b = i2 + 1;
        fArr[i2] = h;
    }

    @Override // k81.a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        k71.k.g(fArr, "<this>");
        a0 a0Var = new a0();
        a0Var.a = fArr;
        a0Var.b = fArr.length;
        a0Var.b(10);
        return a0Var;
    }

    @Override // k81.h1
    public final Object j() {
        return new float[0];
    }

    @Override // k81.h1
    public final void k(d5 d5Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        k71.k.g(d5Var, "encoder");
        k71.k.g(fArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            g1 g1Var = this.b;
            k71.k.g(g1Var, "descriptor");
            d5Var.D(g1Var, i2);
            d5Var.h(f);
        }
    }
}
