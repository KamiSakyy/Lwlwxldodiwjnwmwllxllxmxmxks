package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ra {
    public String a;
    public gn0.jr b;
    public qa c;
    public boolean d;
    public String e;

    public ra(String str, gn0.jr jrVar, qa qaVar, boolean z, String str2) {
        this.a = str;
        this.b = jrVar;
        this.c = qaVar;
        this.d = z;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return k71.k.b(this.a, raVar.a) && this.b == raVar.b && k71.k.b(this.c, raVar.c) && this.d == raVar.d && k71.k.b(this.e, raVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gn0.jr jrVar = this.b;
        return this.e.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i((hashCode + (jrVar == null ? 0 : jrVar.hashCode())) * 31, this.c.a, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", viewerPermission=");
        sb.append(this.b);
        sb.append(", owner=");
        sb.append(this.c);
        sb.append(", hasNestedDiscussionAnswersEnabled=");
        sb.append(this.d);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
