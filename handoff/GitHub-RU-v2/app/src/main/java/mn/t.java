package mn;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public t(String str, String str2, String str3, boolean z) {
        k71.k.g(str, "name");
        k71.k.g(str2, "owner");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && k71.k.b(this.b, tVar.b) && k71.k.b(this.c, tVar.c) && this.d == tVar.d;
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return m0.k(s0.o("WorkflowRunRepositoryInfo(name=", this.a, ", owner=", this.b, ", defaultBranchName="), this.c, ", viewerCanManageActions=", this.d, ")");
    }
}
