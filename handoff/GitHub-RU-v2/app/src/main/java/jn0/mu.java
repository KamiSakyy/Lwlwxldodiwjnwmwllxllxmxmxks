package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mu {
    public final nu a;

    public mu(nu nuVar) {
        this.a = nuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mu) && k71.k.b(this.a, ((mu) obj).a);
    }

    public final int hashCode() {
        nu nuVar = this.a;
        if (nuVar == null) {
            return 0;
        }
        return nuVar.hashCode();
    }

    public final String toString() {
        return "RemoveUpvote(subject=" + this.a + ")";
    }
}
