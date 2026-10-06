package com.github.rudroid.settings.copilot.paywall.ui;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 {
    public h0 a;
    public h0 b;
    public boolean c;
    public int d;
    public Integer e;
    public l f;

    public i0(h0 h0Var, h0 h0Var2, int i, Integer num, l lVar, int i2) {
        boolean z = (i2 & 4) == 0;
        num = (i2 & 16) != 0 ? null : num;
        lVar = (i2 & 32) != 0 ? null : lVar;
        this.a = h0Var;
        this.b = h0Var2;
        this.c = z;
        this.d = i;
        this.e = num;
        this.f = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.a == i0Var.a && this.b == i0Var.b && this.c == i0Var.c && this.d == i0Var.d && k71.k.b(this.e, i0Var.e) && k71.k.b(this.f, i0Var.f);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.d, x.i.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
        Integer num = this.e;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        l lVar = this.f;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CopilotLicenseFeature(includedInCurrentLicense=");
        sb.append(this.a);
        sb.append(", includedInLicenseToBuy=");
        sb.append(this.b);
        sb.append(", isPreview=");
        com.github.rudroid.m0.y(sb, this.c, ", feature=", this.d, ", description=");
        sb.append(this.e);
        sb.append(", externalLink=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
    public Object ordinal() { return null; }
}
