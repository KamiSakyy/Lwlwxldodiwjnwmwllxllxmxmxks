package ea1;

import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes5.dex */
public final class h extends n {
    public String a;
    public Pattern b;

    public h(String str, Pattern pattern) {
        this.a = ba1.a.d(str);
        this.b = pattern;
    }

    @Override // ea1.n
    public final int a() {
        return 8;
    }

    public final String toString() {
        return x.i.g("[", this.a, "~=", this.b.toString(), "]");
    }
}
