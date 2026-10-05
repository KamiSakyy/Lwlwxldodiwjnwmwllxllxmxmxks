package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vo {
    public final String a;
    public final cq.x2 b;

    public vo(String str, cq.x2 x2Var) {
        this.a = str;
        this.b = x2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        return k71.k.b(this.a, voVar.a) && k71.k.b(this.b, voVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaywallProduct(__typename=" + this.a + ", paywallProductFragment=" + this.b + ")";
    }
}
