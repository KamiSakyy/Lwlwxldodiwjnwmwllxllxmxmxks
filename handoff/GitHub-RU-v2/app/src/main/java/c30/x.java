package c30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xShadow {
    public String a;
    public o50.a b;

    public Object x(String str, o50.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xShadow)) {
            return false;
        }
        xShadow xVar = (xShadow) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextFieldFileLine(__typename=" + this.a + ", fileLineFragment=" + this.b + ")";
    }
}
