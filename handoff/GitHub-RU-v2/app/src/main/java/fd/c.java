package fd;

import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f24400a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24401b;

    public c(String str, String str2) {
        k.g(str, "shortcode");
        k.g(str2, "unicode");
        this.f24400a = str;
        this.f24401b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.f24400a, cVar.f24400a) && k.b(this.f24401b, cVar.f24401b);
    }

    public final int hashCode() {
        return this.f24401b.hashCode() + (this.f24400a.hashCode() * 31);
    }

    public final String toString() {
        return i.g("Emoji(shortcode=", this.f24400a, ", unicode=", this.f24401b, ")");
    }
}
