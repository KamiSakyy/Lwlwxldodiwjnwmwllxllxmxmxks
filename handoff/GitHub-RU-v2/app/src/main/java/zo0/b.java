package zo0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public class b {
    public String a;
    public String b;
    public String c;
    public String d;

    public b(String str, String str2, String str3, String str4) {
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && k.b(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return i.k(s0.o("RefComparisonFilesChangedParameters(ownerName=", this.a, ", repoName=", this.b, ", baseRefName="), this.c, ", headRefName=", this.d, ")");
    }
}
