package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum g3 extends l3 {
    public g3() {
        super("CdataSection", 67);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        String r;
        int K0 = aVar.K0("]]>");
        if (K0 != -1) {
            r = a.r(aVar.t, aVar.r, aVar.u, K0);
            aVar.u += K0;
        } else {
            int i = aVar.v;
            int i2 = aVar.u;
            if (i - i2 < 3) {
                r = aVar.O();
            } else {
                int i3 = i - 2;
                r = a.r(aVar.t, aVar.r, i2, i3 - i2);
                aVar.u = i3;
            }
        }
        u0Var.f.g(r);
        if (aVar.i0("]]>") || aVar.b0()) {
            String G = u0Var.f.G();
            j0 j0Var = new j0();
            b1.m mVar = j0Var.d;
            mVar.D();
            mVar.s = G;
            u0Var.g(j0Var);
            u0Var.o(l3.r);
        }
    }
}
