package nm0;

import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements h0 {
    public String a;
    public boolean b;
    public String c;

    public a(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b == aVar.b && k.b(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return h1.p(m0.o("RepositoryCreateIssueInformationFragment(id=", this.a, ", isInOrganization=", ", __typename=", this.b), this.c, ")");
    }
}
