package mn;

import a0.s0;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;

/* loaded from: /home/user/work/p/classes3.dex */
public class s {
    public String a;
    public CheckStatusState b;
    public String c;
    public int d;
    public CheckConclusionState e;
    public String f;
    public r g;

    public s(String str, CheckStatusState checkStatusState, String str2, int i, CheckConclusionState checkConclusionState, String str3, r rVar) {
        k71.k.g(str, "id");
        k71.k.g(checkStatusState, "status");
        this.a = str;
        this.b = checkStatusState;
        this.c = str2;
        this.d = i;
        this.e = checkConclusionState;
        this.f = str3;
        this.g = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && this.b == sVar.b && k71.k.b(this.c, sVar.c) && this.d == sVar.d && this.e == sVar.e && k71.k.b(this.f, sVar.f) && k71.k.b(this.g, sVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int b = s0.b(this.d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        CheckConclusionState checkConclusionState = this.e;
        int hashCode2 = (b + (checkConclusionState == null ? 0 : checkConclusionState.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        r rVar = this.g;
        return hashCode3 + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkflowCheckSuiteInfo(id=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", creator=");
        s0.w(this.d, this.c, ", duration=", ", conclusion=", sb);
        sb.append(this.e);
        sb.append(", branch=");
        sb.append(this.f);
        sb.append(", matchingPullRequest=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
