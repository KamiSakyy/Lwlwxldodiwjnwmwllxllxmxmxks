package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dz {
    public final ez a;

    public dz(ez ezVar) {
        this.a = ezVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz) && k71.k.b(this.a, ((dz) obj).a);
    }

    public final int hashCode() {
        ez ezVar = this.a;
        if (ezVar == null) {
            return 0;
        }
        return ezVar.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.a + ")";
    }
}
