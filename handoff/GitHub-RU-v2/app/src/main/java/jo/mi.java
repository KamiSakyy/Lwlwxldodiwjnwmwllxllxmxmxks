package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mi {
    public String a;
    public ui b;
    public vx.a c;

    public mi(String str, ui uiVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = uiVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi)) {
            return false;
        }
        mi miVar = (mi) obj;
        return k71.k.b(this.a, miVar.a) && k71.k.b(this.b, miVar.b) && k71.k.b(this.c, miVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ui uiVar = this.b;
        int hashCode2 = (hashCode + (uiVar == null ? 0 : uiVar.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node2(__typename=");
        sb.append(this.a);
        sb.append(", onRepository=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
