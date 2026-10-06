package q01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.LegacyProjectWithNumber;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements a {
    public String a;
    public String b;
    public boolean c;
    public String d;
    public LegacyProjectWithNumber e;

    public f(String str, String str2, boolean z, String str3, LegacyProjectWithNumber legacyProjectWithNumber) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = legacyProjectWithNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && k71.k.b(this.b, fVar.b) && this.c == fVar.c && k71.k.b(this.d, fVar.d) && k71.k.b(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i(x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("SearchShortcutQueryProjectTerm(term=", this.a, ", name=", this.b, ", negative=");
        m0.z(o, this.c, ", value=", this.d, ", project=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
