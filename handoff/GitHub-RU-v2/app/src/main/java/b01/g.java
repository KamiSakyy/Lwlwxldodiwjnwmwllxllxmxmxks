package b01;

import com.github.rudroid.m0;
import java.util.ArrayList;
import java.util.List;
import jo.f4;
import yz0.b8;
import yz0.s;
import yz0.x2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public s a;
    public ArrayList b;
    public boolean c;
    public Integer d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public String i;
    public boolean j;
    public x2 k;
    public List l;
    public b8 m;
    public boolean n;
    public boolean o;

    public g(s sVar, ArrayList arrayList, boolean z, Integer num, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6, x2 x2Var, List list, b8 b8Var, boolean z7, boolean z8) {
        this.a = sVar;
        this.b = arrayList;
        this.c = z;
        this.d = num;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = str;
        this.j = z6;
        this.k = x2Var;
        this.l = list;
        this.m = b8Var;
        this.n = z7;
        this.o = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a) && this.b.equals(gVar.b) && this.c == gVar.c && k71.k.b(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f && this.g == gVar.g && this.h == gVar.h && k71.k.b(this.i, gVar.i) && this.j == gVar.j && this.k.equals(gVar.k) && k71.k.b(this.l, gVar.l) && k71.k.b(this.m, gVar.m) && this.n == gVar.n && this.o == gVar.o;
    }

    public final int hashCode() {
        int e = x.i.e(no.a.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        Integer num = this.d;
        int e2 = x.i.e(x.i.e(x.i.e(x.i.e((e + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        int hashCode = (this.k.hashCode() + x.i.e((e2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.j)) * 31;
        List list = this.l;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        b8 b8Var = this.m;
        return Boolean.hashCode(this.o) + x.i.e((hashCode2 + (b8Var != null ? b8Var.hashCode() : 0)) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscussionComment(comment=");
        sb.append(this.a);
        sb.append(", reactions=");
        sb.append(this.b);
        sb.append(", viewerCanReact=");
        sb.append(this.c);
        sb.append(", numberOfReplies=");
        sb.append(this.d);
        sb.append(", canUpdate=");
        m0.A(sb, this.e, ", canMarkAsAnswer=", this.f, ", canUnmarkAsAnswer=");
        m0.A(sb, this.g, ", isAnswer=", this.h, ", answerChosenBy=");
        m0.x(sb, this.i, ", isDeleted=", this.j, ", minimizedState=");
        sb.append(this.k);
        sb.append(", replyPreviews=");
        sb.append(this.l);
        sb.append(", upvote=");
        sb.append(this.m);
        sb.append(", viewerCanBlockFromOrg=");
        sb.append(this.n);
        sb.append(", viewerCanUnblockFromOrg=");
        return f4.s(sb, this.o, ")");
    }
}
