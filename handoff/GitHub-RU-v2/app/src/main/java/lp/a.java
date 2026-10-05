package lp;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public a(String str, String str2, String str3, String str4) {
        k.g(str, "ownerName");
        k.g(str2, "repoName");
        k.g(str3, "baseRefName");
        k.g(str4, "headRefName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && k.b(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return i.k(s0.o("RefComparisonCommitsParameters(ownerName=", this.a, ", repoName=", this.b, ", baseRefName="), this.c, ", headRefName=", this.d, ")");
    }
}
