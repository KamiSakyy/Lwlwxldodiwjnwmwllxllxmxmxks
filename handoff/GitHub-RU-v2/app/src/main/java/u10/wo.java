package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wo implements aaShadow.v0 {
    public final jp a;

    public wo(jp jpVar) {
        this.a = jpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wo) && k71.k.b(this.a, ((wo) obj).a);
    }

    public final int hashCode() {
        jp jpVar = this.a;
        if (jpVar == null) {
            return 0;
        }
        return jpVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
