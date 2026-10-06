package mn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p {
    public static final o Companion = new o();
    public List a;
    public String b;
    public boolean c;
    public String d;
    public q e;
    public String f;
    public String g;
    public boolean h;

    public p(List list, String str, boolean z, String str2, q qVar, String str3) {
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = qVar;
        this.f = str3;
        this.g = str == null ? str2 : str;
        boolean z2 = true;
        if (z && (str3 == null || t71.p.T(str3))) {
            z2 = false;
        }
        this.h = z2;
    }
}
