package yz0;

import com.github.service.models.response.type.DiffLineType;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b1 {
    public final String a;
    public final int b;
    public final DiffLineType c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final List h;
    public final String i;
    public final boolean j;

    public b1(String str, int i, DiffLineType diffLineType, String str2, int i2, int i3, String str3, List list, String str4, boolean z) {
        k71.k.g(str, "html");
        k71.k.g(diffLineType, "type");
        k71.k.g(str2, "positionId");
        k71.k.g(str4, "raw");
        this.a = str;
        this.b = i;
        this.c = diffLineType;
        this.d = str2;
        this.e = i2;
        this.f = i3;
        this.g = str3;
        this.h = list;
        this.i = str4;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return k71.k.b(this.a, b1Var.a) && this.b == b1Var.b && this.c == b1Var.c && k71.k.b(this.d, b1Var.d) && this.e == b1Var.e && this.f == b1Var.f && k71.k.b(this.g, b1Var.g) && k71.k.b(this.h, b1Var.h) && k71.k.b(this.i, b1Var.i) && this.j == b1Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + com.github.rudroid.copilot.h1.i(f1.e.c(this.h, com.github.rudroid.copilot.h1.i(a0.s0.b(this.f, a0.s0.b(this.e, com.github.rudroid.copilot.h1.i((this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31)) * 31, this.d, 31), 31), 31), this.g, 31), 31), this.i, 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "DiffLine(html=", this.a, ", lineLength=", ", type=");
        n.append(this.c);
        n.append(", positionId=");
        n.append(this.d);
        n.append(", leftNum=");
        a0.s0.z(n, this.e, ", rightNum=", this.f, ", threadId=");
        n.append(this.g);
        n.append(", reviewComments=");
        n.append(this.h);
        n.append(", raw=");
        return com.github.rudroid.m0.k(n, this.i, ", isMissingNewlineAtEnd=", this.j, ")");
    }







}
