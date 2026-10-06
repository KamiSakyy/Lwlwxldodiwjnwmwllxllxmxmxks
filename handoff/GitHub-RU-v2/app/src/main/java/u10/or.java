package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class or implements aaShadow.v0 {
    public pr a;

    public or(pr prVar) {
        this.a = prVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof or) && k71.k.b(this.a, ((or) obj).a);
    }

    public final int hashCode() {
        pr prVar = this.a;
        if (prVar == null) {
            return 0;
        }
        return prVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
