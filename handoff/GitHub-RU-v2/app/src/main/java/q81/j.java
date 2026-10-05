package q81;

import com.github.rudroid.copilot.h1;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes5.dex */
public final class j {
    public static final Pattern k = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern m = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public j(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(jVar.a, this.a) && k71.k.b(jVar.b, this.b) && jVar.c == this.c && k71.k.b(jVar.d, this.d) && k71.k.b(jVar.e, this.e) && jVar.f == this.f && jVar.g == this.g && jVar.h == this.h && jVar.i == this.i && k71.k.b(jVar.j, this.j);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e(x.i.e(h1.i(h1.i(x.i.c(h1.i(h1.i(527, this.a, 31), this.b, 31), 31, this.c), this.d, 31), this.e, 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j = this.c;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) v81.c.a.get()).format(new Date(j));
                k71.k.f(format, "format(...)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String str = this.j;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        k71.k.f(sb2, "toString(...)");
        return sb2;
    }
}
