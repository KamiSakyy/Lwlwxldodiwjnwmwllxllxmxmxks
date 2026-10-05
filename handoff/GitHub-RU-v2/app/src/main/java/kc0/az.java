package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class az {
    public final String a;
    public final String b;
    public final mg0.m c;

    public az(String str, String str2, mg0.m mVar) {
        this.a = str;
        this.b = str2;
        this.c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        return k71.k.b(this.a, azVar.a) && k71.k.b(this.b, azVar.b) && k71.k.b(this.c, azVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnIssue(__typename=", this.a, ", id=", this.b, ", issueListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
