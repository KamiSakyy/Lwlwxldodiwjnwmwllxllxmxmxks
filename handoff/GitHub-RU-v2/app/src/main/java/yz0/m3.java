package yz0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m3 {
    public String a;
    public ArrayList b;
    public x01.i c;

    public m3(String str, ArrayList arrayList, x01.i iVar) {
        this.a = str;
        this.b = arrayList;
        this.c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        return k71.k.b(this.a, m3Var.a) && this.b.equals(m3Var.b) && this.c.equals(m3Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + no.a.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder p = com.github.rudroid.m0.p("PullRequestSearchResultPaged(repoName=", this.a, ", pullRequests=", this.b, ", page=");
        p.append(this.c);
        p.append(")");
        return p.toString();
    }
}
