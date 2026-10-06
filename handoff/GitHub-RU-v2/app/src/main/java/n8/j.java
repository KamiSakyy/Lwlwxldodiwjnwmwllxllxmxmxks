package n8;

import a0.s0;
import java.math.BigInteger;
import k71.k;
import sy.w;
import w61.p;

/* loaded from: /home/user/work/p/classes.dex */
public final class j implements Comparable {

    /* renamed from: w, reason: collision with root package name */
    public static final j f29667w;

    /* renamed from: r, reason: collision with root package name */
    public int f29668r;

    /* renamed from: s, reason: collision with root package name */
    public int f29669s;

    /* renamed from: t, reason: collision with root package name */
    public int f29670t;

    /* renamed from: u, reason: collision with root package name */
    public String f29671u;

    /* renamed from: v, reason: collision with root package name */
    public final p f29672v = w.t(new ma.a(2, this));

    static {
        new j(0, 0, 0, "");
        f29667w = new j(0, 1, 0, "");
        new j(1, 0, 0, "");
    }

    public j(int i, int i10, int i11, String str) {
        this.f29668r = i;
        this.f29669s = i10;
        this.f29670t = i11;
        this.f29671u = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        k.g(jVar, "other");
        Object value = this.f29672v.getValue();
        k.f(value, "getValue(...)");
        Object value2 = jVar.f29672v.getValue();
        k.f(value2, "getValue(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f29668r == jVar.f29668r && this.f29669s == jVar.f29669s && this.f29670t == jVar.f29670t;
    }

    public final int hashCode() {
        return ((((527 + this.f29668r) * 31) + this.f29669s) * 31) + this.f29670t;
    }

    public final String toString() {
        String str = this.f29671u;
        String g7 = !t71.p.T(str) ? f1.e.g("-", str) : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29668r);
        sb2.append('.');
        sb2.append(this.f29669s);
        sb2.append('.');
        return s0.l(sb2, this.f29670t, g7);
    }
}
