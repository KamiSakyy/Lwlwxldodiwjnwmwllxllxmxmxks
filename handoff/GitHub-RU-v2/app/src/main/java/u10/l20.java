package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l20 {
    public final String a;
    public final String b;
    public final q20 c;
    public final i50.h d;

    public l20(String str, String str2, q20 q20Var, i50.h hVar) {
        this.a = str;
        this.b = str2;
        this.c = q20Var;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l20)) {
            return false;
        }
        l20 l20Var = (l20) obj;
        return k71.k.b(this.a, l20Var.a) && k71.k.b(this.b, l20Var.b) && k71.k.b(this.c, l20Var.c) && k71.k.b(this.d, l20Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        q20 q20Var = this.c;
        return this.d.hashCode() + ((i + (q20Var == null ? 0 : q20Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Answer(__typename=", this.a, ", id=", this.b, ", replyTo=");
        o.append(this.c);
        o.append(", discussionCommentFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
