package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class aw {
    public String a;
    public zv b;
    public yv c;
    public String d;

    public aw(String str, zv zvVar, yv yvVar, String str2) {
        this.a = str;
        this.b = zvVar;
        this.c = yvVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw)) {
            return false;
        }
        aw awVar = (aw) obj;
        return k71.k.b(this.a, awVar.a) && k71.k.b(this.b, awVar.b) && k71.k.b(this.c, awVar.c) && k71.k.b(this.d, awVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zv zvVar = this.b;
        int hashCode2 = (hashCode + (zvVar == null ? 0 : Integer.hashCode(zvVar.a))) * 31;
        yv yvVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (yvVar != null ? yvVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MergeQueue(id=" + this.a + ", entriesCount=" + this.b + ", entries=" + this.c + ", __typename=" + this.d + ")";
    }
}
