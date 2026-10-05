package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ak {
    public final String a;
    public final String b;
    public final hc0.ff c;

    public ak(String str, String str2, hc0.ff ffVar) {
        this.a = str;
        this.b = str2;
        this.c = ffVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return k71.k.b(this.a, akVar.a) && k71.k.b(this.b, akVar.b) && this.c == akVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(id=", this.a, ", headRefOid=", this.b, ", mergeStateStatus=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
