package q81;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes5.dex */
public final class o {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    public o(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        String substring = str.substring(t71.p.Q(str, ':', length, 4) + 1, t71.p.Q(str, '@', 0, 6));
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int Q = t71.p.Q(str, '/', length, 4);
        String substring = str.substring(Q, r81.e.c(Q, str.length(), str, "?#"));
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int Q = t71.p.Q(str, '/', length, 4);
        int c = r81.e.c(Q, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (Q < c) {
            int i = Q + 1;
            int d = r81.e.d(str, '/', i, c);
            String substring = str.substring(i, d);
            k71.k.f(substring, "substring(...)");
            arrayList.add(substring);
            Q = d;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int Q = t71.p.Q(str, '?', 0, 6) + 1;
        String substring = str.substring(Q, r81.e.d(str, '#', Q, str.length()));
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        String substring = str.substring(length, r81.e.c(length, str.length(), str, ":@"));
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && k71.k.b(((o) obj).i, this.i);
    }

    public final l7.e f(String str) {
        k71.k.g(str, "link");
        try {
            l7.e eVar = new l7.e(1);
            eVar.k(this, str);
            return eVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String g() {
        l7.e f = f("/...");
        k71.k.d(f);
        f.f = f91.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        f.g = f91.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return f.c().i;
    }

    public final URI h() {
        String substring;
        String str;
        l7.e eVar = new l7.e(1);
        ArrayList arrayList = (ArrayList) eVar.c;
        String str2 = this.a;
        eVar.e = str2;
        eVar.f = e();
        eVar.g = a();
        eVar.h = this.d;
        k71.k.g(str2, "scheme");
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i2 = this.e;
        eVar.b = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        eVar.d = d != null ? l7.e.l(f91.a.a(d, 0, 0, " \"'<>#", 83)) : null;
        if (this.h == null) {
            substring = null;
        } else {
            String str3 = this.i;
            substring = str3.substring(t71.p.Q(str3, '#', 0, 6) + 1);
            k71.k.f(substring, "substring(...)");
        }
        eVar.i = substring;
        String str4 = (String) eVar.h;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            k71.k.f(compile, "compile(...)");
            str = compile.matcher(str4).replaceAll("");
            k71.k.f(str, "replaceAll(...)");
        } else {
            str = null;
        }
        eVar.h = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, f91.a.a((String) arrayList.get(i3), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = (ArrayList) eVar.d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str5 != null ? f91.a.a(str5, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str6 = (String) eVar.i;
        eVar.i = str6 != null ? f91.a.a(str6, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String eVar2 = eVar.toString();
        try {
            return new URI(eVar2);
        } catch (URISyntaxException e) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                k71.k.f(compile2, "compile(...)");
                k71.k.g(eVar2, "input");
                String replaceAll = compile2.matcher(eVar2).replaceAll("");
                k71.k.f(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                k71.k.d(create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }
}
