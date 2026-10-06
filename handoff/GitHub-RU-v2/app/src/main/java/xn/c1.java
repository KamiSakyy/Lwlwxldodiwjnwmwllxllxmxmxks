package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c1 extends b1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public String r;
    public String s;
    public v t;
    public boolean u;
    public j v;
    public h w;
    public m x;
    public k y;
    public g z;

    public c1(String str, String str2, g gVar, h hVar, j jVar, k kVar, m mVar, v vVar, boolean z, boolean z2, boolean z3, boolean z4) {
        k71.k.g(str, "name");
        k71.k.g(str2, "id");
        this.r = str;
        this.s = str2;
        this.t = vVar;
        this.u = z;
        this.v = jVar;
        this.w = hVar;
        this.x = mVar;
        this.y = kVar;
        this.z = gVar;
        this.A = z2;
        this.B = z3;
        this.C = z4;
    }

    @Override // xn.b1
    public final v C() {
        return this.t;
    }

    @Override // xn.b1
    public final boolean E() {
        return this.A;
    }

    @Override // xn.b1
    public final g c() {
        return this.z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return k71.k.b(this.r, c1Var.r) && k71.k.b(this.s, c1Var.s) && k71.k.b(this.t, c1Var.t) && this.u == c1Var.u && this.v == c1Var.v && k71.k.b(this.w, c1Var.w) && k71.k.b(this.x, c1Var.x) && k71.k.b(this.y, c1Var.y) && k71.k.b(this.z, c1Var.z) && this.A == c1Var.A && this.B == c1Var.B && this.C == c1Var.C;
    }

    @Override // xn.b1
    public final String getId() {
        return this.s;
    }

    @Override // xn.b1
    public final String getName() {
        return this.r;
    }

    @Override // xn.b1
    public final h h() {
        return this.w;
    }

    public final int hashCode() {
        int hashCode = (this.w.hashCode() + ((this.v.hashCode() + x.i.e((this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31)) * 31, 31, this.u)) * 31)) * 31;
        m mVar = this.x;
        int hashCode2 = (hashCode + (mVar == null ? 0 : Boolean.hashCode(mVar.r))) * 31;
        k kVar = this.y;
        int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        g gVar = this.z;
        return Boolean.hashCode(this.C) + x.i.e(x.i.e((hashCode3 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31, this.A), 31, this.B);
    }

    @Override // xn.b1
    public final j j() {
        return this.v;
    }

    @Override // xn.b1
    public final boolean o() {
        return this.u;
    }

    @Override // xn.b1
    public final k r() {
        return this.y;
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("CopilotChatAiModel(name=", this.r, ", id=", this.s, ", vendor=");
        o.append(this.t);
        o.append(", modelPickerEnabled=");
        o.append(this.u);
        o.append(", modelPickerCategory=");
        o.append(this.v);
        o.append(", capabilities=");
        o.append(this.w);
        o.append(", supports=");
        o.append(this.x);
        o.append(", policy=");
        o.append(this.y);
        o.append(", billing=");
        o.append(this.z);
        o.append(", isDefault=");
        o.append(this.A);
        o.append(", fallback=");
        return com.github.rudroid.m0.m(o, this.B, ", preview=", this.C, ")");
    }

    @Override // xn.b1
    public final boolean y() {
        return this.C;
    }

    @Override // xn.b1
    public final m z() {
        return this.x;
    }
}
