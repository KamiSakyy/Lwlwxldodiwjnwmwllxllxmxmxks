package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public String f22483a;

    /* renamed from: b, reason: collision with root package name */
    public String f22484b;

    /* renamed from: c, reason: collision with root package name */
    public v9 f22485c;

    public aa(String str, String str2, v9 v9Var) {
        this.f22483a = str;
        this.f22484b = str2;
        this.f22485c = v9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aa.class != obj.getClass()) {
            return false;
        }
        aa aaVar = (aa) obj;
        return k71.k.b(this.f22483a, aaVar.f22483a) && k71.k.b(this.f22484b, aaVar.f22484b) && this.f22485c == aaVar.f22485c;
    }

    public final int hashCode() {
        int hashCode = this.f22483a.hashCode() * 31;
        String str = this.f22484b;
        return this.f22485c.hashCode() + x.i.e((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, false);
    }
    public Object f(Object p1) { return null; }
}
