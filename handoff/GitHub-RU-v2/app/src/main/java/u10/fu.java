package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fu implements aaShadow.v0 {
    public ju a;

    public fu(ju juVar) {
        this.a = juVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fu) && k71.k.b(this.a, ((fu) obj).a);
    }

    public final int hashCode() {
        ju juVar = this.a;
        if (juVar == null) {
            return 0;
        }
        return juVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
