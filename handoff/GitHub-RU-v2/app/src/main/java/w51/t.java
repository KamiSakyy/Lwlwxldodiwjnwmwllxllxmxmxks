package w51;

import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tShadow {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public String a;
    public String b;
    public String c;

    public Object t(String str, String str2) {
        String substring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (substring == null || !d.matcher(substring).matches()) {
            throw new IllegalArgumentException(f1.e.z("Invalid topic name: ", substring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.a = substring;
        this.b = str;
        this.c = f1.e.h(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tShadow)) {
            return false;
        }
        tShadow tVar = (tShadow) obj;
        return this.a.equals(tVar.a) && this.b.equals(tVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
    public Object d(Object p1) { return null; }
    public Object g(Object p1, Object p2) { return null; }
    public Object i(Object p1, Object p2) { return null; }
    public Object k(Object p1, Object p2) { return null; }
    public Object g(Object p1, long p2) { return null; }
    public Object i(Object p1, long p2) { return null; }
    public Object k(Object p1, int p2) { return null; }
}
