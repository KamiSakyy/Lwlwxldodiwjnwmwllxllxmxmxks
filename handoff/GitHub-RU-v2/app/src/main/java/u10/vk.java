package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vk {
    public final sk a;
    public final String b;
    public final String c;

    public vk(sk skVar, String str, String str2) {
        this.a = skVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk)) {
            return false;
        }
        vk vkVar = (vk) obj;
        return k71.k.b(this.a, vkVar.a) && k71.k.b(this.b, vkVar.b) && k71.k.b(this.c, vkVar.c);
    }

    public final int hashCode() {
        sk skVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((skVar == null ? 0 : skVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Discussion(comment=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
