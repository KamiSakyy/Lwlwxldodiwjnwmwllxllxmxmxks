package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s2 {
    public w2 a;

    public s2(w2 w2Var) {
        this.a = w2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2) && k71.k.b(this.a, ((s2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAssignable(suggestedAssignees=" + this.a + ")";
    }
}
