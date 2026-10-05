package com.github.rudroid.uitoolkit.swipetodismiss;

import v2.x0;

/* loaded from: /home/user/work/p/classes3.dex */
final class j0 extends x0 {
    public final g0 a;
    public final boolean b;
    public final boolean c;

    public j0(g0 g0Var, boolean z, boolean z2) {
        k71.k.g(g0Var, "state");
        this.a = g0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        k71.k.e(obj, "null cannot be cast to non-null type com.github.rudroid.uitoolkit.swipetodismiss.SwipeToDismissAnchorsElement");
        j0 j0Var = (j0) obj;
        return k71.k.b(this.a, j0Var.a) && this.b == j0Var.b && this.c == j0Var.c;
    }

    public final w1.q g() {
        g0 g0Var = this.a;
        k71.k.g(g0Var, "state");
        l0 l0Var = new l0();
        l0Var.F = g0Var;
        l0Var.G = this.b;
        l0Var.H = this.c;
        return l0Var;
    }

    public final void h(w1.q qVar) {
        l0 l0Var = (l0) qVar;
        k71.k.g(l0Var, "node");
        g0 g0Var = this.a;
        k71.k.g(g0Var, "<set-?>");
        l0Var.F = g0Var;
        l0Var.G = this.b;
        l0Var.H = this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class i<T1,T2,T3,T4> {
        public i() {
        }
    }
}
