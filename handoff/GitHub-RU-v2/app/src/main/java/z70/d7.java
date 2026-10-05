package z70;

import hc0.jl;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d7 implements aa.h0 {
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final a7 e;
    public final c7 f;
    public final String g;
    public final jl h;
    public final String i;
    public final c40.c j;
    public final i80.c k;
    public final aa0.c l;
    public final g70.a m;
    public final y60.a n;

    public d7(String str, String str2, Integer num, Integer num2, a7 a7Var, c7 c7Var, String str3, jl jlVar, String str4, c40.c cVar, i80.c cVar2, aa0.c cVar3, g70.a aVar, y60.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
        this.e = a7Var;
        this.f = c7Var;
        this.g = str3;
        this.h = jlVar;
        this.i = str4;
        this.j = cVar;
        this.k = cVar2;
        this.l = cVar3;
        this.m = aVar;
        this.n = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj;
        return k71.k.b(this.a, d7Var.a) && k71.k.b(this.b, d7Var.b) && k71.k.b(this.c, d7Var.c) && k71.k.b(this.d, d7Var.d) && k71.k.b(this.e, d7Var.e) && k71.k.b(this.f, d7Var.f) && k71.k.b(this.g, d7Var.g) && this.h == d7Var.h && k71.k.b(this.i, d7Var.i) && k71.k.b(this.j, d7Var.j) && k71.k.b(this.k, d7Var.k) && k71.k.b(this.l, d7Var.l) && k71.k.b(this.m, d7Var.m) && k71.k.b(this.n, d7Var.n);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        Integer num = this.c;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        a7 a7Var = this.e;
        int hashCode3 = (hashCode2 + (a7Var == null ? 0 : a7Var.hashCode())) * 31;
        c7 c7Var = this.f;
        return this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + com.github.rudroid.copilot.h1.i((this.h.hashCode() + com.github.rudroid.copilot.h1.i((hashCode3 + (c7Var != null ? c7Var.hashCode() : 0)) * 31, this.g, 31)) * 31, this.i, 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ReviewThreadCommentFragment(__typename=", this.a, ", id=", this.b, ", position=");
        o.append(this.c);
        o.append(", line=");
        o.append(this.d);
        o.append(", pullRequestReview=");
        o.append(this.e);
        o.append(", thread=");
        o.append(this.f);
        o.append(", path=");
        o.append(this.g);
        o.append(", state=");
        o.append(this.h);
        o.append(", url=");
        o.append(this.i);
        o.append(", commentFragment=");
        o.append(this.j);
        o.append(", reactionFragment=");
        o.append(this.k);
        o.append(", updatableFragment=");
        o.append(this.l);
        o.append(", orgBlockableFragment=");
        o.append(this.m);
        o.append(", minimizableCommentFragment=");
        o.append(this.n);
        o.append(")");
        return o.toString();
    }
}
