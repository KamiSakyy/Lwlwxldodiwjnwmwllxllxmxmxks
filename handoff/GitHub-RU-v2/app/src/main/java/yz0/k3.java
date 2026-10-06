package yz0;

import com.github.service.models.response.fileschanged.CommentLevelType;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k3 {
    public final String a;
    public final CommentLevelType b;
    public final String c;
    public final y2 d;
    public final String e;
    public final String f;
    public final boolean g;
    public final ArrayList h;
    public final ArrayList i;
    public final boolean j;
    public final boolean k;

    public k3(String str, CommentLevelType commentLevelType, String str2, y2 y2Var, String str3, String str4, boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2, boolean z3) {
        k71.k.g(commentLevelType, "commentType");
        this.a = str;
        this.b = commentLevelType;
        this.c = str2;
        this.d = y2Var;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = arrayList;
        this.i = arrayList2;
        this.j = z2;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return this.a.equals(k3Var.a) && this.b == k3Var.b && this.c.equals(k3Var.c) && k71.k.b(this.d, k3Var.d) && this.e.equals(k3Var.e) && this.f.equals(k3Var.f) && this.g == k3Var.g && this.h.equals(k3Var.h) && this.i.equals(k3Var.i) && this.j == k3Var.j && this.k == k3Var.k;
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
        y2 y2Var = this.d;
        return Boolean.hashCode(this.k) + x.i.e(no.a.b(this.i, no.a.b(this.h, x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((i + (y2Var == null ? 0 : y2Var.hashCode())) * 31, this.e, 31), this.f, 31), 31, this.g), 31), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread(path=");
        sb.append(this.a);
        sb.append(", commentType=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", multiLineCommentFields=");
        sb.append(this.d);
        sb.append(", pullRequestId=");
        f1.e.x(sb, this.e, ", headRefOid=", this.f, ", isResolved=");
        sb.append(this.g);
        sb.append(", diffLines=");
        sb.append(this.h);
        sb.append(", comments=");
        sb.append(this.i);
        sb.append(", isAReply=");
        sb.append(this.j);
        sb.append(", viewerCanReply=");
        return jo.f4.s(sb, this.k, ")");
    }
}
