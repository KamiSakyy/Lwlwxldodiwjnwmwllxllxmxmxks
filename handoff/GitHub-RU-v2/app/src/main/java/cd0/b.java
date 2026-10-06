package cd0;

import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public String a;
    public String b;

    public b(String str, String str2) {
        k.g(str, "checkSuiteId");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return i.g("CheckSuiteSummaryParameters(checkSuiteId=", this.a, ", pullRequestId=", this.b, ")");
    }
}
