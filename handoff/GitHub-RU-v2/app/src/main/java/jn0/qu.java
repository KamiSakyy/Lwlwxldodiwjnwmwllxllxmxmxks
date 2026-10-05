package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qu implements aa.m0 {
    public final su a;

    public qu(su suVar) {
        this.a = suVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qu) && k71.k.b(this.a, ((qu) obj).a);
    }

    public final int hashCode() {
        su suVar = this.a;
        if (suVar == null) {
            return 0;
        }
        return suVar.hashCode();
    }

    public final String toString() {
        return "Data(reopenIssue=" + this.a + ")";
    }
}
