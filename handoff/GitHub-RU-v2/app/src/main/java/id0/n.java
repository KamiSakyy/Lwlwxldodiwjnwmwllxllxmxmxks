package id0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements s01.m {
    public final String a;
    public final String b;
    public final String c;

    public n(String str, String str2, String str3) {
        k71.k.g(str, "queryString");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // s01.m
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b) && k71.k.b(this.c, nVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return h1.p(s0.o("SearchDiscussionsParameters(queryString=", this.a, ", owner=", this.b, ", name="), this.c, ")");
    }
}
