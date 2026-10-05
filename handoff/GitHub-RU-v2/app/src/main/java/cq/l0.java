package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final k0 h;
    public final pv.c i;

    public l0(String str, String str2, String str3, String str4, String str5, String str6, int i, k0 k0Var, pv.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = k0Var;
        this.i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return k71.k.b(this.a, l0Var.a) && k71.k.b(this.b, l0Var.b) && k71.k.b(this.c, l0Var.c) && k71.k.b(this.d, l0Var.d) && k71.k.b(this.e, l0Var.e) && k71.k.b(this.f, l0Var.f) && this.g == l0Var.g && k71.k.b(this.h, l0Var.h) && k71.k.b(this.i, l0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + a0.s0.b(this.g, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DiscussionFeedFragment(__typename=", this.a, ", id=", this.b, ", url=");
        f1.e.x(o, this.c, ", title=", this.d, ", bodyHTML=");
        f1.e.x(o, this.e, ", bodyText=", this.f, ", number=");
        o.append(this.g);
        o.append(", repository=");
        o.append(this.h);
        o.append(", reactionFragment=");
        o.append(this.i);
        o.append(")");
        return o.toString();
    }
}
