package jk;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.util.ArrayList;
import java.util.List;
import jo.f4Shadow;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public d a;
    public List b;
    public x01.i c;
    public int d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public com.github.service.models.response.a j;
    public boolean k;

    public a(d dVar, List list, x01.i iVar, int i, String str, String str2, String str3, boolean z, boolean z2, com.github.service.models.response.a aVar, boolean z3) {
        k.g(str2, "repositoryOwnerId");
        this.a = dVar;
        this.b = list;
        this.c = iVar;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z;
        this.i = z2;
        this.j = aVar;
        this.k = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    public static a a(a aVar, d dVar, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            dVar = aVar.a;
        }
        d dVar2 = dVar;
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = aVar.b;
        }
        x01.i iVar = aVar.c;
        int i2 = aVar.d;
        String str = aVar.e;
        String str2 = aVar.f;
        String str3 = aVar.g;
        boolean z = aVar.h;
        boolean z2 = aVar.i;
        com.github.service.models.response.a aVar2 = aVar.j;
        boolean z3 = aVar.k;
        aVar.getClass();
        k.g(dVar2, "comment");
        k.g(str2, "repositoryOwnerId");
        return new a(dVar2, arrayList2, iVar, i2, str, str2, str3, z, z2, aVar2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && this.d == aVar.d && k.b(this.e, aVar.e) && k.b(this.f, aVar.f) && k.b(this.g, aVar.g) && this.h == aVar.h && this.i == aVar.i && k.b(this.j, aVar.j) && this.k == aVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + f4Shadow.b(this.j, x.i.e(x.i.e(h1.i(h1.i(h1.i(s0.b(this.d, (this.c.hashCode() + f1.e.c(this.b, this.a.hashCode() * 31, 31)) * 31, 31), this.e, 31), this.f, 31), this.g, 31), 31, this.h), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentReplyThreadDataPage(comment=");
        sb.append(this.a);
        sb.append(", replies=");
        sb.append(this.b);
        sb.append(", page=");
        sb.append(this.c);
        sb.append(", totalReplies=");
        sb.append(this.d);
        sb.append(", repositoryId=");
        f1.e.x(sb, this.e, ", repositoryOwnerId=", this.f, ", discussionId=");
        m0.x(sb, this.g, ", isLocked=", this.h, ", viewerCanCommentIfLocked=");
        sb.append(this.i);
        sb.append(", discussionAuthor=");
        sb.append(this.j);
        sb.append(", hasNestedDiscussionAnswersEnabled=");
        return f4Shadow.s(sb, this.k, ")");
    }
}
