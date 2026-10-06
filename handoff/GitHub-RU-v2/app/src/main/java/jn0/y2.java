package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y2 {
    public c3 a;

    public y2(c3 c3Var) {
        this.a = c3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2) && k71.k.b(this.a, ((y2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAssignable(suggestedAssignees=" + this.a + ")";
    }
}
