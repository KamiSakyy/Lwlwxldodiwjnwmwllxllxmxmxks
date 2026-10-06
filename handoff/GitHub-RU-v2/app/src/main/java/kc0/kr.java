package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kr implements aaShadow.m0 {
    public nr a;

    public kr(nr nrVar) {
        this.a = nrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kr) && k71.k.b(this.a, ((kr) obj).a);
    }

    public final int hashCode() {
        nr nrVar = this.a;
        if (nrVar == null) {
            return 0;
        }
        return nrVar.hashCode();
    }

    public final String toString() {
        return "Data(removeReaction=" + this.a + ")";
    }
}
