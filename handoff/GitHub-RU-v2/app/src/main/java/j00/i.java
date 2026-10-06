package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public h a;
    public String b;
    public String c;

    public i(h hVar, String str, String str2) {
        this.a = hVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && k71.k.b(this.c, iVar.c);
    }

    public final int hashCode() {
        h hVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((hVar == null ? 0 : hVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(mobilePushNotificationSettings=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
