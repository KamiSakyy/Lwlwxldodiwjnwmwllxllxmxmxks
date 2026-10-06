package pb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public k a;

    public l(k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && k71.k.b(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        k kVar = this.a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public final String toString() {
        return "UpdateRepository(repository=" + this.a + ")";
    }
}
