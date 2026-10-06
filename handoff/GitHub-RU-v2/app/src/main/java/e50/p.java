package e50;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p implements aa.h0 {
    public String a;
    public String b;
    public m c;
    public i80.c d;

    public p(String str, String str2, m mVar, i80.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = mVar;
        this.d = cVar;
    }

    public static p a(p pVar, m mVar) {
        return new p(pVar.a, pVar.b, mVar, pVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && k71.k.b(this.b, pVar.b) && k71.k.b(this.c, pVar.c) && k71.k.b(this.d, pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DiscussionCommentsFragment(__typename=", this.a, ", id=", this.b, ", comments=");
        o.append(this.c);
        o.append(", reactionFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
