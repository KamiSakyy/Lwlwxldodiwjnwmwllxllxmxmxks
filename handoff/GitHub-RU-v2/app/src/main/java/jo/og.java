package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class og {
    public String a;
    public mg b;

    public og(String str, mg mgVar) {
        this.a = str;
        this.b = mgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og)) {
            return false;
        }
        og ogVar = (og) obj;
        return k71.k.b(this.a, ogVar.a) && k71.k.b(this.b, ogVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mg mgVar = this.b;
        return hashCode + (mgVar == null ? 0 : mgVar.a.hashCode());
    }

    public final String toString() {
        return "OnCommit(id=" + this.a + ", file=" + this.b + ")";
    }
}
