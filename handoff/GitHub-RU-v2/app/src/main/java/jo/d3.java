package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d3 {
    public final k3 a;

    public d3(k3 k3Var) {
        this.a = k3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3) && k71.k.b(this.a, ((d3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAssignable(suggestedActors=" + this.a + ")";
    }
}
