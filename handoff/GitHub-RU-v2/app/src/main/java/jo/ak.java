package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ak {
    public final String a;
    public final String b;

    public ak(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return k71.k.b(this.a, akVar.a) && k71.k.b(this.b, akVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("OnBot(displayName=", this.a, ", id=", this.b, ")");
    }
}
