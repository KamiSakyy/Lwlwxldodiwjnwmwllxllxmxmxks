package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class aw implements aa.m0 {
    public final ew a;

    public aw(ew ewVar) {
        this.a = ewVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw) && k71.k.b(this.a, ((aw) obj).a);
    }

    public final int hashCode() {
        ew ewVar = this.a;
        if (ewVar == null) {
            return 0;
        }
        return ewVar.hashCode();
    }

    public final String toString() {
        return "Data(removeSubIssue=" + this.a + ")";
    }
}
