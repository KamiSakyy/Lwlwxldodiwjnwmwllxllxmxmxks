package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wb {
    public String a;
    public String b;
    public z70.b c;

    public wb(String str, String str2, z70.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb)) {
            return false;
        }
        wb wbVar = (wb) obj;
        return k71.k.b(this.a, wbVar.a) && k71.k.b(this.b, wbVar.b) && k71.k.b(this.c, wbVar.c);
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
