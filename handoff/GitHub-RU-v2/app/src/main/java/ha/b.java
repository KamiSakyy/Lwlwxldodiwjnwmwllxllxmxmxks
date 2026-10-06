package ha;

import a0.s0;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f25575b;

    /* renamed from: a, reason: collision with root package name */
    public String f25576a;

    static {
        k.f(Pattern.compile("ApolloCacheReference\\{(.*)\\}"), "compile(...)");
        f25575b = new b("QUERY_ROOT");
    }

    public b(String str) {
        k.g(str, "key");
        this.f25576a = str;
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return k.b(this.f25576a, bVar != null ? bVar.f25576a : null);
    }

    public final int hashCode() {
        return this.f25576a.hashCode();
    }

    public final String toString() {
        return s0.m(new StringBuilder("CacheKey("), this.f25576a, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(String str, List list) {
        this(r2);
        k.g(str, "typename");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        String sb3 = sb2.toString();
        k.f(sb3, "toString(...)");
    }
}
