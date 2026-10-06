package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hs {
    public final gs a;

    public hs(gs gsVar) {
        this.a = gsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hs) && k71.k.b(this.a, ((hs) obj).a);
    }

    public final int hashCode() {
        gs gsVar = this.a;
        if (gsVar == null) {
            return 0;
        }
        return gsVar.hashCode();
    }

    public final String toString() {
        return "ReopenIssue(issue=" + this.a + ")";
    }
}
