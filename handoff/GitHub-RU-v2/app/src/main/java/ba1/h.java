package ba1;

import b1.m;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class h {
    public static final String[] a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    public static final Pattern b = Pattern.compile("^/(?>(?>\\.\\.?/)+)");
    public static final Pattern c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
    public static final Pattern d = Pattern.compile("[\\x00-\\x1f]*");
    public static final m e = new m(new b(1));

    public static StringBuilder a() {
        return (StringBuilder) e.h();
    }

    public static boolean b(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean d(char c2) {
        if (c2 < 'a' || c2 > 'z') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    public static boolean e(String str) {
        if (str != null && !str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!h(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean f(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static boolean g(char c2) {
        if (f(c2)) {
            return true;
        }
        if (c2 < 'a' || c2 > 'f') {
            return c2 >= 'A' && c2 <= 'F';
        }
        return true;
    }

    public static boolean h(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    public static String i(String str, List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringBuilder a2 = a();
        aa1.b.K(a2);
        a2.append((Object) obj);
        while (it.hasNext()) {
            Object next = it.next();
            a2.append(str);
            a2.append(next);
        }
        return k(a2);
    }

    public static String j(String str) {
        StringBuilder a2 = a();
        int length = str.length();
        int i = 0;
        boolean z = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 32 || codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13 || codePointAt == 160) {
                if (!z) {
                    a2.append(' ');
                    z = true;
                }
            } else if (codePointAt != 8203 && codePointAt != 173) {
                a2.appendCodePoint(codePointAt);
                z = false;
            }
            i += Character.charCount(codePointAt);
        }
        return k(a2);
    }

    public static String k(StringBuilder sb) {
        aa1.b.K(sb);
        String sb2 = sb.toString();
        if (sb.length() <= 8192) {
            sb.delete(0, sb.length());
            e.C(sb);
        }
        return sb2;
    }

    public static URL l(URL url, String str) {
        String replaceAll = d.matcher(str).replaceAll("");
        if (replaceAll.startsWith("?")) {
            replaceAll = url.getPath() + replaceAll;
        }
        URL url2 = new URL(url, replaceAll);
        String replaceFirst = b.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            replaceFirst = replaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }
}
