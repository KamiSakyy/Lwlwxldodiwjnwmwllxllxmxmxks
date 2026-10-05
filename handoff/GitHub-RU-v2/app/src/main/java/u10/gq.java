package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gq implements aa.m0 {
    public final jq a;

    public gq(jq jqVar) {
        this.a = jqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gq) && k71.k.b(this.a, ((gq) obj).a);
    }

    public final int hashCode() {
        jq jqVar = this.a;
        if (jqVar == null) {
            return 0;
        }
        return jqVar.hashCode();
    }

    public final String toString() {
        return "Data(removeReaction=" + this.a + ")";
    }
}
