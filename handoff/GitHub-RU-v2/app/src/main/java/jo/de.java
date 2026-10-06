package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class de {
    public fe a;

    public de(fe feVar) {
        this.a = feVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof de) && k71.k.b(this.a, ((de) obj).a);
    }

    public final int hashCode() {
        fe feVar = this.a;
        if (feVar == null) {
            return 0;
        }
        return feVar.hashCode();
    }

    public final String toString() {
        return "Diff(patch=" + this.a + ")";
    }
}
