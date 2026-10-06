package h01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q {
    public String a;
    public int b;
    public List c;
    public boolean d;
    public String e;
    public boolean f;
    public String g;

    public q(String str, int i, List list, boolean z, String str2, boolean z2, String str3) {
        k71.k.g(str, "issueOrPullId");
        this.a = str;
        this.b = i;
        this.c = list;
        this.d = z;
        this.e = str2;
        this.f = z2;
        this.g = str3;
    }

    public static q a(q qVar, ArrayList arrayList) {
        String str = qVar.a;
        int i = qVar.b;
        boolean z = qVar.d;
        String str2 = qVar.e;
        boolean z2 = qVar.f;
        String str3 = qVar.g;
        qVar.getClass();
        k71.k.g(str, "issueOrPullId");
        return new q(str, i, arrayList, z, str2, z2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && this.b == qVar.b && k71.k.b(this.c, qVar.c) && this.d == qVar.d && k71.k.b(this.e, qVar.e) && this.f == qVar.f && k71.k.b(this.g, qVar.g);
    }

    public final int hashCode() {
        int e = x.i.e(f1.e.c(this.c, s0.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        int e2 = x.i.e((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        return e2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "Timeline(issueOrPullId=", this.a, ", beforeFocusCount=", ", timelineItems=");
        h1.C(n, this.c, ", hasPreviousPage=", this.d, ", startCursor=");
        m0.x(n, this.e, ", hasNextPage=", this.f, ", endCursor=");
        return h1.p(n, this.g, ")");
    }
}
