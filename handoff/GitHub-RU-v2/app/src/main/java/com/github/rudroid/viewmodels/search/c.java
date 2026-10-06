package com.github.rudroid.viewmodels.search;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import k71.k;
import y71.i1;
import y71.n1;
import y71.y;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends k1 {
    public y1 s;
    public y1 t;
    public i1 u;

    public c() {
        y1 c = n1.c(new a("", false));
        this.s = c;
        y1 c2 = n1.c("");
        this.t = c2;
        this.u = new i1(c);
        n1.A(new y(n1.o(c2, 250L), new b(this, null), 6), d1.k(this));
    }

    public final void P() {
        R("");
    }

    public final boolean Q() {
        return ((a) this.s.getValue()).a.length() > 0;
    }

    public final void R(String str) {
        k.g(str, "query");
        a aVar = new a(str, true);
        y1 y1Var = this.s;
        y1Var.getClass();
        y1Var.k((Object) null, aVar);
    }

    public final void S(String str) {
        k.g(str, "query");
        a aVar = new a(str, false);
        y1 y1Var = this.s;
        y1Var.getClass();
        y1Var.k((Object) null, aVar);
    }

    public final void T(String str) {
        k.g(str, "query");
        y1 y1Var = this.t;
        y1Var.getClass();
        y1Var.k((Object) null, str);
    }
}
