package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xk {
    public String a;
    public vk b;
    public String c;

    public xk(String str, vk vkVar, String str2) {
        this.a = str;
        this.b = vkVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk)) {
            return false;
        }
        xk xkVar = (xk) obj;
        return k71.k.b(this.a, xkVar.a) && k71.k.b(this.b, xkVar.b) && k71.k.b(this.c, xkVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vk vkVar = this.b;
        return this.c.hashCode() + ((hashCode + (vkVar == null ? 0 : vkVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationDiscussionsRepository(id=");
        sb.append(this.a);
        sb.append(", discussion=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
