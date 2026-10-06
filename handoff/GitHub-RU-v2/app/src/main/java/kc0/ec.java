package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ec {
    public final String a;
    public final String b;
    public final ri0.b c;

    public ec(String str, String str2, ri0.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        return k71.k.b(this.a, ecVar.a) && k71.k.b(this.b, ecVar.b) && k71.k.b(this.c, ecVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(__typename=", this.a, ", id=", this.b, ", autoMergeRequestFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
