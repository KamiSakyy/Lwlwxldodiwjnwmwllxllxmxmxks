package yz0;

import com.github.service.models.response.fileschanged.CommentLevelType;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g4 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final CommentLevelType g;

    public g4(boolean z, String str, String str2, String str3, boolean z2, boolean z3, CommentLevelType commentLevelType) {
        k71.k.g(commentLevelType, "commentLevelType");
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z2;
        this.f = z3;
        this.g = commentLevelType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return this.a == g4Var.a && k71.k.b(this.b, g4Var.b) && k71.k.b(this.c, g4Var.c) && k71.k.b(this.d, g4Var.d) && this.e == g4Var.e && this.f == g4Var.f && this.g == g4Var.g;
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31);
        String str = this.d;
        return this.g.hashCode() + x.i.e(x.i.e((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder t = com.github.rudroid.copilot.h1.t("ReviewThread(isResolved=", ", path=", this.b, ", id=", this.a);
        f1.e.x(t, this.c, ", positionId=", this.d, ", viewerCanResolve=");
        com.github.rudroid.m0.A(t, this.e, ", viewerCanUnResolve=", this.f, ", commentLevelType=");
        t.append(this.g);
        t.append(")");
        return t.toString();
    }
}
