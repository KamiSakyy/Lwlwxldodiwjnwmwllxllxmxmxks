package a01;

import com.github.rudroid.copilot.h1;
import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public boolean a;
    public String b;
    public String c;
    public List d;

    public c(String str, String str2, List list, boolean z) {
        k.g(str, "environmentName");
        k.g(str2, "environmentId");
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h1.i(h1.i(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder t = h1.t("DeploymentApprovalRequest(currentUserCanApprove=", ", environmentName=", this.b, ", environmentId=", this.a);
        t.append(this.c);
        t.append(", approverList=");
        t.append(this.d);
        t.append(")");
        return t.toString();
    }
}
