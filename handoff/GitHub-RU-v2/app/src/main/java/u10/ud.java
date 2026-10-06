package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ud {
    public final String a;
    public final vd b;
    public final wd c;

    public ud(String str, vd vdVar, wd wdVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = vdVar;
        this.c = wdVar;
    }

    public static ud a(ud udVar, wd wdVar) {
        String str = udVar.a;
        vd vdVar = udVar.b;
        udVar.getClass();
        k71.k.g(str, "__typename");
        return new ud(str, vdVar, wdVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud)) {
            return false;
        }
        ud udVar = (ud) obj;
        return k71.k.b(this.a, udVar.a) && k71.k.b(this.b, udVar.b) && k71.k.b(this.c, udVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vd vdVar = this.b;
        int hashCode2 = (hashCode + (vdVar == null ? 0 : vdVar.a.hashCode())) * 31;
        wd wdVar = this.c;
        return hashCode2 + (wdVar != null ? wdVar.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onNode=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
