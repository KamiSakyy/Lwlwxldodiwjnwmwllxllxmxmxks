package jk;

import com.github.rudroid.m0;
import java.util.List;
import k71.k;
import yz0.b8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public final lj.b a;
    public final Integer b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final List i;
    public final b8 j;

    public d(lj.b bVar, Integer num, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, List list, b8 b8Var) {
        this.a = bVar;
        this.b = num;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str;
        this.h = z5;
        this.i = list;
        this.j = b8Var;
    }

    public static d a(d dVar, lj.b bVar) {
        Integer num = dVar.b;
        boolean z = dVar.c;
        boolean z2 = dVar.d;
        boolean z3 = dVar.e;
        boolean z4 = dVar.f;
        String str = dVar.g;
        boolean z5 = dVar.h;
        List list = dVar.i;
        b8 b8Var = dVar.j;
        dVar.getClass();
        return new d(bVar, num, z, z2, z3, z4, str, z5, list, b8Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f && k.b(this.g, dVar.g) && this.h == dVar.h && k.b(this.i, dVar.i) && k.b(this.j, dVar.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int e = x.i.e(x.i.e(x.i.e(x.i.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int e2 = x.i.e((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
        List list = this.i;
        int hashCode2 = (e2 + (list == null ? 0 : list.hashCode())) * 31;
        b8 b8Var = this.j;
        return hashCode2 + (b8Var != null ? b8Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscussionCommentData(comment=");
        sb.append(this.a);
        sb.append(", numberOfReplies=");
        sb.append(this.b);
        sb.append(", canUpdate=");
        m0.A(sb, this.c, ", canMarkAsAnswer=", this.d, ", canUnmarkAsAnswer=");
        m0.A(sb, this.e, ", isAnswer=", this.f, ", answerChosenBy=");
        m0.x(sb, this.g, ", isDeleted=", this.h, ", replyPreviews=");
        sb.append(this.i);
        sb.append(", upvote=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
