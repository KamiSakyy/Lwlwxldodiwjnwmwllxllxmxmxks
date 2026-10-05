package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sf {
    public final String a;
    public final String b;
    public final w80.h c;

    public sf(String str, String str2, w80.h hVar) {
        this.a = str;
        this.b = str2;
        this.c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf)) {
            return false;
        }
        sf sfVar = (sf) obj;
        return k71.k.b(this.a, sfVar.a) && k71.k.b(this.b, sfVar.b) && k71.k.b(this.c, sfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", issueTemplateFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
