package lj;

import com.github.service.models.response.Avatar;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final String a;
    public final Avatar b;

    public a(Avatar avatar, String str) {
        k.g(str, "login");
        k.g(avatar, "avatar");
        this.a = str;
        this.b = avatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthorData(login=" + this.a + ", avatar=" + this.b + ")";
    }
}
