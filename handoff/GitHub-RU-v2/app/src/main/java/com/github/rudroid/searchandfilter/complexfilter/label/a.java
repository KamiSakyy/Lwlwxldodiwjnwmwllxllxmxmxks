package com.github.rudroid.searchandfilter.complexfilter.label;

import yz0.k2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final k2 a;
    public final boolean b;

    public a(k2 k2Var, boolean z) {
        k71.k.g(k2Var, "label");
        this.a = k2Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectableLabel(label=" + this.a + ", isSelected=" + this.b + ")";
    }
}
