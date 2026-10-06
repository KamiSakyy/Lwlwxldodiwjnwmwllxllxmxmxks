package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 {
    public String a;
    public s1 b;
    public m10.xz c;
    public Integer d;
    public u1 e;
    public String f;
    public m10.fz g;
    public String h;
    public String i;
    public pv.c j;
    public ar.c k;
    public mx.c l;
    public ju.a m;

    public i1(String str, s1 s1Var, m10.xz xzVar, Integer num, u1 u1Var, String str2, m10.fz fzVar, String str3, String str4, pv.c cVar, ar.c cVar2, mx.c cVar3, ju.a aVar) {
        this.a = str;
        this.b = s1Var;
        this.c = xzVar;
        this.d = num;
        this.e = u1Var;
        this.f = str2;
        this.g = fzVar;
        this.h = str3;
        this.i = str4;
        this.j = cVar;
        this.k = cVar2;
        this.l = cVar3;
        this.m = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return k71.k.b(this.a, i1Var.a) && k71.k.b(this.b, i1Var.b) && this.c == i1Var.c && k71.k.b(this.d, i1Var.d) && k71.k.b(this.e, i1Var.e) && k71.k.b(this.f, i1Var.f) && this.g == i1Var.g && k71.k.b(this.h, i1Var.h) && k71.k.b(this.i, i1Var.i) && k71.k.b(this.j, i1Var.j) && k71.k.b(this.k, i1Var.k) && k71.k.b(this.l, i1Var.l) && k71.k.b(this.m, i1Var.m);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s1 s1Var = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (s1Var == null ? 0 : s1Var.hashCode())) * 31)) * 31;
        Integer num = this.d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        u1 u1Var = this.e;
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((this.g.hashCode() + com.github.rudroid.copilot.h1.i((hashCode3 + (u1Var != null ? u1Var.hashCode() : 0)) * 31, this.f, 31)) * 31, this.h, 31), this.i, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Comment(__typename=" + this.a + ", pullRequestReview=" + this.b + ", subjectType=" + this.c + ", position=" + this.d + ", thread=" + this.e + ", path=" + this.f + ", state=" + this.g + ", url=" + this.h + ", id=" + this.i + ", reactionFragment=" + this.j + ", commentFragment=" + this.k + ", updatableFragment=" + this.l + ", minimizableCommentFragment=" + this.m + ")";
    }
}
