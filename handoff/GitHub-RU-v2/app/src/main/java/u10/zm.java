package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zm implements aaShadow.v0 {
    public final en a;

    public zm(en enVar) {
        this.a = enVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm) && k71.k.b(this.a, ((zm) obj).a);
    }

    public final int hashCode() {
        en enVar = this.a;
        if (enVar == null) {
            return 0;
        }
        return enVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
