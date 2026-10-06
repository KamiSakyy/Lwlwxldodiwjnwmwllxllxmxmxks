package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tl {
    public nl a;

    public tl(nl nlVar) {
        this.a = nlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tl) && k71.k.b(this.a, ((tl) obj).a);
    }

    public final int hashCode() {
        nl nlVar = this.a;
        if (nlVar == null) {
            return 0;
        }
        return nlVar.hashCode();
    }

    public final String toString() {
        return "OnIssue(mentionableItems=" + this.a + ")";
    }
}
