package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ys implements aa.v0 {
    public final ht a;

    public ys(ht htVar) {
        this.a = htVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys) && k71.k.b(this.a, ((ys) obj).a);
    }

    public final int hashCode() {
        ht htVar = this.a;
        if (htVar == null) {
            return 0;
        }
        return htVar.hashCode();
    }

    public final String toString() {
        return "Data(repositoryOwner=" + this.a + ")";
    }
}
