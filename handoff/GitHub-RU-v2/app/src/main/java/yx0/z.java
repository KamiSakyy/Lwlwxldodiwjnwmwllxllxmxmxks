package yx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z {
    public String a;
    public w b;

    public z(String str, w wVar) {
        this.a = str;
        this.b = wVar;
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
        return "OnProjectV2View(id=" + this.a + ", groups=" + this.b + ")";
    }
}
