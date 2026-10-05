package ca1;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a implements Map.Entry, Cloneable {
    public static final String[] u = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    public static final Pattern v = Pattern.compile("[^-a-zA-Z0-9_:.]+");
    public static final Pattern w = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    public String r;
    public String s;
    public b t;

    public static String a(String str, int i) {
        if (i == 2 && !d(str)) {
            String replaceAll = v.matcher(str).replaceAll("_");
            if (d(replaceAll)) {
                return replaceAll;
            }
        } else {
            if (i != 1 || c(str)) {
                return str;
            }
            String replaceAll2 = w.matcher(str).replaceAll("_");
            if (c(replaceAll2)) {
                return replaceAll2;
            }
        }
        return null;
    }

    public static void b(String str, String str2, ba1.a aVar, f fVar) {
        aVar.b(str);
        if (fVar.w == 1) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(u, ba1.a.c(str)) >= 0) {
                return;
            }
        }
        aVar.b("=\"");
        if (str2 == null) {
            str2 = "";
        }
        l.c(aVar, str2, fVar, 2);
        aVar.a('\"');
    }

    public static boolean c(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || ((charAt >= 127 && charAt <= 159) || charAt == ' ' || charAt == '\"' || charAt == '\'' || charAt == '/' || charAt == '=')) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        char charAt = str.charAt(0);
        if ((charAt < 'a' || charAt > 'z') && !((charAt >= 'A' && charAt <= 'Z') || charAt == '_' || charAt == ':')) {
            return false;
        }
        for (int i = 1; i < length; i++) {
            char charAt2 = str.charAt(i);
            if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '-' || charAt2 == '_' || charAt2 == ':' || charAt2 == '.'))) {
                return false;
            }
        }
        return true;
    }

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (Objects.equals(this.r, aVar.r) && Objects.equals(this.s, aVar.s)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.r;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        String str = this.s;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return Objects.hash(this.r, this.s);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i;
        String str = (String) obj;
        String str2 = this.r;
        String str3 = this.s;
        b bVar = this.t;
        if (bVar != null && (i = bVar.i(str2)) != -1) {
            str3 = this.t.e(str2);
            this.t.t[i] = str;
        }
        this.s = str;
        return str3 == null ? "" : str3;
    }

    public final String toString() {
        StringBuilder a = ba1.h.a();
        ba1.a e = ba1.a.e(a);
        f fVar = new f();
        String str = this.r;
        String str2 = this.s;
        String a2 = a(str, fVar.w);
        if (a2 != null) {
            b(a2, str2, e, fVar);
        }
        return ba1.h.k(a);
    }
}
