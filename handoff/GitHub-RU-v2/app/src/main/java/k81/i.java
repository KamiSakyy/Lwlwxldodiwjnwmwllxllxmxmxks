package k81;

import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i extends h1Shadow {
    public static final i c = new i(j.a);

    @Override // k81.a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        k71.k.g(bArr, "<this>");
        return bArr.length;
    }

    @Override // k81.s, k81.a
    public final void f(j81.a aVar, int i, Object obj) {
        h hVar = (h) obj;
        k71.k.g(hVar, "builder");
        byte v = aVar.v(this.b, i);
        hVar.b(hVar.d() + 1);
        byte[] bArr = hVar.a;
        int i2 = hVar.b;
        hVar.b = i2 + 1;
        bArr[i2] = v;
    }

    @Override // k81.a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        k71.k.g(bArr, "<this>");
        h hVar = new h();
        hVar.a = bArr;
        hVar.b = bArr.length;
        hVar.b(10);
        return hVar;
    }

    @Override // k81.h1
    public final Object j() {
        return new byte[0];
    }

    @Override // k81.h1
    public final void k(d5 d5Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        k71.k.g(d5Var, "encoder");
        k71.k.g(bArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            g1 g1Var = this.b;
            k71.k.g(g1Var, "descriptor");
            d5Var.D(g1Var, i2);
            d5Var.f(b);
        }
    }
}
