package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rf {
    public String a;
    public pf b;

    public rf(String str, pf pfVar) {
        this.a = str;
        this.b = pfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf)) {
            return false;
        }
        rf rfVar = (rf) obj;
        return k71.k.b(this.a, rfVar.a) && k71.k.b(this.b, rfVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pf pfVar = this.b;
        return hashCode + (pfVar == null ? 0 : pfVar.a.hashCode());
    }

    public final String toString() {
        return "OnCommit(id=" + this.a + ", file=" + this.b + ")";
    }
}
