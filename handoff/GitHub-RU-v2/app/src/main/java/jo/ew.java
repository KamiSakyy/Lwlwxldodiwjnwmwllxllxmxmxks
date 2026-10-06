package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ew {
    public final bw a;
    public final fw b;

    public ew(bw bwVar, fw fwVar) {
        this.a = bwVar;
        this.b = fwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew)) {
            return false;
        }
        ew ewVar = (ew) obj;
        return k71.k.b(this.a, ewVar.a) && k71.k.b(this.b, ewVar.b);
    }

    public final int hashCode() {
        bw bwVar = this.a;
        int hashCode = (bwVar == null ? 0 : bwVar.hashCode()) * 31;
        fw fwVar = this.b;
        return hashCode + (fwVar != null ? fwVar.hashCode() : 0);
    }

    public final String toString() {
        return "RemoveSubIssue(issue=" + this.a + ", subIssue=" + this.b + ")";
    }
}
