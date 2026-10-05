package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 {
    public final String a;
    public final n1 b;
    public final hc0.bm c;
    public final Integer d;
    public final p1 e;
    public final String f;
    public final hc0.jl g;
    public final String h;
    public final String i;
    public final i80.c j;
    public final c40.c k;
    public final aa0.c l;
    public final y60.a m;

    public d1(String str, n1 n1Var, hc0.bm bmVar, Integer num, p1 p1Var, String str2, hc0.jl jlVar, String str3, String str4, i80.c cVar, c40.c cVar2, aa0.c cVar3, y60.a aVar) {
        this.a = str;
        this.b = n1Var;
        this.c = bmVar;
        this.d = num;
        this.e = p1Var;
        this.f = str2;
        this.g = jlVar;
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
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return k71.k.b(this.a, d1Var.a) && k71.k.b(this.b, d1Var.b) && this.c == d1Var.c && k71.k.b(this.d, d1Var.d) && k71.k.b(this.e, d1Var.e) && k71.k.b(this.f, d1Var.f) && this.g == d1Var.g && k71.k.b(this.h, d1Var.h) && k71.k.b(this.i, d1Var.i) && k71.k.b(this.j, d1Var.j) && k71.k.b(this.k, d1Var.k) && k71.k.b(this.l, d1Var.l) && k71.k.b(this.m, d1Var.m);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n1 n1Var = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (n1Var == null ? 0 : n1Var.hashCode())) * 31)) * 31;
        Integer num = this.d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        p1 p1Var = this.e;
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((this.g.hashCode() + com.github.rudroid.copilot.h1.i((hashCode3 + (p1Var != null ? p1Var.hashCode() : 0)) * 31, this.f, 31)) * 31, this.h, 31), this.i, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Comment(__typename=" + this.a + ", pullRequestReview=" + this.b + ", subjectType=" + this.c + ", position=" + this.d + ", thread=" + this.e + ", path=" + this.f + ", state=" + this.g + ", url=" + this.h + ", id=" + this.i + ", reactionFragment=" + this.j + ", commentFragment=" + this.k + ", updatableFragment=" + this.l + ", minimizableCommentFragment=" + this.m + ")";
    }
}
