package mn;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public final String a;
    public final String b;
    public final String c;
    public final CheckStatusState d;
    public final CheckConclusionState e;
    public final e f;
    public final String g;

    public f(String str, String str2, String str3, CheckStatusState checkStatusState, CheckConclusionState checkConclusionState, e eVar, String str4) {
        k71.k.g(str, "id");
        k71.k.g(str2, "name");
        k71.k.g(checkStatusState, "status");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = checkStatusState;
        this.e = checkConclusionState;
        this.f = eVar;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && k71.k.b(this.b, fVar.b) && k71.k.b(this.c, fVar.c) && this.d == fVar.d && this.e == fVar.e && k71.k.b(this.f, fVar.f) && k71.k.b(this.g, fVar.g);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int hashCode = (this.d.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        CheckConclusionState checkConclusionState = this.e;
        int hashCode2 = (this.f.hashCode() + ((hashCode + (checkConclusionState == null ? 0 : checkConclusionState.hashCode())) * 31)) * 31;
        String str2 = this.g;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("ActionCheckSuite(id=", this.a, ", name=", this.b, ", logoUrl=");
        o.append(this.c);
        o.append(", status=");
        o.append(this.d);
        o.append(", conclusion=");
        o.append(this.e);
        o.append(", checkRuns=");
        o.append(this.f);
        o.append(", workflowRunId=");
        return h1.p(o, this.g, ")");
    }
}
