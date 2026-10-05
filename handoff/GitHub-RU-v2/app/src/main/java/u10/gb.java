package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gb implements aa.v0 {
    public final jb a;
    public final kb b;

    public gb(jb jbVar, kb kbVar) {
        this.a = jbVar;
        this.b = kbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return k71.k.b(this.a, gbVar.a) && k71.k.b(this.b, gbVar.b);
    }

    public final int hashCode() {
        jb jbVar = this.a;
        return this.b.hashCode() + ((jbVar == null ? 0 : jbVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Data(repository=" + this.a + ", search=" + this.b + ")";
    }
}
