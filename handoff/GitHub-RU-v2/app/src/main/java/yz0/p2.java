package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p2 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final com.github.service.models.response.a e;

    public p2(String str, String str2, String str3, int i, com.github.service.models.response.a aVar) {
        k71.k.g(str2, "listName");
        k71.k.g(str3, "listDescription");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return k71.k.b(this.a, p2Var.a) && k71.k.b(this.b, p2Var.b) && k71.k.b(this.c, p2Var.c) && this.d == p2Var.d && k71.k.b(this.e, p2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a0.s0.b(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ListDetailData(listId=", this.a, ", listName=", this.b, ", listDescription=");
        a0.s0.w(this.d, this.c, ", repoCount=", ", author=", o);
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
