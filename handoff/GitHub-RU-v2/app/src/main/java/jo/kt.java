package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kt implements aaShadow.m0 {
    public mt a;

    public kt(mt mtVar) {
        this.a = mtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kt) && k71.k.b(this.a, ((kt) obj).a);
    }

    public final int hashCode() {
        mt mtVar = this.a;
        if (mtVar == null) {
            return 0;
        }
        return mtVar.hashCode();
    }

    public final String toString() {
        return "Data(rejectDeployments=" + this.a + ")";
    }
}
