package s91;

import a0.s0;
import java.util.List;
import k71.k;
import org.intellij.markdown.MarkdownParsingException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final /* synthetic */ l51.h e;

    public c(l51.h hVar, int i, int i2, int i3) {
        this.e = hVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        String str = (String) ((List) hVar.t).get(i);
        this.d = str;
        if (i2 < -1 || i2 >= str.length()) {
            throw new MarkdownParsingException("");
        }
    }

    public final Integer a() {
        int i = this.b;
        int max = Math.max(i, 0);
        while (true) {
            String str = this.d;
            if (max >= str.length()) {
                return null;
            }
            char charAt = str.charAt(max);
            if (charAt != ' ' && charAt != '\t') {
                return Integer.valueOf(max - i);
            }
            max++;
        }
    }

    public final String b() {
        String substring = this.d.substring(this.b);
        k.f(substring, "substring(...)");
        return substring;
    }

    public final Integer c() {
        if (this.a + 1 < ((List) this.e.t).size()) {
            return Integer.valueOf((this.d.length() - this.b) + this.c);
        }
        return null;
    }

    public final int d() {
        return (this.d.length() - this.b) + this.c;
    }

    public final c e() {
        Integer c = c();
        if (c != null) {
            return f(c.intValue() - this.c);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && obj.getClass() == c.class && this.c == ((c) obj).c;
    }

    public final c f(int i) {
        c cVar = this;
        while (i != 0) {
            int i2 = cVar.b;
            int i3 = i2 + i;
            String str = cVar.d;
            int length = str.length();
            l51.h hVar = this.e;
            int i4 = cVar.c;
            int i5 = cVar.a;
            if (i3 < length) {
                return new c(hVar, i5, i2 + i, i4 + i);
            }
            if (cVar.c() == null) {
                return null;
            }
            int length2 = str.length() - i2;
            i -= length2;
            cVar = new c(hVar, i5 + 1, -1, i4 + length2);
        }
        return cVar;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        String substring;
        StringBuilder sb = new StringBuilder("Position: '");
        String str = this.d;
        int i = this.b;
        if (i == -1) {
            substring = f1.e.g("\\n", str);
        } else {
            substring = str.substring(i);
            k.f(substring, "substring(...)");
        }
        return s0.m(sb, substring, '\'');
    }
}
