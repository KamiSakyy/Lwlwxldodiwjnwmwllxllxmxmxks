package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cz {
    public final gz a;
    public final String b;

    public cz(gz gzVar, String str) {
        this.a = gzVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz)) {
            return false;
        }
        cz czVar = (cz) obj;
        return k71.k.b(this.a, czVar.a) && k71.k.b(this.b, czVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnUser(repositories=" + this.a + ", id=" + this.b + ")";
    }
}
