package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c2 implements f2 {
    public static final r1 b = new r1(4);
    public final Object a;

    public c2(f2... f2VarArr) {
        this.a = f2VarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.f2
    public n2 a(Class cls) {
        for (int i = 0; i < 2; i++) {
            f2 f2Var = ((f2[]) this.a)[i];
            if (f2Var.b(cls)) {
                return f2Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.f2
    public boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((f2[]) this.a)[i].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i, Object obj, o2 o2Var) {
        m1 m1Var = (m1) this.a;
        g1 g1Var = (g1) obj;
        m1Var.u0(i, 2);
        m1Var.w0(g1Var.c(o2Var));
        o2Var.e(g1Var, this);
    }

    public c2() {
        int i = i1.a;
        c2 c2Var = new c2(r1.b, b);
        Charset charset = z1.a;
        this.a = c2Var;
    }

    public c2(m1 m1Var) {
        Charset charset = z1.a;
        this.a = m1Var;
        m1Var.a = this;
    }
}
