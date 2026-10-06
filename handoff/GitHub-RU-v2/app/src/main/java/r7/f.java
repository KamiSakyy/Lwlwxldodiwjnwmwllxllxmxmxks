package r7;

import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements Comparable {

    /* renamed from: r, reason: collision with root package name */
    public final int f31202r;

    /* renamed from: s, reason: collision with root package name */
    public final int f31203s;

    /* renamed from: t, reason: collision with root package name */
    public final String f31204t;

    /* renamed from: u, reason: collision with root package name */
    public final String f31205u;

    public f(int i, int i10, String str, String str2) {
        k.g(str, "from");
        k.g(str2, "to");
        this.f31202r = i;
        this.f31203s = i10;
        this.f31204t = str;
        this.f31205u = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        k.g(fVar, "other");
        int i = this.f31202r - fVar.f31202r;
        return i == 0 ? this.f31203s - fVar.f31203s : i;
    }
    public static final Object J = null;
    public Object t = null;
    public Object u = null;
}
