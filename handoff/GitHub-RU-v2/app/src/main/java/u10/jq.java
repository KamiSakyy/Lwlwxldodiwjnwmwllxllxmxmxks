package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jq {
    public final kq a;
    public final iq b;

    public jq(kq kqVar, iq iqVar) {
        this.a = kqVar;
        this.b = iqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq)) {
            return false;
        }
        jq jqVar = (jq) obj;
        return k71.k.b(this.a, jqVar.a) && k71.k.b(this.b, jqVar.b);
    }

    public final int hashCode() {
        kq kqVar = this.a;
        int hashCode = (kqVar == null ? 0 : kqVar.hashCode()) * 31;
        iq iqVar = this.b;
        return hashCode + (iqVar != null ? iqVar.hashCode() : 0);
    }

    public final String toString() {
        return "RemoveReaction(subject=" + this.a + ", reaction=" + this.b + ")";
    }
}
