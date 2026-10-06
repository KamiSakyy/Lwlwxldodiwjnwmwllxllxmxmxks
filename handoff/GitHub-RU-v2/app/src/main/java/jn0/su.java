package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class su {
    public ru a;

    public su(ru ruVar) {
        this.a = ruVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof su) && k71.k.b(this.a, ((su) obj).a);
    }

    public final int hashCode() {
        ru ruVar = this.a;
        if (ruVar == null) {
            return 0;
        }
        return ruVar.hashCode();
    }

    public final String toString() {
        return "ReopenIssue(issue=" + this.a + ")";
    }
}
