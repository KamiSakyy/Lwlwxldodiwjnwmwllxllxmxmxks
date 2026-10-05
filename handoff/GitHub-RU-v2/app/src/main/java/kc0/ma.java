package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ma implements aa.v0 {
    public final oa a;

    public ma(oa oaVar) {
        this.a = oaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ma) && k71.k.b(this.a, ((ma) obj).a);
    }

    public final int hashCode() {
        oa oaVar = this.a;
        if (oaVar == null) {
            return 0;
        }
        return oaVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
