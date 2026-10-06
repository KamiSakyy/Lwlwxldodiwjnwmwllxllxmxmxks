package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lu implements aaShadow.m0 {
    public final mu a;

    public lu(mu muVar) {
        this.a = muVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lu) && k71.k.b(this.a, ((lu) obj).a);
    }

    public final int hashCode() {
        mu muVar = this.a;
        if (muVar == null) {
            return 0;
        }
        return muVar.hashCode();
    }

    public final String toString() {
        return "Data(removeUpvote=" + this.a + ")";
    }
}
