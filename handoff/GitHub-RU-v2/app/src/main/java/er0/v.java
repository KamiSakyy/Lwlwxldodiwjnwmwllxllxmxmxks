package er0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v implements aa.h0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final u f;
    public final String g;
    public final yp0.c h;
    public final gu0.c i;
    public final gt0.a j;
    public final at0.a k;

    public v(String str, String str2, boolean z, boolean z2, boolean z3, u uVar, String str3, yp0.c cVar, gu0.c cVar2, gt0.a aVar, at0.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = uVar;
        this.g = str3;
        this.h = cVar;
        this.i = cVar2;
        this.j = aVar;
        this.k = aVar2;
    }

    public static v a(v vVar, boolean z, boolean z2, boolean z3, gt0.a aVar, at0.a aVar2, int i) {
        String str = vVar.a;
        String str2 = vVar.b;
        if ((i & 4) != 0) {
            z = vVar.c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = vVar.d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = vVar.e;
        }
        boolean z6 = z3;
        u uVar = vVar.f;
        String str3 = vVar.g;
        yp0.c cVar = vVar.h;
        gu0.c cVar2 = vVar.i;
        gt0.a aVar3 = (i & 512) != 0 ? vVar.j : aVar;
        at0.a aVar4 = (i & 1024) != 0 ? vVar.k : aVar2;
        k71.k.g(aVar4, "minimizableCommentFragment");
        return new v(str, str2, z4, z5, z6, uVar, str3, cVar, cVar2, aVar3, aVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b) && this.c == vVar.c && this.d == vVar.d && this.e == vVar.e && k71.k.b(this.f, vVar.f) && k71.k.b(this.g, vVar.g) && k71.k.b(this.h, vVar.h) && k71.k.b(this.i, vVar.i) && k71.k.b(this.j, vVar.j) && k71.k.b(this.k, vVar.k);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31, this.d), 31, this.e);
        u uVar = this.f;
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + h1.i((e + (uVar == null ? 0 : uVar.hashCode())) * 31, this.g, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("DiscussionCommentReplyFragment(__typename=", this.a, ", url=", this.b, ", viewerCanMarkAsAnswer=");
        m0.A(o, this.c, ", viewerCanUnmarkAsAnswer=", this.d, ", isAnswer=");
        o.append(this.e);
        o.append(", discussion=");
        o.append(this.f);
        o.append(", id=");
        o.append(this.g);
        o.append(", commentFragment=");
        o.append(this.h);
        o.append(", reactionFragment=");
        o.append(this.i);
        o.append(", orgBlockableFragment=");
        o.append(this.j);
        o.append(", minimizableCommentFragment=");
        o.append(this.k);
        o.append(")");
        return o.toString();
    }
}
