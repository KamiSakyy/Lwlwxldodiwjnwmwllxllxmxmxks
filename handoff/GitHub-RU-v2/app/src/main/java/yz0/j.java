package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public j(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b) && k71.k.b(this.c, jVar.c) && k71.k.b(this.d, jVar.d) && this.e == jVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        String a = qb.a.a(this.c);
        StringBuilder o = a0.s0.o("Branch(repositoryId=", this.a, ", id=", this.b, ", oid=");
        f1.e.x(o, a, ", name=", this.d, ", isDefault=");
        return jo.f4.s(o, this.e, ")");
    }
}
