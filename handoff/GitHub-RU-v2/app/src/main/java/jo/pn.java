package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pn implements aaShadow.m0 {
    public rn a;

    public pn(rn rnVar) {
        this.a = rnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pn) && k71.k.b(this.a, ((pn) obj).a);
    }

    public final int hashCode() {
        rn rnVar = this.a;
        if (rnVar == null) {
            return 0;
        }
        return rnVar.hashCode();
    }

    public final String toString() {
        return "Data(mergePullRequest=" + this.a + ")";
    }
}
