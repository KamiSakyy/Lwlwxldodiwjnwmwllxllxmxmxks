package t81;

import k71.k;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class a {
    public final String a;
    public final boolean b;
    public c c;
    public long d;

    public a(String str, boolean z) {
        k.g(str, "name");
        this.a = str;
        this.b = z;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.a;
    }
}
