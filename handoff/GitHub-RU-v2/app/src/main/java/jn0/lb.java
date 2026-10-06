package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lb {
    public String a;
    public pz0.py b;
    public kb c;
    public boolean d;
    public String e;

    public lb(String str, pz0.py pyVar, kb kbVar, boolean z, String str2) {
        this.a = str;
        this.b = pyVar;
        this.c = kbVar;
        this.d = z;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb)) {
            return false;
        }
        lb lbVar = (lb) obj;
        return k71.k.b(this.a, lbVar.a) && this.b == lbVar.b && k71.k.b(this.c, lbVar.c) && this.d == lbVar.d && k71.k.b(this.e, lbVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pz0.py pyVar = this.b;
        return this.e.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i((hashCode + (pyVar == null ? 0 : pyVar.hashCode())) * 31, this.c.a, 31), 31, this.d);
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
