package a01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import java.util.List;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final List e;

    public f(int i, String str, String str2, String str3, List list) {
        k.g(str, "id");
        k.g(str2, "url");
        k.g(str3, "workFlowName");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.b(this.a, fVar.a) && k.b(this.b, fVar.b) && this.c == fVar.c && k.b(this.d, fVar.d) && k.b(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i(s0.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("DeploymentReviewWorkFlowRun(id=", this.a, ", url=", this.b, ", workFlowRunNumber=");
        i.r(this.c, ", workFlowName=", this.d, ", pendingDeploymentRequest=", o);
        return i.l(o, this.e, ")");
    }
}
