package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z {
    public String a;
    public String b;

    public z(String str, String str2) {
        k71.k.g(str, "viewId");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return k71.k.b(this.a, zVar.a) && k71.k.b(this.b, zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ProjectBoardParameters(viewId=", this.a, ", query=", this.b, ")");
    }
}
