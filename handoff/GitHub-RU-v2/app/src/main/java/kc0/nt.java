package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nt implements aaShadow.v0 {
    public final ut a;

    public nt(ut utVar) {
        this.a = utVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nt) && k71.k.b(this.a, ((nt) obj).a);
    }

    public final int hashCode() {
        ut utVar = this.a;
        if (utVar == null) {
            return 0;
        }
        return utVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
