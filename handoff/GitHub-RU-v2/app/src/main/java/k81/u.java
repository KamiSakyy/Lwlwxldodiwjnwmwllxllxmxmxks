package k81;

import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes5.dex */
public final class u extends h1Shadow {
    public static final u c = new u(v.a);

    @Override // k81.a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        k71.k.g(dArr, "<this>");
        return dArr.length;
    }

    @Override // k81.s, k81.a
    public final void f(j81.a aVar, int i, Object obj) {
        tShadow tVar = (tShadow) obj;
        k71.k.g(tVar, "builder");
        double z = aVar.z(this.b, i);
        tVar.b(tVar.d() + 1);
        double[] dArr = tVar.a;
        int i2 = tVar.b;
        tVar.b = i2 + 1;
        dArr[i2] = z;
    }

    @Override // k81.a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        k71.k.g(dArr, "<this>");
        tShadow tVar = new tShadow();
        tVar.a = dArr;
        tVar.b = dArr.length;
        tVar.b(10);
        return tVar;
    }

    @Override // k81.h1
    public final Object j() {
        return new double[0];
    }

    @Override // k81.h1
    public final void k(d5 d5Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        k71.k.g(d5Var, "encoder");
        k71.k.g(dArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            g1 g1Var = this.b;
            k71.k.g(g1Var, "descriptor");
            d5Var.D(g1Var, i2);
            d5Var.d(d);
        }
    }
}
