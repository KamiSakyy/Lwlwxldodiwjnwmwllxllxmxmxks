package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h1 {
    public final String a;
    public final c1 b;
    public final Boolean c;
    public final f1 d;
    public final k1 e;
    public final String f;

    public h1(String str, c1 c1Var, Boolean bool, f1 f1Var, k1 k1Var, String str2) {
        this.a = str;
        this.b = c1Var;
        this.c = bool;
        this.d = f1Var;
        this.e = k1Var;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return k71.k.b(this.a, h1Var.a) && k71.k.b(this.b, h1Var.b) && k71.k.b(this.c, h1Var.c) && k71.k.b(this.d, h1Var.d) && k71.k.b(this.e, h1Var.e) && k71.k.b(this.f, h1Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c1 c1Var = this.b;
        int hashCode2 = (hashCode + (c1Var == null ? 0 : c1Var.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        k1 k1Var = this.e;
        return this.f.hashCode() + ((hashCode3 + (k1Var != null ? k1Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Repository(id=" + this.a + ", defaultBranchRef=" + this.b + ", isCopilotAgentEnabled=" + this.c + ", owner=" + this.d + ", viewerCodingAgents=" + this.e + ", __typename=" + this.f + ")";
    }
}
