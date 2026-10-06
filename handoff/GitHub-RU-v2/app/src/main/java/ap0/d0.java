package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d0 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public c0 h;
    public gu0.c i;

    public d0(String str, String str2, String str3, String str4, String str5, String str6, int i, c0 c0Var, gu0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = c0Var;
        this.i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return k71.k.b(this.a, d0Var.a) && k71.k.b(this.b, d0Var.b) && k71.k.b(this.c, d0Var.c) && k71.k.b(this.d, d0Var.d) && k71.k.b(this.e, d0Var.e) && k71.k.b(this.f, d0Var.f) && this.g == d0Var.g && k71.k.b(this.h, d0Var.h) && k71.k.b(this.i, d0Var.i);
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

    public Object e;
}
