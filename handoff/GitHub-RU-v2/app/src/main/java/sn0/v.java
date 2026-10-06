package sn0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v {
    public String a;
    public String b;
    public String c;

    public v(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b) && k71.k.b(this.c, vVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return h1.p(s0.o("OnPullRequest(id=", this.a, ", fullDatabaseId=", this.b, ", updatesChannel="), this.c, ")");
    }
}
