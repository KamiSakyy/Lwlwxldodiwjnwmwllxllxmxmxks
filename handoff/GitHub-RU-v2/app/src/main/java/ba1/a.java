package ba1;

import java.io.IOException;
import java.util.Locale;
import org.jsoup.SerializationException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a {
    public static final String[] c = {"input", "keygen", "object", "select", "textarea"};
    public final /* synthetic */ int a;
    public final Appendable b;

    public /* synthetic */ a(Appendable appendable, int i) {
        this.a = i;
        this.b = appendable;
    }

    public static String c(String str) {
        return str != null ? str.toLowerCase(Locale.ROOT) : "";
    }

    public static String d(String str) {
        return c(str).trim();
    }

    public static a e(StringBuilder sb) {
        return sb != null ? new a(sb, 1) : new a(sb, 0);
    }

    public final a a(char c2) {
        switch (this.a) {
            case 0:
                try {
                    this.b.append(c2);
                    return this;
                } catch (IOException e) {
                    throw new SerializationException(e);
                }
            default:
                ((StringBuilder) this.b).append(c2);
                return this;
        }
    }

    public final a b(String str) {
        switch (this.a) {
            case 0:
                try {
                    this.b.append(str);
                    return this;
                } catch (IOException e) {
                    throw new SerializationException(e);
                }
            default:
                ((StringBuilder) this.b).append((CharSequence) str);
                return this;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((StringBuilder) this.b).toString();
            default:
                return super.toString();
        }
    }
}
