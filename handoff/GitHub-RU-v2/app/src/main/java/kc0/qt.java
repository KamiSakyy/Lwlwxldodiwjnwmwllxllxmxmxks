package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qt {
    public final String a;
    public final pt b;
    public final ot c;
    public final String d;

    public qt(String str, pt ptVar, ot otVar, String str2) {
        this.a = str;
        this.b = ptVar;
        this.c = otVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt)) {
            return false;
        }
        qt qtVar = (qt) obj;
        return k71.k.b(this.a, qtVar.a) && k71.k.b(this.b, qtVar.b) && k71.k.b(this.c, qtVar.c) && k71.k.b(this.d, qtVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pt ptVar = this.b;
        int hashCode2 = (hashCode + (ptVar == null ? 0 : Integer.hashCode(ptVar.a))) * 31;
        ot otVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (otVar != null ? otVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MergeQueue(id=" + this.a + ", entriesCount=" + this.b + ", entries=" + this.c + ", __typename=" + this.d + ")";
    }
}
