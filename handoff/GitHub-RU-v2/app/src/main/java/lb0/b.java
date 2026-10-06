package lb0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;
import p10.c;
import s01.m;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements m {
    public String a;
    public String b;
    public String c;
    public String d;

    public b(String str, String str2, String str3) {
        k.g(str, "queryString");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c.a(str);
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return h1.p(s0.o("SearchPullRequestsParameters(queryString=", this.a, ", owner=", this.b, ", name="), this.c, ")");
    }
}
