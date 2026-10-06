package fd;

import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public List f24398a;

    /* renamed from: b, reason: collision with root package name */
    public String f24399b;

    public b(List list, String str) {
        k.g(list, "suggestions");
        k.g(str, "query");
        this.f24398a = list;
        this.f24399b = str;
    }

    public static b a(String str, List list) {
        k.g(list, "suggestions");
        k.g(str, "query");
        return new b(list, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.f24398a, bVar.f24398a) && k.b(this.f24399b, bVar.f24399b);
    }

    public final int hashCode() {
        return this.f24399b.hashCode() + (this.f24398a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoCompleteUiState(suggestions=" + this.f24398a + ", query=" + this.f24399b + ")";
    }
}
