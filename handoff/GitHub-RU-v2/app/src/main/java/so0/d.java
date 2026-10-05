package so0;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public final List a;
    public final String b;
    public final String c;

    public d(String str, String str2, List list) {
        this.a = list;
        this.b = str;
        this.c = str2;
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
        List list = this.a;
        return this.c.hashCode() + h1.i((list == null ? 0 : list.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        return h1.p(m0.n("Viewer(featureFlags=", ", id=", this.b, ", __typename=", this.a), this.c, ")");
    }
}
