package com.github.rudroid.uitoolkit;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q1 {
    public final ArrayList a;
    public final ArrayList b;

    public q1(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.a.equals(q1Var.a) && this.b.equals(q1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReactionData(possibleReactions=" + this.a + ", visibleReactions=" + this.b + ")";
    }
}
