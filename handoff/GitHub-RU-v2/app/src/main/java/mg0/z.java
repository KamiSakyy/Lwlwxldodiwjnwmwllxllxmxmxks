package mg0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z implements aa.h0 {
    public final String a;
    public final String b;
    public final y c;

    public z(String str, String str2, y yVar) {
        this.a = str;
        this.b = str2;
        this.c = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return k71.k.b(this.a, zVar.a) && k71.k.b(this.b, zVar.b) && k71.k.b(this.c, zVar.c);
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
