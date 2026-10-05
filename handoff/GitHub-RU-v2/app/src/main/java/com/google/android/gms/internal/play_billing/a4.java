package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a4 {
    public Object a;
    public c4 b;
    public d4 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        c4 c4Var = this.b;
        if (c4Var != null) {
            b4 b4Var = c4Var.s;
            b4Var.getClass();
            if (obj == null) {
                obj = z3.x;
            }
            if (z3.w.A0(b4Var, null, obj)) {
                z3.d(b4Var);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        d4 d4Var;
        c4 c4Var = this.b;
        if (c4Var != null) {
            b4 b4Var = c4Var.s;
            if (!b4Var.isDone()) {
                if (z3.w.A0(b4Var, null, new y1(new n1("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)), 1)))) {
                    z3.d(b4Var);
                }
            }
        }
        if (this.d || (d4Var = this.c) == null) {
            return;
        }
        d4Var.i(null);
    }
}
