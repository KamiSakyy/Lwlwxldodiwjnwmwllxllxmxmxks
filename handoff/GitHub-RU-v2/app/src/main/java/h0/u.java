package h0;

/* loaded from: /home/user/work/p/classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final p0.f f25185a;

    /* renamed from: b, reason: collision with root package name */
    public final v71.l f25186b;

    public u(p0.f fVar, v71.l lVar) {
        this.f25185a = fVar;
        this.f25186b = lVar;
    }

    public final String toString() {
        String str;
        v71.l lVar = this.f25186b;
        v71.y w02 = lVar.v.w0(v71.y.t);
        String str2 = w02 != null ? w02.s : null;
        StringBuilder sb2 = new StringBuilder("Request@");
        int hashCode = hashCode();
        sy.r.m(16);
        String num = Integer.toString(hashCode, 16);
        k71.k.f(num, "toString(...)");
        sb2.append(num);
        if (str2 == null || (str = f1.e.z("[", str2, "](")) == null) {
            str = "(";
        }
        sb2.append(str);
        sb2.append("currentBounds()=");
        sb2.append(this.f25185a.a());
        sb2.append(", continuation=");
        sb2.append(lVar);
        sb2.append(')');
        return sb2.toString();
    }
}
