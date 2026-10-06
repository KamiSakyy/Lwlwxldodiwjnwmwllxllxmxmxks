package e50;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {
    public final String a;
    public final String b;
    public final j0 c;
    public final i50.h d;

    public c0(String str, String str2, j0 j0Var, i50.h hVar) {
        this.a = str;
        this.b = str2;
        this.c = j0Var;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return k71.k.b(this.a, c0Var.a) && k71.k.b(this.b, c0Var.b) && k71.k.b(this.c, c0Var.c) && k71.k.b(this.d, c0Var.d);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        j0 j0Var = this.c;
        return this.d.hashCode() + ((i + (j0Var == null ? 0 : j0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Answer(__typename=", this.a, ", id=", this.b, ", replyTo=");
        o.append(this.c);
        o.append(", discussionCommentFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
    public Object a = null;
    public Object b = null;
    public Object c = null;
    public Object d = null;
    public Object e = null;
    public Object f = null;
    public Object g = null;
    public Object h = null;
}
