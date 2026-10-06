package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oc {
    public final String a;
    public final mc b;

    public oc(String str, mc mcVar) {
        this.a = str;
        this.b = mcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc)) {
            return false;
        }
        oc ocVar = (oc) obj;
        return k71.k.b(this.a, ocVar.a) && k71.k.b(this.b, ocVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mc mcVar = this.b;
        return hashCode + (mcVar == null ? 0 : mcVar.hashCode());
    }

    public final String toString() {
        return "OnCommit(id=" + this.a + ", file=" + this.b + ")";
    }
}
