package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a3 extends f5 {
    public final List i() {
        return Collections.unmodifiableList(((b3) this.s).p());
    }

    public final int j() {
        return ((b3) this.s).q();
    }

    public final e3 k(int i) {
        return ((b3) this.s).r(i);
    }

    public final void l(e3 e3Var) {
        b();
        ((b3) this.s).B(e3Var);
    }

    public final void n(d3 d3Var) {
        b();
        ((b3) this.s).B((e3) d3Var.e());
    }

    public final void o(int i) {
        b();
        ((b3) this.s).E(i);
    }

    public final String p() {
        return ((b3) this.s).s();
    }

    public final long q() {
        return ((b3) this.s).u();
    }

    public final long r() {
        return ((b3) this.s).w();
    }

    public final void s(long j) {
        b();
        ((b3) this.s).I(j);
    }

    public a3(Object... a) {
    }
}
