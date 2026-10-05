package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hu {
    public final eu a;
    public final iu b;

    public hu(eu euVar, iu iuVar) {
        this.a = euVar;
        this.b = iuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu)) {
            return false;
        }
        hu huVar = (hu) obj;
        return k71.k.b(this.a, huVar.a) && k71.k.b(this.b, huVar.b);
    }

    public final int hashCode() {
        eu euVar = this.a;
        int hashCode = (euVar == null ? 0 : euVar.hashCode()) * 31;
        iu iuVar = this.b;
        return hashCode + (iuVar != null ? iuVar.hashCode() : 0);
    }

    public final String toString() {
        return "RemoveSubIssue(issue=" + this.a + ", subIssue=" + this.b + ")";
    }
}
