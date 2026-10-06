package wq;

import aa.h0;
import com.github.rudroid.copilot.h1;
import m10.b4;
import m10.t3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements h0 {
    public String a;
    public b4 b;
    public String c;
    public t3 d;
    public String e;
    public a f;
    public e g;
    public String h;

    public f(String str, b4 b4Var, String str2, t3 t3Var, String str3, a aVar, e eVar, String str4) {
        this.a = str;
        this.b = b4Var;
        this.c = str2;
        this.d = t3Var;
        this.e = str3;
        this.f = aVar;
        this.g = eVar;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && this.b == fVar.b && k71.k.b(this.c, fVar.c) && this.d == fVar.d && k71.k.b(this.e, fVar.e) && k71.k.b(this.f, fVar.f) && k71.k.b(this.g, fVar.g) && k71.k.b(this.h, fVar.h);
    }

    public final int hashCode() {
        int i = h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
        t3 t3Var = this.d;
        int i2 = h1.i((i + (t3Var == null ? 0 : t3Var.hashCode())) * 31, this.e, 31);
        a aVar = this.f;
        int hashCode = (i2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e eVar = this.g;
        return this.h.hashCode() + ((hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DeploymentReviewApprovalCheckRun(name=" + this.a + ", status=" + this.b + ", id=" + this.c + ", conclusion=" + this.d + ", permalink=" + this.e + ", deployment=" + this.f + ", steps=" + this.g + ", __typename=" + this.h + ")";
    }
}
