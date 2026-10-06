package cq0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public String a;
    public o b;

    public g(String str, o oVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o oVar = this.b;
        return hashCode + (oVar == null ? 0 : oVar.hashCode());
    }

    public final String toString() {
        return "FileType1(__typename=" + this.a + ", onImageFileType=" + this.b + ")";
    }
}
