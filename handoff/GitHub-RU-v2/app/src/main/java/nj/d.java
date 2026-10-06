package nj;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public xn.e1 a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public xn.f1 e;

    public d(xn.e1 e1Var, Boolean bool, Boolean bool2, Boolean bool3, xn.f1 f1Var) {
        this.a = e1Var;
        this.b = bool;
        this.c = bool2;
        this.d = bool3;
        this.e = f1Var;
    }

    public static d a(d dVar, xn.e1 e1Var, Boolean bool, Boolean bool2, Boolean bool3, xn.f1 f1Var, int i) {
        if ((i & 1) != 0) {
            e1Var = dVar.a;
        }
        xn.e1 e1Var2 = e1Var;
        if ((i & 2) != 0) {
            bool = dVar.b;
        }
        Boolean bool4 = bool;
        if ((i & 4) != 0) {
            bool2 = dVar.c;
        }
        Boolean bool5 = bool2;
        if ((i & 8) != 0) {
            bool3 = dVar.d;
        }
        Boolean bool6 = bool3;
        if ((i & 16) != 0) {
            f1Var = dVar.e;
        }
        dVar.getClass();
        return new d(e1Var2, bool4, bool5, bool6, f1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c) && k71.k.b(this.d, dVar.d) && k71.k.b(this.e, dVar.e);
    }

    public final int hashCode() {
        xn.e1 e1Var = this.a;
        int hashCode = (e1Var == null ? 0 : e1Var.hashCode()) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.d;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        xn.f1 f1Var = this.e;
        return hashCode4 + (f1Var != null ? f1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CopilotPermissionsFieldOverrides(licenseType=" + this.a + ", isCopilotMobileChatEnabled=" + this.b + ", viewerIsCopilotCodingAgentEnabled=" + this.c + ", viewerCanSubscribeToCopilotLimited=" + this.d + ", copilotUserLimits=" + this.e + ")";
    }

    public /* synthetic */ d(xn.f1 f1Var, int i) {
        this((i & 1) != 0 ? null : xn.e1.y, (i & 2) != 0 ? null : Boolean.TRUE, null, null, (i & 16) != 0 ? null : f1Var);
    }
}
