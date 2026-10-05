package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum s2 extends l3 {
    public s2() {
        super("AfterDoctypeName", 54);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        boolean b0 = aVar.b0();
        f1 f1Var = l3.r;
        if (b0) {
            u0Var.l(this);
            u0Var.l.h = true;
            u0Var.j();
            u0Var.o(f1Var);
            return;
        }
        if (aVar.x0('\t', '\n', '\r', '\f', ' ')) {
            aVar.f();
            return;
        }
        if (aVar.w0('>')) {
            u0Var.j();
            u0Var.a(f1Var);
            return;
        }
        if (aVar.o0("PUBLIC")) {
            u0Var.l.e = "PUBLIC";
            u0Var.o(l3.u0);
        } else if (aVar.o0("SYSTEM")) {
            u0Var.l.e = "SYSTEM";
            u0Var.o(l3.A0);
        } else {
            u0Var.m(this);
            u0Var.l.h = true;
            u0Var.a(l3.F0);
        }
    }
}
