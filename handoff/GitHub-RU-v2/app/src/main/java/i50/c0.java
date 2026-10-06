package i50;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 implements h0 {
    public final String a;
    public final String b;
    public final b0 c;
    public final h d;
    public final i80.c e;

    public c0(String str, String str2, b0 b0Var, h hVar, i80.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = b0Var;
        this.d = hVar;
        this.e = cVar;
    }

    public static c0 a(c0 c0Var, b0 b0Var, h hVar, int i) {
        String str = c0Var.a;
        String str2 = c0Var.b;
        if ((i & 8) != 0) {
            hVar = c0Var.d;
        }
        i80.c cVar = c0Var.e;
        c0Var.getClass();
        return new c0(str, str2, b0Var, hVar, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return k71.k.b(this.a, c0Var.a) && k71.k.b(this.b, c0Var.b) && k71.k.b(this.c, c0Var.c) && k71.k.b(this.d, c0Var.d) && k71.k.b(this.e, c0Var.e);
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
