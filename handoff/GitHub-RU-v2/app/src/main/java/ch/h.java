package ch;

import a0.s0;
import g3.q0;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public q0 a;
    public q0 b;
    public q0 c;
    public q0 d;
    public q0 e;
    public q0 f;
    public q0 g;
    public q0 h;
    public q0 i;
    public q0 j;

    public h(q0 q0Var, q0 q0Var2, q0 q0Var3, q0 q0Var4, q0 q0Var5, q0 q0Var6, q0 q0Var7, q0 q0Var8, q0 q0Var9, q0 q0Var10) {
        this.a = q0Var;
        this.b = q0Var2;
        this.c = q0Var3;
        this.d = q0Var4;
        this.e = q0Var5;
        this.f = q0Var6;
        this.g = q0Var7;
        this.h = q0Var8;
        this.i = q0Var9;
        this.j = q0Var10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.b(this.a, hVar.a) && k.b(this.b, hVar.b) && k.b(this.c, hVar.c) && k.b(this.d, hVar.d) && k.b(this.e, hVar.e) && k.b(this.f, hVar.f) && k.b(this.g, hVar.g) && k.b(this.h, hVar.h) && k.b(this.i, hVar.i) && k.b(this.j, hVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + s0.c(s0.c(s0.c(s0.c(s0.c(s0.c(s0.c(s0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarkdownTypography(text=");
        sb.append(this.a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", header1=");
        s0.A(sb, this.c, ", header2=", this.d, ", header3=");
        s0.A(sb, this.e, ", header4=", this.f, ", header5=");
        s0.A(sb, this.g, ", header6=", this.h, ", listItem=");
        sb.append(this.i);
        sb.append(", code=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

}
