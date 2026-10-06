package yz0;

import com.github.service.models.response.Language;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t1 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Language f;
    public int g;
    public int h;
    public List i;
    public ArrayList j;

    public t1(String str, String str2, String str3, String str4, String str5, Language language, int i, int i2, List list, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = language;
        this.g = i;
        this.h = i2;
        this.i = list;
        this.j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.a.equals(t1Var.a) && this.b.equals(t1Var.b) && this.c.equals(t1Var.c) && this.d.equals(t1Var.d) && this.e.equals(t1Var.e) && this.f.equals(t1Var.f) && this.g == t1Var.g && this.h == t1Var.h && this.i.equals(t1Var.i) && this.j.equals(t1Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + f1.e.c(this.i, a0.s0.b(this.h, a0.s0.b(this.g, (this.f.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("GlobalCodeSearchResult(repoName=", this.a, ", repoOwner=", this.b, ", avatarUrl=");
        f1.e.x(o, this.c, ", branchName=", this.d, ", pathWithName=");
        o.append(this.e);
        o.append(", language=");
        o.append(this.f);
        o.append(", maxLineNumber=");
        a0.s0.z(o, this.g, ", matchCount=", this.h, ", prominentSnippets=");
        o.append(this.i);
        o.append(", allSnippets=");
        o.append(this.j);
        o.append(")");
        return o.toString();
    }
}
