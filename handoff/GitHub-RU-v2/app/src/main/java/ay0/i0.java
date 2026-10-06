package ay0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 implements aa.h0 {
    public String a;
    public a0 b;
    public b0 c;
    public c0 d;
    public d0 e;
    public e0 f;
    public f0 g;
    public g0 h;
    public h0 i;

    public i0(String str, a0 a0Var, b0 b0Var, c0 c0Var, d0 d0Var, e0 e0Var, f0 f0Var, g0 g0Var, h0 h0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = a0Var;
        this.c = b0Var;
        this.d = c0Var;
        this.e = d0Var;
        this.f = e0Var;
        this.g = f0Var;
        this.h = g0Var;
        this.i = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return k71.k.b(this.a, i0Var.a) && k71.k.b(this.b, i0Var.b) && k71.k.b(this.c, i0Var.c) && k71.k.b(this.d, i0Var.d) && k71.k.b(this.e, i0Var.e) && k71.k.b(this.f, i0Var.f) && k71.k.b(this.g, i0Var.g) && k71.k.b(this.h, i0Var.h) && k71.k.b(this.i, i0Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a0 a0Var = this.b;
        int hashCode2 = (hashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        b0 b0Var = this.c;
        int hashCode3 = (hashCode2 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        c0 c0Var = this.d;
        int hashCode4 = (hashCode3 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        d0 d0Var = this.e;
        int hashCode5 = (hashCode4 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        e0 e0Var = this.f;
        int hashCode6 = (hashCode5 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        f0 f0Var = this.g;
        int hashCode7 = (hashCode6 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        g0 g0Var = this.h;
        int hashCode8 = (hashCode7 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        h0 h0Var = this.i;
        return hashCode8 + (h0Var != null ? h0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ProjectV2GroupValueFragment(__typename=" + this.a + ", onProjectV2GroupAssigneeValue=" + this.b + ", onProjectV2GroupDateValue=" + this.c + ", onProjectV2GroupIterationValue=" + this.d + ", onProjectV2GroupMilestoneValue=" + this.e + ", onProjectV2GroupNumberValue=" + this.f + ", onProjectV2GroupRepositoryValue=" + this.g + ", onProjectV2GroupSingleSelectValue=" + this.h + ", onProjectV2GroupTextValue=" + this.i + ")";
    }
}
