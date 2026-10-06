package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class to {
    public final String a;
    public final cq.n2 b;
    public final cq.r2 c;

    public to(String str, cq.n2 n2Var, cq.r2 r2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = n2Var;
        this.c = r2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to)) {
            return false;
        }
        to toVar = (to) obj;
        return k71.k.b(this.a, toVar.a) && k71.k.b(this.b, toVar.b) && k71.k.b(this.c, toVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cq.n2 n2Var = this.b;
        int hashCode2 = (hashCode + (n2Var == null ? 0 : n2Var.hashCode())) * 31;
        cq.r2 r2Var = this.c;
        return hashCode2 + (r2Var != null ? r2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Feature(__typename=" + this.a + ", mobileCopilotFeatureComparisonSubsectionFragment=" + this.b + ", mobileCopilotPaywallChatModelsFragment=" + this.c + ")";
    }
}
