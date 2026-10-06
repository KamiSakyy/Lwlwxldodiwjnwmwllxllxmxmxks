package yz0;

import com.github.service.models.response.type.DiffLineType;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u7 {
    public String a;
    public int b;
    public DiffLineType c;
    public int d;
    public int e;
    public String f;
    public boolean g;

    public u7(String str, int i, DiffLineType diffLineType, int i2, int i3, String str2, boolean z) {
        k71.k.g(diffLineType, "type");
        this.a = str;
        this.b = i;
        this.c = diffLineType;
        this.d = i2;
        this.e = i3;
        this.f = str2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7)) {
            return false;
        }
        u7 u7Var = (u7) obj;
        return k71.k.b(this.a, u7Var.a) && this.b == u7Var.b && this.c == u7Var.c && this.d == u7Var.d && this.e == u7Var.e && k71.k.b(this.f, u7Var.f) && this.g == u7Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + com.github.rudroid.copilot.h1.i(a0.s0.b(this.e, a0.s0.b(this.d, (this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "UnReviewableDiffLine(html=", this.a, ", lineLength=", ", type=");
        n.append(this.c);
        n.append(", leftNum=");
        n.append(this.d);
        n.append(", rightNum=");
        x.i.r(this.e, ", raw=", this.f, ", isMissingNewlineAtEnd=", n);
        return jo.f4.s(n, this.g, ")");
    }
}
