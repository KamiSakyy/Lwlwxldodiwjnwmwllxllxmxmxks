package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hw {
    public String a;
    public String b;

    public hw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw)) {
            return false;
        }
        hw hwVar = (hw) obj;
        return k71.k.b(this.a, hwVar.a) && k71.k.b(this.b, hwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Ref(__typename=", this.a, ", id=", this.b, ")");
    }
}
