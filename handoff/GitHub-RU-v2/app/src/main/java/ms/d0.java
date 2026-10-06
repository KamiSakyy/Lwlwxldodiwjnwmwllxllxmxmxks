package ms;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 implements aa.h0 {
    public final String a;
    public final String b;
    public final c0 c;
    public final i d;
    public final pv.c e;

    public d0(String str, String str2, c0 c0Var, i iVar, pv.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = c0Var;
        this.d = iVar;
        this.e = cVar;
    }

    public static d0 a(d0 d0Var, c0 c0Var, i iVar, int i) {
        String str = d0Var.a;
        String str2 = d0Var.b;
        if ((i & 8) != 0) {
            iVar = d0Var.d;
        }
        pv.c cVar = d0Var.e;
        d0Var.getClass();
        return new d0(str, str2, c0Var, iVar, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return k71.k.b(this.a, d0Var.a) && k71.k.b(this.b, d0Var.b) && k71.k.b(this.c, d0Var.c) && k71.k.b(this.d, d0Var.d) && k71.k.b(this.e, d0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("DiscussionSubThreadHeadFragment(__typename=", this.a, ", id=", this.b, ", replies=");
        o.append(this.c);
        o.append(", discussionCommentFragment=");
        o.append(this.d);
        o.append(", reactionFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }

    public static Object a;
}
