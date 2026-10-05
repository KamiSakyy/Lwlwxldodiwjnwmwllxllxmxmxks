package sw0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;
import s01.m;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements m {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public d(String str, String str2, String str3) {
        k.g(str, "queryString");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = p10.c.a(str);
    }

    @Override // s01.m
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return h1.p(s0.o("SearchIssueParameters(queryString=", this.a, ", owner=", this.b, ", name="), this.c, ")");
    }
}
