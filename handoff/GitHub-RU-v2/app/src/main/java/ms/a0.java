package ms;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 {
    public final String a;
    public final String b;
    public final v c;

    public a0(String str, String str2, v vVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = vVar;
    }

    public static a0 a(a0 a0Var, v vVar) {
        String str = a0Var.a;
        String str2 = a0Var.b;
        k71.k.g(str, "__typename");
        return new a0(str, str2, vVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return k71.k.b(this.a, a0Var.a) && k71.k.b(this.b, a0Var.b) && k71.k.b(this.c, a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", discussionCommentReplyFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
