package ri0;

import gn0.lm;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s7 implements aa.h0 {
    public final String a;
    public final String b;
    public final Integer c;
    public final p7 d;
    public final r7 e;
    public final String f;
    public final lm g;
    public final String h;
    public final se0.c i;
    public final aj0.c j;
    public final sk0.c k;
    public final yh0.a l;
    public final qh0.a m;

    public s7(String str, String str2, Integer num, p7 p7Var, r7 r7Var, String str3, lm lmVar, String str4, se0.c cVar, aj0.c cVar2, sk0.c cVar3, yh0.a aVar, qh0.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = p7Var;
        this.e = r7Var;
        this.f = str3;
        this.g = lmVar;
        this.h = str4;
        this.i = cVar;
        this.j = cVar2;
        this.k = cVar3;
        this.l = aVar;
        this.m = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7)) {
            return false;
        }
        s7 s7Var = (s7) obj;
        return k71.k.b(this.a, s7Var.a) && k71.k.b(this.b, s7Var.b) && k71.k.b(this.c, s7Var.c) && k71.k.b(this.d, s7Var.d) && k71.k.b(this.e, s7Var.e) && k71.k.b(this.f, s7Var.f) && this.g == s7Var.g && k71.k.b(this.h, s7Var.h) && k71.k.b(this.i, s7Var.i) && k71.k.b(this.j, s7Var.j) && k71.k.b(this.k, s7Var.k) && k71.k.b(this.l, s7Var.l) && k71.k.b(this.m, s7Var.m);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        Integer num = this.c;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        p7 p7Var = this.d;
        int hashCode2 = (hashCode + (p7Var == null ? 0 : p7Var.hashCode())) * 31;
        r7 r7Var = this.e;
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + com.github.rudroid.copilot.h1.i((this.g.hashCode() + com.github.rudroid.copilot.h1.i((hashCode2 + (r7Var != null ? r7Var.hashCode() : 0)) * 31, this.f, 31)) * 31, this.h, 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ReviewThreadCommentFragment(__typename=", this.a, ", id=", this.b, ", position=");
        o.append(this.c);
        o.append(", pullRequestReview=");
        o.append(this.d);
        o.append(", thread=");
        o.append(this.e);
        o.append(", path=");
        o.append(this.f);
        o.append(", state=");
        o.append(this.g);
        o.append(", url=");
        o.append(this.h);
        o.append(", commentFragment=");
        o.append(this.i);
        o.append(", reactionFragment=");
        o.append(this.j);
        o.append(", updatableFragment=");
        o.append(this.k);
        o.append(", orgBlockableFragment=");
        o.append(this.l);
        o.append(", minimizableCommentFragment=");
        o.append(this.m);
        o.append(")");
        return o.toString();
    }
}
