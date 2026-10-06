package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pw {
    public final ow a;

    public pw(ow owVar) {
        this.a = owVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pw) && k71.k.b(this.a, ((pw) obj).a);
    }

    public final int hashCode() {
        ow owVar = this.a;
        if (owVar == null) {
            return 0;
        }
        return owVar.hashCode();
    }

    public final String toString() {
        return "ReopenIssue(issue=" + this.a + ")";
    }
}
