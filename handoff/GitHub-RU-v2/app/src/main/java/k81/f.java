package k81;

import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f extends h1Shadow {
    public static final f c = new f(g.a);

    @Override // k81.a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        k71.k.g(zArr, "<this>");
        return zArr.length;
    }

    @Override // k81.s, k81.a
    public final void f(j81.a aVar, int i, Object obj) {
        e eVar = (e) obj;
        k71.k.g(eVar, "builder");
        boolean p = aVar.p(this.b, i);
        eVar.b(eVar.d() + 1);
        boolean[] zArr = eVar.a;
        int i2 = eVar.b;
        eVar.b = i2 + 1;
        zArr[i2] = p;
    }

    @Override // k81.a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        k71.k.g(zArr, "<this>");
        e eVar = new e();
        eVar.a = zArr;
        eVar.b = zArr.length;
        eVar.b(10);
        return eVar;
    }

    @Override // k81.h1
    public final Object j() {
        return new boolean[0];
    }

    @Override // k81.h1
    public final void k(d5 d5Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        k71.k.g(d5Var, "encoder");
        k71.k.g(zArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            d5Var.C(this.b, i2, zArr[i2]);
        }
    }
}
