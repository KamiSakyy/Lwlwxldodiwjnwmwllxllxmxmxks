package x6;

/* loaded from: /home/user/work/p/classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f33812a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33813b;

    /* renamed from: c, reason: collision with root package name */
    public int f33814c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33815d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33816e;

    /* renamed from: f, reason: collision with root package name */
    public int f33817f;

    /* renamed from: g, reason: collision with root package name */
    public int f33818g;

    /* renamed from: h, reason: collision with root package name */
    public int f33819h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public String f33820j;

    /* renamed from: k, reason: collision with root package name */
    public r71.b f33821k;

    public d0(boolean z10, boolean z11, int i, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this.f33812a = z10;
        this.f33813b = z11;
        this.f33814c = i;
        this.f33815d = z12;
        this.f33816e = z13;
        this.f33817f = i10;
        this.f33818g = i11;
        this.f33819h = i12;
        this.i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f33812a == d0Var.f33812a && this.f33813b == d0Var.f33813b && this.f33814c == d0Var.f33814c && k71.k.b(this.f33820j, d0Var.f33820j) && k71.k.b(this.f33821k, d0Var.f33821k) && this.f33815d == d0Var.f33815d && this.f33816e == d0Var.f33816e && this.f33817f == d0Var.f33817f && this.f33818g == d0Var.f33818g && this.f33819h == d0Var.f33819h && this.i == d0Var.i;
    }

    public final int hashCode() {
        int i = (((((this.f33812a ? 1 : 0) * 31) + (this.f33813b ? 1 : 0)) * 31) + this.f33814c) * 31;
        String str = this.f33820j;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        r71.b bVar = this.f33821k;
        return ((((((((((((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 961) + (this.f33815d ? 1 : 0)) * 31) + (this.f33816e ? 1 : 0)) * 31) + this.f33817f) * 31) + this.f33818g) * 31) + this.f33819h) * 31) + this.i;
    }

    public final String toString() {
        String str = this.f33820j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d0.class.getSimpleName());
        sb2.append("(");
        if (this.f33812a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f33813b) {
            sb2.append("restoreState ");
        }
        if ((str != null || this.f33814c != -1) && str != null) {
            sb2.append("popUpTo(");
            sb2.append(str);
            if (this.f33815d) {
                sb2.append(" inclusive");
            }
            if (this.f33816e) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        int i = this.i;
        int i10 = this.f33819h;
        int i11 = this.f33818g;
        int i12 = this.f33817f;
        if (i12 != -1 || i11 != -1 || i10 != -1 || i != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i12));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i11));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(i10));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(i));
            sb2.append(")");
        }
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }
    public Object k = null;
}
