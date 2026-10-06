package com.github.rudroid.viewmodels;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y7 {
    public com.github.rudroid.utilities.ui.g1 a;
    public boolean b;
    public Set c;
    public Set d;

    public y7(com.github.rudroid.utilities.ui.g1 g1Var, boolean z, Set set, Set set2) {
        this.a = g1Var;
        this.b = z;
        this.c = set;
        this.d = set2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Set] */
    public static y7 a(y7 y7Var, com.github.rudroid.utilities.ui.g1 g1Var, boolean z, Set set, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            g1Var = y7Var.a;
        }
        if ((i & 2) != 0) {
            z = y7Var.b;
        }
        if ((i & 4) != 0) {
            set = y7Var.c;
        }
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        if ((i & 8) != 0) {
            linkedHashSet2 = y7Var.d;
        }
        y7Var.getClass();
        return new y7(g1Var, z, set, linkedHashSet2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        return k71.k.b(this.a, y7Var.a) && this.b == y7Var.b && k71.k.b(this.c, y7Var.c) && k71.k.b(this.d, y7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + x.i.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SubIssueViewConfig(subIssueData=" + this.a + ", isSubIssuesExpanded=" + this.b + ", expandedSubIssues=" + this.c + ", loadingSubIssues=" + this.d + ")";
    }
}
