package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gd {
    public final String a;
    public final ed b;

    public gd(String str, ed edVar) {
        this.a = str;
        this.b = edVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd)) {
            return false;
        }
        gd gdVar = (gd) obj;
        return k71.k.b(this.a, gdVar.a) && k71.k.b(this.b, gdVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ed edVar = this.b;
        return hashCode + (edVar == null ? 0 : edVar.a.hashCode());
    }

    public final String toString() {
        return "OnCommit(id=" + this.a + ", file=" + this.b + ")";
    }
}
