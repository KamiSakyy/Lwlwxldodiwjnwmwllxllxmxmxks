package oj0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements aa.h0 {
    public final List a;
    public final List b;
    public final List c;
    public final boolean d;
    public final Boolean e;
    public final String f;
    public final String g;
    public final String h;

    public h(List list, List list2, List list3, boolean z, Boolean bool, String str, String str2, String str3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = z;
        this.e = bool;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c) && this.d == hVar.d && k71.k.b(this.e, hVar.e) && k71.k.b(this.f, hVar.f) && k71.k.b(this.g, hVar.g) && k71.k.b(this.h, hVar.h);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        int e = x.i.e((hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.d);
        Boolean bool = this.e;
        int hashCode3 = (e + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f;
        return this.h.hashCode() + com.github.rudroid.copilot.h1.i((hashCode3 + (str != null ? str.hashCode() : 0)) * 31, this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IssueTemplateFragment(issueTemplates=");
        sb.append(this.a);
        sb.append(", contactLinks=");
        sb.append(this.b);
        sb.append(", issueFormLinks=");
        com.github.rudroid.copilot.h1.C(sb, this.c, ", isBlankIssuesEnabled=", this.d, ", isSecurityPolicyEnabled=");
        sb.append(this.e);
        sb.append(", securityPolicyUrl=");
        sb.append(this.f);
        sb.append(", id=");
        return x.i.k(sb, this.g, ", __typename=", this.h, ")");
    }
}
