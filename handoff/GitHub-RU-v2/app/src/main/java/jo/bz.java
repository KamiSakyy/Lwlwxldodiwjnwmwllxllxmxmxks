package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bz {
    public final fz a;
    public final String b;

    public bz(fz fzVar, String str) {
        this.a = fzVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return false;
        }
        bz bzVar = (bz) obj;
        return k71.k.b(this.a, bzVar.a) && k71.k.b(this.b, bzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnOrganization(repositories=" + this.a + ", id=" + this.b + ")";
    }
}
