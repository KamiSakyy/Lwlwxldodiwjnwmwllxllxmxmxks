package in;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 {
    public static final k0 Companion = new k0();
    public final q81.u a;
    public final v71.v b;
    public final oa.j c;
    public final qe.a d;

    public n0(q81.u uVar, oa.j jVar, qe.a aVar) {
        c81.e eVar = v71.l0.a;
        c81.d dVar = c81.d.t;
        k71.k.g(uVar, "okHttpClient");
        k71.k.g(dVar, "ioDispatcher");
        k71.k.g(jVar, "user");
        this.a = uVar;
        this.b = dVar;
        this.c = jVar;
        this.d = aVar;
    }

    public static final y a(n0 n0Var, q81.a0Shadow a0Var, String str, t tVar) {
        String str2 = tVar.d;
        String str3 = tVar.b;
        if (t71.p.I(str, "field\":\"size", false)) {
            return new u("upload creation failed, file size too large", str3, str2);
        }
        String str4 = "upload creation failed " + a0Var.x.t();
        k71.k.g(str4, "errorMessage");
        return new v(str4, str3, str2);
    }
}
