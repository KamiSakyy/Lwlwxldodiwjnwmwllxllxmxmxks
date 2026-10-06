package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nt implements aaShadow.m0 {
    public final qt a;

    public nt(qt qtVar) {
        this.a = qtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nt) && k71.k.b(this.a, ((nt) obj).a);
    }

    public final int hashCode() {
        qt qtVar = this.a;
        if (qtVar == null) {
            return 0;
        }
        return qtVar.hashCode();
    }

    public final String toString() {
        return "Data(removeReaction=" + this.a + ")";
    }
}
