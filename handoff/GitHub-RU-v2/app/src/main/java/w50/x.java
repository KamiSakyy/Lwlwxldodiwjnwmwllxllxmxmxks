package w50;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x implements aa.h0 {
    public final String a;
    public final String b;
    public final w c;

    public x(String str, String str2, w wVar) {
        this.a = str;
        this.b = str2;
        this.c = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b) && k71.k.b(this.c, xVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("IssueTimelineFragment(__typename=", this.a, ", id=", this.b, ", timelineItems=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
