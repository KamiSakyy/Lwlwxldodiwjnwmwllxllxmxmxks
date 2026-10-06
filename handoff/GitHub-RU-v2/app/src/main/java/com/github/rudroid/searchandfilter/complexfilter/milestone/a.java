package com.github.rudroid.searchandfilter.complexfilter.milestone;

import yz0.v2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public v2 a;
    public boolean b;

    public a(v2 v2Var, boolean z) {
        k71.k.g(v2Var, "milestone");
        this.a = v2Var;
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
        return "SelectableMilestone(milestone=" + this.a + ", isSelected=" + this.b + ")";
    }
}
