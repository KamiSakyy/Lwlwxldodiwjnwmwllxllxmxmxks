package jy;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;
import s01.m;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements m {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public c(String str, String str2, String str3) {
        k.g(str, "queryString");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = p10.c.a(str);
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c);
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
