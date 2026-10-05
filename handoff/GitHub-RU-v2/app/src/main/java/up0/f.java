package up0;

import aa.h0;
import com.github.rudroid.copilot.h1;
import pz0.e3;
import pz0.y2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements h0 {
    public final String a;
    public final e3 b;
    public final String c;
    public final y2 d;
    public final String e;
    public final a f;
    public final e g;
    public final String h;

    public f(String str, e3 e3Var, String str2, y2 y2Var, String str3, a aVar, e eVar, String str4) {
        this.a = str;
        this.b = e3Var;
        this.c = str2;
        this.d = y2Var;
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
        y2 y2Var = this.d;
        int i2 = h1.i((i + (y2Var == null ? 0 : y2Var.hashCode())) * 31, this.e, 31);
        a aVar = this.f;
        int hashCode = (i2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e eVar = this.g;
        return this.h.hashCode() + ((hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DeploymentReviewApprovalCheckRun(name=" + this.a + ", status=" + this.b + ", id=" + this.c + ", conclusion=" + this.d + ", permalink=" + this.e + ", deployment=" + this.f + ", steps=" + this.g + ", __typename=" + this.h + ")";
    }
}
