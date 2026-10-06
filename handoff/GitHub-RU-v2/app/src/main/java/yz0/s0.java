package yz0;

import com.github.service.models.response.type.PatchStatus;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s0 {
    public String a;
    public String b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public String h;
    public PatchStatus i;
    public ArrayList j;
    public String k;

    public s0(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str3, PatchStatus patchStatus, ArrayList arrayList, String str4) {
        k71.k.g(patchStatus, "status");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = str3;
        this.i = patchStatus;
        this.j = arrayList;
        this.k = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.a.equals(s0Var.a) && this.b.equals(s0Var.b) && this.c == s0Var.c && this.d == s0Var.d && this.e == s0Var.e && this.f == s0Var.f && this.g == s0Var.g && this.h.equals(s0Var.h) && this.i == s0Var.i && this.j.equals(s0Var.j) && k71.k.b(this.k, s0Var.k);
    }

    public final int hashCode() {
        int b = no.a.b(this.j, (this.i.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, true), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), this.h, 31)) * 31, 31);
        String str = this.k;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        boolean z = this.c;
        StringBuilder o = a0.s0.o("File(path=", this.a, ", oldPath=", this.b, ", isVisible=true, isCollapsed=");
        com.github.rudroid.m0.A(o, z, ", isBinary=", this.d, ", isLarge=");
        com.github.rudroid.m0.A(o, this.e, ", isSubmodule=", this.f, ", isGenerated=");
        com.github.rudroid.m0.z(o, this.g, ", submodulePath=", this.h, ", status=");
        o.append(this.i);
        o.append(", diffLines=");
        o.append(this.j);
        o.append(", imageURL=");
        return com.github.rudroid.copilot.h1.p(o, this.k, ")");
    }
}
