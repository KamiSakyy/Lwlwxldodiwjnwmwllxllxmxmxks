package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class we {
    public String a;
    public xe b;

    public we(String str, xe xeVar) {
        this.a = str;
        this.b = xeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return k71.k.b(this.a, weVar.a) && k71.k.b(this.b, weVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        xe xeVar = this.b;
        return hashCode + (xeVar != null ? xeVar.hashCode() : 0);
    }

    public final String toString() {
        return "File(extension=" + this.a + ", fileType=" + this.b + ")";
    }
}
