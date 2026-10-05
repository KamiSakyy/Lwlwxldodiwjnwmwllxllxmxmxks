package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fl {
    public final cl a;
    public final String b;
    public final String c;

    public fl(cl clVar, String str, String str2) {
        this.a = clVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl)) {
            return false;
        }
        fl flVar = (fl) obj;
        return k71.k.b(this.a, flVar.a) && k71.k.b(this.b, flVar.b) && k71.k.b(this.c, flVar.c);
    }

    public final int hashCode() {
        cl clVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((clVar == null ? 0 : clVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationDiscussionsRepository(discussion=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }















    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class b<T1,T2,T3,T4> {
        public b() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c<T1,T2,T3,T4> {
        public c() {
        }
    }
}
