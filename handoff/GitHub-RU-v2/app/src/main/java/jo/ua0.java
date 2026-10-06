package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ua0 {
    public String a;
    public String b;
    public za0 c;
    public ms.i d;

    public ua0(String str, String str2, za0 za0Var, ms.i iVar) {
        this.a = str;
        this.b = str2;
        this.c = za0Var;
        this.d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua0)) {
            return false;
        }
        ua0 ua0Var = (ua0) obj;
        return k71.k.b(this.a, ua0Var.a) && k71.k.b(this.b, ua0Var.b) && k71.k.b(this.c, ua0Var.c) && k71.k.b(this.d, ua0Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        za0 za0Var = this.c;
        return this.d.hashCode() + ((i + (za0Var == null ? 0 : za0Var.hashCode())) * 31);
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
