package gv;

import m10.fz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y7 implements aa.h0 {
    public String a;
    public String b;
    public Integer c;
    public Integer d;
    public Integer e;
    public v7 f;
    public x7 g;
    public String h;
    public fz i;
    public String j;
    public ar.c k;
    public pv.c l;
    public mx.c m;
    public pu.a n;
    public ju.a o;

    public y7(String str, String str2, Integer num, Integer num2, Integer num3, v7 v7Var, x7 x7Var, String str3, fz fzVar, String str4, ar.c cVar, pv.c cVar2, mx.c cVar3, pu.a aVar, ju.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = v7Var;
        this.g = x7Var;
        this.h = str3;
        this.i = fzVar;
        this.j = str4;
        this.k = cVar;
        this.l = cVar2;
        this.m = cVar3;
        this.n = aVar;
        this.o = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        return k71.k.b(this.a, y7Var.a) && k71.k.b(this.b, y7Var.b) && k71.k.b(this.c, y7Var.c) && k71.k.b(this.d, y7Var.d) && k71.k.b(this.e, y7Var.e) && k71.k.b(this.f, y7Var.f) && k71.k.b(this.g, y7Var.g) && k71.k.b(this.h, y7Var.h) && this.i == y7Var.i && k71.k.b(this.j, y7Var.j) && k71.k.b(this.k, y7Var.k) && k71.k.b(this.l, y7Var.l) && k71.k.b(this.m, y7Var.m) && k71.k.b(this.n, y7Var.n) && k71.k.b(this.o, y7Var.o);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        Integer num = this.c;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        v7 v7Var = this.f;
        int hashCode4 = (hashCode3 + (v7Var == null ? 0 : v7Var.hashCode())) * 31;
        x7 x7Var = this.g;
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + com.github.rudroid.copilot.h1.i((this.i.hashCode() + com.github.rudroid.copilot.h1.i((hashCode4 + (x7Var != null ? x7Var.hashCode() : 0)) * 31, this.h, 31)) * 31, this.j, 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ReviewThreadCommentFragment(__typename=", this.a, ", id=", this.b, ", position=");
        o.append(this.c);
        o.append(", startLine=");
        o.append(this.d);
        o.append(", line=");
        o.append(this.e);
        o.append(", pullRequestReview=");
        o.append(this.f);
        o.append(", thread=");
        o.append(this.g);
        o.append(", path=");
        o.append(this.h);
        o.append(", state=");
        o.append(this.i);
        o.append(", url=");
        o.append(this.j);
        o.append(", commentFragment=");
        o.append(this.k);
        o.append(", reactionFragment=");
        o.append(this.l);
        o.append(", updatableFragment=");
        o.append(this.m);
        o.append(", orgBlockableFragment=");
        o.append(this.n);
        o.append(", minimizableCommentFragment=");
        o.append(this.o);
        o.append(")");
        return o.toString();
    }
}
