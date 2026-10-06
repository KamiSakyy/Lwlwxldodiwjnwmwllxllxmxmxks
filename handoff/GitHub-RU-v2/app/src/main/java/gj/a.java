package gj;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public String a;
    public String b;
    public long c;

    public a(long j, String str, String str2) {
        k.g(str, "query");
        k.g(str2, "repoOwnerAndName");
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && this.c == aVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return s0.f(this.c, ")", s0.o("RepositoryCodeSearch(query=", this.a, ", repoOwnerAndName=", this.b, ", performedAt="));
    }
}
