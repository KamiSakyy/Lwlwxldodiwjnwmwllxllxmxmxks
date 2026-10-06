package com.github.rudroid.shortcuts;

import com.github.rudroid.utilities.ui.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final wm.b a;
    public final boolean b;
    public final g1 c;

    public a(wm.b bVar, boolean z, g1 g1Var) {
        k71.k.g(bVar, "shortcutModel");
        k71.k.g(g1Var, "savingState");
        this.a = bVar;
        this.b = z;
        this.c = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && this.b == aVar.b && k71.k.b(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ConfigureShortcutUIState(shortcutModel=" + this.a + ", mergeQueueEnabled=" + this.b + ", savingState=" + this.c + ")";
    }
    public Object a(Object p1) { return null; }
}
