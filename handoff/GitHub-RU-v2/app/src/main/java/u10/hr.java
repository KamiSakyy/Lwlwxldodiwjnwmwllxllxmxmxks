package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hr implements aaShadow.v0 {
    public final jr a;

    public hr(jr jrVar) {
        this.a = jrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hr) && k71.k.b(this.a, ((hr) obj).a);
    }

    public final int hashCode() {
        jr jrVar = this.a;
        if (jrVar == null) {
            return 0;
        }
        return jrVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
