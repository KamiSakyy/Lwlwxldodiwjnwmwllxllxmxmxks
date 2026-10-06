package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bl implements aaShadow.v0 {
    public final el a;

    public bl(el elVar) {
        this.a = elVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bl) && k71.k.b(this.a, ((bl) obj).a);
    }

    public final int hashCode() {
        el elVar = this.a;
        if (elVar == null) {
            return 0;
        }
        return elVar.hashCode();
    }

    public final String toString() {
        return "Data(organization=" + this.a + ")";
    }
}
