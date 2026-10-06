package xt0;

import pz0.kt;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k7 implements aa.h0 {
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final h7 f;
    public final j7 g;
    public final String h;
    public final kt i;
    public final String j;
    public final yp0.c k;
    public final gu0.c l;
    public final bw0.c m;
    public final gt0.a n;
    public final at0.a o;

    public k7(String str, String str2, Integer num, Integer num2, Integer num3, h7 h7Var, j7 j7Var, String str3, kt ktVar, String str4, yp0.c cVar, gu0.c cVar2, bw0.c cVar3, gt0.a aVar, at0.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = h7Var;
        this.g = j7Var;
        this.h = str3;
        this.i = ktVar;
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
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return k71.k.b(this.a, k7Var.a) && k71.k.b(this.b, k7Var.b) && k71.k.b(this.c, k7Var.c) && k71.k.b(this.d, k7Var.d) && k71.k.b(this.e, k7Var.e) && k71.k.b(this.f, k7Var.f) && k71.k.b(this.g, k7Var.g) && k71.k.b(this.h, k7Var.h) && this.i == k7Var.i && k71.k.b(this.j, k7Var.j) && k71.k.b(this.k, k7Var.k) && k71.k.b(this.l, k7Var.l) && k71.k.b(this.m, k7Var.m) && k71.k.b(this.n, k7Var.n) && k71.k.b(this.o, k7Var.o);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        Integer num = this.c;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        h7 h7Var = this.f;
        int hashCode4 = (hashCode3 + (h7Var == null ? 0 : h7Var.hashCode())) * 31;
        j7 j7Var = this.g;
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + com.github.rudroid.copilot.h1.i((this.i.hashCode() + com.github.rudroid.copilot.h1.i((hashCode4 + (j7Var != null ? j7Var.hashCode() : 0)) * 31, this.h, 31)) * 31, this.j, 31)) * 31)) * 31)) * 31)) * 31);
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
