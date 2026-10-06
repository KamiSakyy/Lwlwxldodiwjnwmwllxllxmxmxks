package yz0;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o6 extends s7 {
    public s a;
    public List b;
    public boolean c;
    public x2 d;
    public ZonedDateTime e;
    public boolean f;
    public boolean g;

    public o6(s sVar, List list, boolean z, x2 x2Var, ZonedDateTime zonedDateTime, boolean z2, boolean z3) {
        k71.k.g(sVar, "comment");
        this.a = sVar;
        this.b = list;
        this.c = z;
        this.d = x2Var;
        this.e = zonedDateTime;
        this.f = z2;
        this.g = z3;
    }

    public static o6 a(o6 o6Var, s sVar, List list, boolean z, x2 x2Var, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            sVar = o6Var.a;
        }
        s sVar2 = sVar;
        if ((i & 2) != 0) {
            list = o6Var.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            z = o6Var.c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            x2Var = o6Var.d;
        }
        x2 x2Var2 = x2Var;
        ZonedDateTime zonedDateTime = o6Var.e;
        if ((i & 32) != 0) {
            z2 = o6Var.f;
        }
        boolean z5 = z2;
        if ((i & 64) != 0) {
            z3 = o6Var.g;
        }
        o6Var.getClass();
        k71.k.g(sVar2, "comment");
        k71.k.g(list2, "reactions");
        k71.k.g(x2Var2, "minimizedState");
        return new o6(sVar2, list2, z4, x2Var2, zonedDateTime, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        return k71.k.b(this.a, o6Var.a) && k71.k.b(this.b, o6Var.b) && this.c == o6Var.c && k71.k.b(this.d, o6Var.d) && k71.k.b(this.e, o6Var.e) && this.f == o6Var.f && this.g == o6Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + x.i.e(f1.e.c(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31;
        ZonedDateTime zonedDateTime = this.e;
        return Boolean.hashCode(this.g) + x.i.e((hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineIssueComment(comment=");
        sb.append(this.a);
        sb.append(", reactions=");
        sb.append(this.b);
        sb.append(", viewerCanReact=");
        sb.append(this.c);
        sb.append(", minimizedState=");
        sb.append(this.d);
        sb.append(", createdAt=");
        com.github.rudroid.m0.v(", viewerCanBlockFromOrg=", ", viewerCanUnblockFromOrg=", sb, this.e, this.f);
        return jo.f4Shadow.s(sb, this.g, ")");
    }

    public /* synthetic */ o6(s sVar) {
        this(sVar, x61.rShadow.r, true, x2.e, null, false, false);
    }
}
